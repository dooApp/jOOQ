package org.jooq.impl;

import org.jooq.Condition;
import org.jooq.Field;
import org.jooq.Select;
import org.jooq.TableLike;
import org.jooq.impl.jpa.JPAUtils;
import org.jooq.jpa.JPATable;

import java.util.*;

/**
 * TODO write documentation<br>
 *<br>
 * Created at 05/08/13 11:38.<br>
 *
 * @author Kevin
 * @since 2.10
 *
 */
public class JPAQueryFactory {

	public static Condition createDiscriminatorValuesCondition(JPATable jpaTable) {
		String discriminatorColumn = JPAUtils.getDiscriminatorColumn(jpaTable.getEntityClass());
		Field<String> discriminatorField = (Field<String>) jpaTable.field(discriminatorColumn);
		if (discriminatorField == null) {
			return new TrueCondition();
		}
		Condition discriminatorFieldValueCondition = discriminatorField.eq(jpaTable.getDiscriminatorValue());
		for (Object inheritedTable : jpaTable.getInheritedTables()) {
			discriminatorFieldValueCondition = discriminatorFieldValueCondition.or(discriminatorField.eq(
					((JPATable<?>) inheritedTable).getDiscriminatorValue()));
		}
		return discriminatorFieldValueCondition;
	}

	// TODO translate it
	// recuperer tous les champs de toutes les tables , si un champ de meme nom existe , ne pas l'ajouter
	// pour chaque table creer la requete en ajoutant les champs manquant
	// construire la requete finale en faisant l'union de toutes les requetes.
	public static Select createTablePerClassBasedSelect(JPATable<?> discriminator) {
		List<JPATable> tables = new ArrayList(discriminator.getInheritedTables());
		tables.add(discriminator);
		Map fields = mapExistingFieldsByName(tables);
		List selects = new ArrayList();
		for (Object tableObj : tables) {
			JPATable table = (JPATable) tableObj;
			Set missingFields = getMissingFields(fields, table);
			missingFields.removeAll(Arrays.asList(table.fields()));   //useless
			Set fakeMissingFields = createFakeMissingFields(missingFields);
			fakeMissingFields.addAll(Arrays.asList(table.fields()));
			fakeMissingFields.add(createClassField(table));
			Select select;
			if (table != discriminator) { // to skip infinite loop
				select = DSL.select(fakeMissingFields).from(table);
			}
			else {
				select = createDiscriminatorValuesBasedSelect(table, fakeMissingFields);
			}
			selects.add(select);
		}
		Select unionOfAllSelect = (Select) selects.get(0);
		for (int i = 1; i < selects.size(); i++) {
			unionOfAllSelect = unionOfAllSelect.union((Select) selects.get(i));
		}
		return unionOfAllSelect;
	}

	private static Select createDiscriminatorValuesBasedSelect(JPATable jpaTable, Set fields) {
		Condition discriminatorFieldValueCondition = createDiscriminatorValuesCondition(jpaTable);
		return DSL.select(fields).from((TableLike) jpaTable).where(discriminatorFieldValueCondition);
	}

	/**
	 * Given a set of missing fields, returns a new set with "fake" fields.
	 * <br>
	 * We mean by "fake" field, a field that alias the field name with with a null value.
	 * <br>
	 * Equivalent in sql : null as field_name
	 * @param missingFields
	 * @return
	 */
	private static Set createFakeMissingFields(Set missingFields) {
		Set fakeMissingFields = new HashSet();
		for (Object missingFieldObj : missingFields) {
			Field missingField = (Field) missingFieldObj;
			fakeMissingFields.add(DSL.value(null).as(missingField.getName()));
		}
		return fakeMissingFields;
	}

	private static Field<String> createClassField(JPATable table) {
		return DSL.value(table.getEntityClass().getCanonicalName()).as("__JPA_CLASS");
	}

	private static Set getMissingFields(Map fields, JPATable table) {
		Set missingFields = new HashSet();
		for (Object field : fields.values()) {
			boolean present = false;
			for (Field missingField : table.fields()) {
				if (missingField.getName().equals(((Field) field).getName())) {
					present = true;
				}
			}
			if (!present) {
				missingFields.add(field);
			}
		}
		return missingFields;
	}

	private static Map mapExistingFieldsByName(List<JPATable> tables) {
		Map fields = new HashMap();
		for (Object tableObj : tables) {
			JPATable table = (JPATable) tableObj;
			for (Field field : table.fields()) {
				if (!fields.containsKey(field.getName())) {
					fields.put(field.getName(), field);
				}
			}
		}
		return fields;
	}
}
