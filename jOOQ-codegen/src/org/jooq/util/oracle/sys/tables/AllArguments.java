/**
 * This class is generated by jOOQ
 */
package org.jooq.util.oracle.sys.tables;


import java.math.BigDecimal;

import javax.annotation.Generated;

import org.jooq.SQLDialect;
import org.jooq.TableField;
import org.jooq.impl.TableFieldImpl;
import org.jooq.impl.TableImpl;
import org.jooq.util.oracle.sys.Sys;
import org.jooq.util.oracle.sys.tables.records.AllArgumentsRecord;


/**
 * This class is generated by jOOQ.
 *
 * Arguments in object accessible to the user
 */
@Generated(value    = "http://jooq.sourceforge.net",
           comments = "This class is generated by jOOQ")
public class AllArguments extends TableImpl<AllArgumentsRecord> {

	private static final long serialVersionUID = -246992226;

	/**
	 * The singleton instance of ALL_ARGUMENTS
	 */
	public static final AllArguments ALL_ARGUMENTS = new AllArguments();

	/**
	 * The class holding records for this type
	 */
	private static final Class<AllArgumentsRecord> __RECORD_TYPE = AllArgumentsRecord.class;

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<AllArgumentsRecord> getRecordType() {
		return __RECORD_TYPE;
	}

	/**
	 * Username of the owner of the object
	 */
	public static final TableField<AllArgumentsRecord, String> OWNER = new TableFieldImpl<AllArgumentsRecord, String>(SQLDialect.ORACLE, "OWNER", String.class, ALL_ARGUMENTS);

	/**
	 * Procedure or function name
	 */
	public static final TableField<AllArgumentsRecord, String> OBJECT_NAME = new TableFieldImpl<AllArgumentsRecord, String>(SQLDialect.ORACLE, "OBJECT_NAME", String.class, ALL_ARGUMENTS);

	/**
	 * Package name
	 */
	public static final TableField<AllArgumentsRecord, String> PACKAGE_NAME = new TableFieldImpl<AllArgumentsRecord, String>(SQLDialect.ORACLE, "PACKAGE_NAME", String.class, ALL_ARGUMENTS);

	/**
	 * Object number of the object
	 */
	public static final TableField<AllArgumentsRecord, BigDecimal> OBJECT_ID = new TableFieldImpl<AllArgumentsRecord, BigDecimal>(SQLDialect.ORACLE, "OBJECT_ID", BigDecimal.class, ALL_ARGUMENTS);

	/**
	 * Overload unique identifier
	 */
	public static final TableField<AllArgumentsRecord, String> OVERLOAD = new TableFieldImpl<AllArgumentsRecord, String>(SQLDialect.ORACLE, "OVERLOAD", String.class, ALL_ARGUMENTS);

	/**
	 * Argument name
	 */
	public static final TableField<AllArgumentsRecord, String> ARGUMENT_NAME = new TableFieldImpl<AllArgumentsRecord, String>(SQLDialect.ORACLE, "ARGUMENT_NAME", String.class, ALL_ARGUMENTS);

	/**
	 * Position in argument list, or null for function return value
	 */
	public static final TableField<AllArgumentsRecord, BigDecimal> POSITION = new TableFieldImpl<AllArgumentsRecord, BigDecimal>(SQLDialect.ORACLE, "POSITION", BigDecimal.class, ALL_ARGUMENTS);

	/**
	 * Argument sequence, including all nesting levels
	 */
	public static final TableField<AllArgumentsRecord, BigDecimal> SEQUENCE = new TableFieldImpl<AllArgumentsRecord, BigDecimal>(SQLDialect.ORACLE, "SEQUENCE", BigDecimal.class, ALL_ARGUMENTS);

	/**
	 * Nesting depth of argument for composite types
	 */
	public static final TableField<AllArgumentsRecord, BigDecimal> DATA_LEVEL = new TableFieldImpl<AllArgumentsRecord, BigDecimal>(SQLDialect.ORACLE, "DATA_LEVEL", BigDecimal.class, ALL_ARGUMENTS);

	/**
	 * Datatype of the argument
	 */
	public static final TableField<AllArgumentsRecord, String> DATA_TYPE = new TableFieldImpl<AllArgumentsRecord, String>(SQLDialect.ORACLE, "DATA_TYPE", String.class, ALL_ARGUMENTS);

	/**
	 * Default value for the argument
	 */
	public static final TableField<AllArgumentsRecord, String> DEFAULT_VALUE = new TableFieldImpl<AllArgumentsRecord, String>(SQLDialect.ORACLE, "DEFAULT_VALUE", String.class, ALL_ARGUMENTS);

