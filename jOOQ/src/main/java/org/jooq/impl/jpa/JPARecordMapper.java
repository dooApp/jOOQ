package org.jooq.impl.jpa;

import org.jooq.Record;
import org.jooq.RecordMapper;
import org.jooq.exception.MappingException;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.InheritanceType;

import static org.jooq.tools.reflect.Reflect.accessible;

/**
 * TODO write documentation<br>
 * <br>
 * Created at 29/07/13 16:30.<br>
 *
 * @author Christophe DUFOUR
 * @since 1.1
 */
public class JPARecordMapper<R extends Record, E> implements RecordMapper<R, E> {

	/**
	 * @see {@link javax.persistence.DiscriminatorColumn}
	 */
	private static final String DEFAULT_DISCRIMINATOR_COLUMN_NAME = "DTYPE";

	private final Class<? extends E> type;

	public JPARecordMapper(Class<? extends E> type) {
		if (!isAnEntity(type)) {
			throw new MappingException("Unable to map " + type + " as far as is not annotated with @Entity");
		}
		this.type = type;
	}

	@Override
	public E map(R record) {
		Class<? extends E> realType = getRealType(type, record);
		E result = null;
		try {
			result = accessible(realType.getDeclaredConstructor()).newInstance();
		} catch (Exception e) {
			throw new MappingException("Unable to find no args public constructor on type " + realType, e);
		}
		try {
			for (Setter<E, R> setter : JPAUtils.<E, R>getSetter(result)) {
				setter.set(result, record);
			}
			//TODO find all non transient (superclass included) field
			//TODO Set value to all fields
			//TODO call an empty method to handle relationShip
			return result;
		} catch (Exception e) {
			throw new MappingException("An error ocurred when mapping record to " + type, e);
		}
	}

	/**
	 * Get the real type linked from the inheritance strategy.
	 *
	 * @param type   the initial type
	 * @param record the record with data
	 * @return the real class linked to the record
	 */
	public Class<? extends E> getRealType(Class<? extends E> type, R record) {
		InheritanceType inheritanceType = JPAUtils.getParentInheritenceStrategy(type);
		switch (inheritanceType) {
			case SINGLE_TABLE: {
				String discriminatorColumn = JPAUtils.getDiscriminatorColumn(type);
				String discriminatorValue = JPAUtils.getDiscriminatorValue(type);
				if (discriminatorValue.equals(record.getValue(discriminatorColumn))) {
					return type;
				}
				for (Class<? extends E> c : JPAUtils.getSubTypeOf(type)) {
					try {
						if (c.getAnnotation(DiscriminatorValue.class).value().equals(record.getValue(discriminatorColumn))) {
							return c;
						}
					} catch (NullPointerException e) {
						//TODO log there is an child entity without @DiscriminatorValue
					}
				}
				throw new MappingException("Unable to get real type for parent " + type + " with discriminator value " +
						record.getValue(discriminatorColumn));
			}
			case TABLE_PER_CLASS: {
				String jpaClass = type.getCanonicalName();
				try {
					jpaClass = record.getValue("__JPA_CLASS", String.class);
				} catch (Exception e) {
				}
				if (type.getCanonicalName().equals(jpaClass)) {
					return type;
				}
				for (Class<? extends E> c : JPAUtils.getSubTypeOf(type)) {
					if (c.getCanonicalName().equals(jpaClass)) {
						return c;
					}
				}
				return type;
			}
			case JOINED: {
				return type;
			}
			default: {
				return type;
			}
		}
	}

	/**
	 * @param type the class we will analysis
	 * @return true if the class is annotated with @Entity
	 */
	private boolean isAnEntity(Class<?> type) {
		return type.getAnnotation(Entity.class) != null;
	}
}
