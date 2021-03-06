package org.jooq.util.maven.jpa.writer;

import org.jooq.util.JavaWriter;
import org.jooq.util.maven.jpa.model.JPAEntity;
import org.reflections.Reflections;

import javax.persistence.InheritanceType;
import java.io.File;
import java.util.Set;

/**
 * TODO write documentation<br>
 *<br>
 * Created at 09/08/13 14:56.<br>
 *
 * @author Kevin
 * @since 2.10
 *
 */
public class EntityFileWriter {

	private final JPAEntity jpaEntity;

	private final File directory;

	private final String packageName;

	private final String jooqPackageName;

	private JavaWriter out;

	public EntityFileWriter(JPAEntity jpaEntity, File directory, String packageName, String jooqPackageName) {
		this.jpaEntity = jpaEntity;
		this.directory = directory;
		this.packageName = packageName;
		this.jooqPackageName = jooqPackageName;
	}

	public void close() {
		out.println("}");
		out.close();
	}

	public void open() {
		out = new JavaWriter(new File(directory, jpaEntity.getJpaEntityName() + ".java"));
		out.javadoc("This class is generated by jOOQ");
		out.println("package %s;", packageName);
		out.println("import org.jooq.jpa.JPATable;");
		out.println("import javax.persistence.InheritanceType;");
		out.println("import java.util.ArrayList;");
		out.println("import java.util.List;");
		// generate the table representation with the class name pointing to the jooq table name
		//printClassJavadoc(out, jpaEntity.getEntityClassName() + " JPA JOOQ Table representation.");
		out.println("public class %s extends %s implements JPATable<%s>{", jpaEntity.getJpaEntityName(),
				jooqPackageName + ".tables." + jpaEntity.getJooqEntityName(), jooqPackageName + ".tables.records." + jpaEntity
				.getJooqRecordName());
	}

	public void generateContent(Reflections reflection) {
		generateJPATableContent(jpaEntity, reflection);
	}

	private void generateJPATableContent(JPAEntity JPAEntity, Reflections reflection) {
		generateSingleton(JPAEntity, out);
		generateInheritance(JPAEntity, out);
		generateDiscriminatorValue(JPAEntity, out);
		generateDiscriminatorColumn(JPAEntity, out);
		generateInheritedTables((Set<Class<?>>) reflection.getSubTypesOf(jpaEntity.getJpaClass()), out);
		generateTableName(JPAEntity, out);
		generateEntityClass(JPAEntity, out);
		generateParentTable(JPAEntity, out);
		generateParentInheritanceType(JPAEntity, out);
	}

	private void generateSingleton(JPAEntity JPAEntity, JavaWriter out) {
		out.println("public static final %s %s = new %s();", JPAEntity.getJpaEntityName(),
				JPAEntity.getTableName(),
				JPAEntity.getJpaEntityName());
		if (InheritanceType.SINGLE_TABLE.equals(JPAEntity.getParentInheritanceStrategy())) {
			JPAEntity parentEntity = JPAEntity.getParentEntity();
			if (parentEntity != null && !parentEntity.getTableName().equals(JPAEntity.getTableName())) {
				out.println("private static final %s %s = new %s();", JPAEntity.getJpaEntityName(),
						parentEntity.getTableName(),
						JPAEntity.getJpaEntityName());
			}
		}
	}

	private void generateEntityClass(JPAEntity JPAEntity, JavaWriter out) {
		out.println("@Override");
		out.println("public Class getEntityClass() {");
		out.println("return %s.class;", JPAEntity.getJpaClass().getCanonicalName());
		out.println("}");
	}

	private void generateParentTable(JPAEntity JPAEntity, JavaWriter out) {
		out.println("@Override");
		out.println("public JPATable<?> getParentTable() {");
		JPAEntity parentEntity = JPAEntity.getParentEntity();
		if (parentEntity != null) {
			out.println("return %s;", parentEntity.getJpaEntityName() + "." + parentEntity.getTableName());
		}
		else {
			out.println("return null;");
		}
		out.println("}");
	}

	private void generateParentInheritanceType(JPAEntity JPAEntity, JavaWriter out) {
		out.println("@Override");
		out.println("public InheritanceType getParentInheritanceType() {");
		out.println("	return InheritanceType.%s;", JPAEntity.getParentInheritanceStrategy());
		out.println("}");
	}

	private void generateTableName(JPAEntity JPAEntity, JavaWriter out) {
		out.println("@Override");
		out.println("public String getTableName() {");
		out.println("	return \"%s\";", JPAEntity.getTableName());
		out.println("}");
	}

	private void generateInheritedTables(Set<Class<?>> inheritedClasses, JavaWriter out) {
		out.println("@Override");
		out.println("public List<JPATable<?>> getInheritedTables() {");
		out.println("	List<JPATable<?>> result = new ArrayList<JPATable<?>>();");
		for (Class<?> inheritedClass : inheritedClasses) {
			JPAEntity entity = new JPAEntity(inheritedClass);
			out.println("	result.add((JPATable<?>) %s.%s);", entity.getJpaEntityName(),
					entity.getTableName());
		}
		out.println("	return result;");
		out.println("}");
	}

	private void generateDiscriminatorColumn(JPAEntity JPAEntity, JavaWriter out) {
		out.println("@Override");
		out.println("public String getDiscriminatorColumn() {");
		out.println("	return \"%s\"; ", JPAEntity.getDiscriminatorColumn());
		out.println("}");
	}

	private void generateDiscriminatorValue(JPAEntity JPAEntity, JavaWriter out) {
		out.println("@Override");
		out.println("public String getDiscriminatorValue() {");
		out.println("	return \"%s\"; ", JPAEntity.getDiscriminatorValue());
		out.println("}");
	}

	private void generateInheritance(JPAEntity JPAEntity, JavaWriter out) {
		out.println("@Override");
		out.println("public InheritanceType getInheritanceType() {");
		out.println("	return InheritanceType.%s;", JPAEntity.getInheritanceStrategy());
		out.println("}");
	}
}
