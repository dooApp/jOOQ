package org.jooq.util.maven.jpa.model;

import org.jooq.tools.StringUtils;
import org.jooq.util.maven.jpa.util.JPAUtils;

import javax.persistence.InheritanceType;

/**
 * TODO write documentation<br>
 *<br>
 * Created at 09/08/13 14:22.<br>
 *
 * @author Kevin
 * @since 2.10
 *
 */
public class JPAEntity {

	public static final String JPA_ENTITY_SUFFIXE = "JPATable";

	public static final String JOOQ_RECORD_SUFFIXE = "Record";

	private final String jooqEntityName;

	private final String jooqRecordName;

	private final String tableName;

	private final InheritanceType parentInheritanceStrategy;

	private final InheritanceType inheritanceStrategy;

	private final String jpaEntityName;

	private JPAEntity parentEntity;

	private String discriminatorValue;

	private String discriminatorColumn;

	private String parentClassName;

	private String className;

	private String parentTableName;

	private Class<?> jpaClass;

	public JPAEntity(Class<?> jpaClass) {
		this.jpaClass = jpaClass;
		className = jpaClass.getSimpleName();
		jpaEntityName = className + JPA_ENTITY_SUFFIXE;
		if (!JPAUtils.isAnnotatedByTable(jpaClass)) {
			tableName = JPAUtils.getTableName(jpaClass);
			String cc = StringUtils.toCamelCase(tableName.toLowerCase());
			jooqEntityName = JPAUtils.formatToJavaClassNameAsJOOQ(cc);//JPAUtils.formatToJavaClassName(tableName);
		}
		else {
			tableName = JPAUtils.getTableName(jpaClass);
			String cc = StringUtils.toCamelCase(tableName.toLowerCase());
			jooqEntityName = JPAUtils.formatToJavaClassNameAsJOOQ(cc);//JPAUtils.formatToJavaClassName(tableName);
		}
		jooqRecordName = jooqEntityName + JOOQ_RECORD_SUFFIXE;
		parentInheritanceStrategy = JPAUtils.getParentInheritenceStrategy(jpaClass);
		inheritanceStrategy = JPAUtils.getInheritenceStrategy(jpaClass);
		discriminatorValue = JPAUtils.getDiscriminatorValue(jpaClass);
		discriminatorColumn = JPAUtils.getDiscriminatorColumn(jpaClass);
		Class<?> parentClass = JPAUtils.getJPASuperClass(jpaClass);
		if (parentClass != null) {
			parentEntity = new JPAEntity(parentClass);
		}
	}

	public String getJooqEntityName() {
		return jooqEntityName;
	}

	public String getJooqRecordName() {
		return jooqRecordName;
	}

	public String getTableName() {
		return tableName;
	}

	public InheritanceType getParentInheritanceStrategy() {
		return parentInheritanceStrategy;
	}

	public InheritanceType getInheritanceStrategy() {
		return inheritanceStrategy;
	}

	public String getDiscriminatorValue() {
		return discriminatorValue;
	}

	public String getDiscriminatorColumn() {
		return discriminatorColumn;
	}

	public String getClassName() {
		return className;
	}

	public Class<?> getJpaClass() {
		return jpaClass;
	}

	public String getJpaEntityName() {
		return jpaEntityName;
	}

	public JPAEntity getParentEntity() {
		return parentEntity;
	}
}