	/**
	 * Length of default value for the argument
	 */
	public static final TableField<AllArgumentsRecord, BigDecimal> DEFAULT_LENGTH = new TableFieldImpl<AllArgumentsRecord, BigDecimal>(SQLDialect.ORACLE, "DEFAULT_LENGTH", BigDecimal.class, ALL_ARGUMENTS);

	/**
	 * Argument direction (IN, OUT, or IN/OUT)
	 */
	public static final TableField<AllArgumentsRecord, String> IN_OUT = new TableFieldImpl<AllArgumentsRecord, String>(SQLDialect.ORACLE, "IN_OUT", String.class, ALL_ARGUMENTS);

	/**
	 * Length of the column in bytes
	 */
	public static final TableField<AllArgumentsRecord, BigDecimal> DATA_LENGTH = new TableFieldImpl<AllArgumentsRecord, BigDecimal>(SQLDialect.ORACLE, "DATA_LENGTH", BigDecimal.class, ALL_ARGUMENTS);

	/**
	 * Length: decimal digits (NUMBER) or binary digits (FLOAT)
	 */
	public static final TableField<AllArgumentsRecord, BigDecimal> DATA_PRECISION = new TableFieldImpl<AllArgumentsRecord, BigDecimal>(SQLDialect.ORACLE, "DATA_PRECISION", BigDecimal.class, ALL_ARGUMENTS);

	/**
	 * Digits to right of decimal point in a number
	 */
	public static final TableField<AllArgumentsRecord, BigDecimal> DATA_SCALE = new TableFieldImpl<AllArgumentsRecord, BigDecimal>(SQLDialect.ORACLE, "DATA_SCALE", BigDecimal.class, ALL_ARGUMENTS);

	/**
	 * Argument radix for a number
	 */
	public static final TableField<AllArgumentsRecord, BigDecimal> RADIX = new TableFieldImpl<AllArgumentsRecord, BigDecimal>(SQLDialect.ORACLE, "RADIX", BigDecimal.class, ALL_ARGUMENTS);

	/**
	 * Character set name for the argument
	 */
	public static final TableField<AllArgumentsRecord, String> CHARACTER_SET_NAME = new TableFieldImpl<AllArgumentsRecord, String>(SQLDialect.ORACLE, "CHARACTER_SET_NAME", String.class, ALL_ARGUMENTS);

	/**
	 * Owner name for the argument type in case of object types
	 */
	public static final TableField<AllArgumentsRecord, String> TYPE_OWNER = new TableFieldImpl<AllArgumentsRecord, String>(SQLDialect.ORACLE, "TYPE_OWNER", String.class, ALL_ARGUMENTS);

	/**
	 * Object name for the argument type in case of object types
	 */
	public static final TableField<AllArgumentsRecord, String> TYPE_NAME = new TableFieldImpl<AllArgumentsRecord, String>(SQLDialect.ORACLE, "TYPE_NAME", String.class, ALL_ARGUMENTS);

	/**
	 * Subordinate object name for the argument type in case of object types
	 */
	public static final TableField<AllArgumentsRecord, String> TYPE_SUBNAME = new TableFieldImpl<AllArgumentsRecord, String>(SQLDialect.ORACLE, "TYPE_SUBNAME", String.class, ALL_ARGUMENTS);

	/**
	 * Database link name for the argument type in case of object types
	 */
	public static final TableField<AllArgumentsRecord, String> TYPE_LINK = new TableFieldImpl<AllArgumentsRecord, String>(SQLDialect.ORACLE, "TYPE_LINK", String.class, ALL_ARGUMENTS);

	/**
	 * PL/SQL type name for numeric arguments
	 */
	public static final TableField<AllArgumentsRecord, String> PLS_TYPE = new TableFieldImpl<AllArgumentsRecord, String>(SQLDialect.ORACLE, "PLS_TYPE", String.class, ALL_ARGUMENTS);

	/**
	 * Character limit for string datatypes
	 */
	public static final TableField<AllArgumentsRecord, BigDecimal> CHAR_LENGTH = new TableFieldImpl<AllArgumentsRecord, BigDecimal>(SQLDialect.ORACLE, "CHAR_LENGTH", BigDecimal.class, ALL_ARGUMENTS);

	/**
	 * Is the byte limit (B) or char limit (C) official for this string?
	 */
	public static final TableField<AllArgumentsRecord, String> CHAR_USED = new TableFieldImpl<AllArgumentsRecord, String>(SQLDialect.ORACLE, "CHAR_USED", String.class, ALL_ARGUMENTS);

	/**
	 * No further instances allowed
	 */
	private AllArguments() {
		super(SQLDialect.ORACLE, "ALL_ARGUMENTS", Sys.SYS);
	}

}
