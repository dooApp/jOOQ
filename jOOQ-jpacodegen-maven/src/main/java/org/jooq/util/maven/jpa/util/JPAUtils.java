package org.jooq.util.maven.jpa.util;

import javax.persistence.*;

/**
 * TODO write documentation<br>
 *<br>
 * Created at 09/08/13 11:25.<br>
 *
 * @author Kevin
 * @since 2.10
 *
 */
public class JPAUtils {

	/**
	 * Returns the given string using the Java Class Name convention.<br>
	 * Example:<br>
	 *     myclassname gives Myclassname
	 *     my_class_name gives My_class_name
	 *     myCLASS gives MyCLASS
	 * @param string
	 * @return the given string formatted.
	 */
	public static String formatToJavaClassName(String string) {
		String[] underscores_split = string.split("_");
		if (underscores_split.length > 1) {
			String buffer = "";
			for (String s : underscores_split) {
				buffer += s.substring(0, 1).toUpperCase() + (s.substring(1, s.length()).toLowerCase());
			}
			return buffer;
		}
		else {
			return string.substring(0, 1).toUpperCase() + string.substring(1, string.length());
		}
	}

	/**
	 *   Returns the nearest parent name annotated with {@link javax.persistence.Table Table}.<br>
	 *   Returns the top of hierarchy class name if no annotation has been found.
	 * @param jpaClass
	 * @return
	 */
	public static String getSuperclassNameAnnotatedWithTable(Class<?> jpaClass) {
		if (jpaClass.getSuperclass().equals(Object.class) || jpaClass.getSuperclass().isAnnotationPresent
				(MappedSuperclass.class)) {
			return formatToJavaClassName(getTableName(jpaClass));
		}
		else {
			if (jpaClass.getSuperclass().isAnnotationPresent(Table.class)) {
				return formatToJavaClassName(jpaClass.getSuperclass().getAnnotation(Table.class).name().toLowerCase());
			}
			return getSuperclassNameAnnotatedWithTable(jpaClass.getSuperclass());
		}
	}

	/**
	 *   Returns the nearest parent table name annotated with {@link javax.persistence.Table Table}.<br>
	 *   Returns the top of hierarchy class name if no annotation has been found.
	 * @param jpaClass
	 * @return
	 */
	public static String getParentTable(Class<?> jpaClass) {
		if (jpaClass.getSuperclass().equals(Object.class) || jpaClass.getSuperclass().isAnnotationPresent
				(MappedSuperclass.class)) {
			if (jpaClass.isAnnotationPresent(Table.class)) {
				return jpaClass.getAnnotation(Table.class).name();
			}
			return jpaClass.getSimpleName();
		}
		else {
			if (jpaClass.getSuperclass().isAnnotationPresent(Table.class)) {
				return jpaClass.getSuperclass().getAnnotation(Table.class).name();
			}
			return getParentTable(jpaClass.getSuperclass());
		}
	}

	/**
	 * Returns the nearest parent inheritance strategy based on {@link Inheritance Inheritance annotation}.<br>
	 * Returns InheritanceType.SINGLE_TABLE if to strategy has been found in the hierarchy.
	 * @param jpaClass
	 * @return
	 */
	public static InheritanceType getParentInheritenceStrategy(Class<?> jpaClass) {
		if (jpaClass.getSuperclass().equals(Object.class) || jpaClass.getSuperclass().isAnnotationPresent
				(MappedSuperclass.class)) {
			if (jpaClass.isAnnotationPresent(Inheritance.class)) {
				return jpaClass.getAnnotation(Inheritance.class).strategy();
			}
			else {
				return InheritanceType.SINGLE_TABLE;
			}
		}
		else {
			if (jpaClass.getSuperclass().isAnnotationPresent(Inheritance.class)) {
				return jpaClass.getSuperclass().getAnnotation(Inheritance.class).strategy();
			}
			else {
				return getParentInheritenceStrategy(jpaClass.getSuperclass());
			}
		}
	}

	/**
	 * Returns the inheritance strategy based on {@link Inheritance Inheritance annotation}.<br>
	 * Returns InheritanceType.SINGLE_TABLE by default.
	 * @param jpaClass
	 * @return
	 */
	public static InheritanceType getInheritenceStrategy(Class<?> jpaClass) {
		if (jpaClass.isAnnotationPresent(Inheritance.class)) {
			return jpaClass.getAnnotation(Inheritance.class).strategy();
		}
		else {
			return InheritanceType.SINGLE_TABLE;
		}
	}

	/**
	 * Returns the nearest parent discriminator column name based on {@link DiscriminatorColumn DiscriminatorColumn annotation}.<br>
	 * Returns DTYPE if to discriminator column has been found in the hierarchy.
	 * @param jpaClass
	 * @return
	 */
	public static String getDiscriminatorColumn(Class<?> jpaClass) {
		if (jpaClass.getSuperclass().equals(Object.class) || jpaClass.getSuperclass().isAnnotationPresent
				(MappedSuperclass.class)) {
			if (jpaClass.isAnnotationPresent(DiscriminatorColumn.class)) {
				return jpaClass.getAnnotation(DiscriminatorColumn.class).name();
			}
			else {
				return "DTYPE";
			}
		}
		else {
			if (jpaClass.getSuperclass().isAnnotationPresent(DiscriminatorColumn.class)) {
				return jpaClass.getSuperclass().getAnnotation(DiscriminatorColumn.class).name();
			}
			else {
				return getDiscriminatorColumn(jpaClass.getSuperclass());
			}
		}
	}

	/**
	 * Returns the discriminator value based on {@link DiscriminatorValue DiscriminatorValue annotation}.<br>
	 * Returns the class name if no discriminator value has been found.
	 * @param jpaClass
	 * @return
	 */
	public static String getDiscriminatorValue(Class<?> jpaClass) {
		if (jpaClass.isAnnotationPresent(DiscriminatorValue.class)) {
			return jpaClass.getAnnotation(DiscriminatorValue.class).value();
		}
		else {
			return jpaClass.getSimpleName();
		}
	}

	public static String getJPAEntityName(Class<?> jpaClass) {
		return jpaClass.getSimpleName();
	}

	public static String getTableName(Class<?> jpaClass) {
		InheritanceType inheritanceType = getParentInheritenceStrategy(jpaClass);
		if (InheritanceType.SINGLE_TABLE.equals(inheritanceType)) {
			return getParentTable(jpaClass);
		}
		else {
			if (jpaClass.isAnnotationPresent(Table.class)) {
				return jpaClass.getAnnotation(Table.class).name();
			}
			return jpaClass.getSimpleName();
		}
	}

	public static Class<?> getJPASuperClass(Class<?> jpaClass) {
		Class<?> result = jpaClass.getSuperclass();
		if (result != null && !result.getClass().equals(Object.class) && !result.isAnnotationPresent(MappedSuperclass
				.class)) {
			return result;
		}
		else {
			return null;
		}
	}

	public static boolean isAnnotatedByTable(Class<?> jpaClass) {
		if (jpaClass.getSuperclass().equals(Object.class) || jpaClass.getSuperclass().isAnnotationPresent
				(MappedSuperclass.class)) {
			if (jpaClass.isAnnotationPresent(Table.class)) {
				return true;
			}
			return false;
		}
		else {
			if (jpaClass.getSuperclass().isAnnotationPresent(Table.class)) {
				return true;
			}
			return isAnnotatedByTable(jpaClass.getSuperclass());
		}
	}
}
