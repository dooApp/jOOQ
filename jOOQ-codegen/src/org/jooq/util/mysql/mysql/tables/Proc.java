/**
 * This class is generated by jOOQ
 */
package org.jooq.util.mysql.mysql.tables;


import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.SQLDialect;
import org.jooq.TableField;
import org.jooq.impl.TableFieldImpl;
import org.jooq.impl.TableImpl;
import org.jooq.util.mysql.mysql.Mysql;
import org.jooq.util.mysql.mysql.enums.ProcIsDeterministic;
import org.jooq.util.mysql.mysql.enums.ProcLanguage;
import org.jooq.util.mysql.mysql.enums.ProcSecurityType;
import org.jooq.util.mysql.mysql.enums.ProcSqlDataAccess;
import org.jooq.util.mysql.mysql.enums.ProcType;
import org.jooq.util.mysql.mysql.tables.records.ProcRecord;


/**
 * This class is generated by jOOQ.
 *
 * Stored Procedures
 */
@Generated(value    = "http://jooq.sourceforge.net",
           comments = "This class is generated by jOOQ")
public class Proc extends TableImpl<ProcRecord> {

	private static final long serialVersionUID = 832289760;

	/**
	 * The singleton instance of proc
	 */
	public static final Proc PROC = new Proc();

	/**
	 * The class holding records for this type
	 */
	private static final Class<ProcRecord> __RECORD_TYPE = ProcRecord.class;

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<ProcRecord> getRecordType() {
		return __RECORD_TYPE;
	}

	/**
	 * An uncommented item
	 */
	public static final TableField<ProcRecord, String> DB = new TableFieldImpl<ProcRecord, String>(SQLDialect.MYSQL, "db", String.class, PROC);

	/**
	 * An uncommented item
	 */
	public static final TableField<ProcRecord, String> NAME = new TableFieldImpl<ProcRecord, String>(SQLDialect.MYSQL, "name", String.class, PROC);

	/**
	 * An uncommented item
	 */
	public static final TableField<ProcRecord, ProcType> TYPE = new TableFieldImpl<ProcRecord, ProcType>(SQLDialect.MYSQL, "type", ProcType.class, PROC);

	/**
	 * An uncommented item
	 */
	public static final TableField<ProcRecord, String> SPECIFIC_NAME = new TableFieldImpl<ProcRecord, String>(SQLDialect.MYSQL, "specific_name", String.class, PROC);

	/**
	 * An uncommented item
	 */
	public static final TableField<ProcRecord, ProcLanguage> LANGUAGE = new TableFieldImpl<ProcRecord, ProcLanguage>(SQLDialect.MYSQL, "language", ProcLanguage.class, PROC);

	/**
	 * An uncommented item
	 */
	public static final TableField<ProcRecord, ProcSqlDataAccess> SQL_DATA_ACCESS = new TableFieldImpl<ProcRecord, ProcSqlDataAccess>(SQLDialect.MYSQL, "sql_data_access", ProcSqlDataAccess.class, PROC);

	/**
	 * An uncommented item
	 */
	public static final TableField<ProcRecord, ProcIsDeterministic> IS_DETERMINISTIC = new TableFieldImpl<ProcRecord, ProcIsDeterministic>(SQLDialect.MYSQL, "is_deterministic", ProcIsDeterministic.class, PROC);

	/**
	 * An uncommented item
	 */
	public static final TableField<ProcRecord, ProcSecurityType> SECURITY_TYPE = new TableFieldImpl<ProcRecord, ProcSecurityType>(SQLDialect.MYSQL, "security_type", ProcSecurityType.class, PROC);

	/**
	 * An uncommented item
	 */
	public static final TableField<ProcRecord, byte[]> PARAM_LIST = new TableFieldImpl<ProcRecord, byte[]>(SQLDialect.MYSQL, "param_list", byte[].class, PROC);

	/**
	 * An uncommented item
	 */
	public static final TableField<ProcRecord, byte[]> RETURNS = new TableFieldImpl<ProcRecord, byte[]>(SQLDialect.MYSQL, "returns", byte[].class, PROC);

	/**
	 * An uncommented item
	 */
	public static final TableField<ProcRecord, byte[]> BODY = new TableFieldImpl<ProcRecord, byte[]>(SQLDialect.MYSQL, "body", byte[].class, PROC);

	/**
	 * An uncommented item
	 */
	public static final TableField<ProcRecord, String> DEFINER = new TableFieldImpl<ProcRecord, String>(SQLDialect.MYSQL, "definer", String.class, PROC);

	/**
	 * An uncommented item
	 */
	public static final TableField<ProcRecord, Timestamp> CREATED = new TableFieldImpl<ProcRecord, Timestamp>(SQLDialect.MYSQL, "created", Timestamp.class, PROC);

	/**
	 * An uncommented item
	 */
	public static final TableField<ProcRecord, Timestamp> MODIFIED = new TableFieldImpl<ProcRecord, Timestamp>(SQLDialect.MYSQL, "modified", Timestamp.class, PROC);

	/**
	 * An uncommented item
	 */
	public static final TableField<ProcRecord, String> SQL_MODE = new TableFieldImpl<ProcRecord, String>(SQLDialect.MYSQL, "sql_mode", String.class, PROC);

	/**
	 * An uncommented item
	 */
	public static final TableField<ProcRecord, String> COMMENT = new TableFieldImpl<ProcRecord, String>(SQLDialect.MYSQL, "comment", String.class, PROC);

	/**
	 * An uncommented item
	 */
	public static final TableField<ProcRecord, String> CHARACTER_SET_CLIENT = new TableFieldImpl<ProcRecord, String>(SQLDialect.MYSQL, "character_set_client", String.class, PROC);

	/**
	 * An uncommented item
	 */
	public static final TableField<ProcRecord, String> COLLATION_CONNECTION = new TableFieldImpl<ProcRecord, String>(SQLDialect.MYSQL, "collation_connection", String.class, PROC);

	/**
	 * An uncommented item
	 */
	public static final TableField<ProcRecord, String> DB_COLLATION = new TableFieldImpl<ProcRecord, String>(SQLDialect.MYSQL, "db_collation", String.class, PROC);

	/**
	 * An uncommented item
	 */
	public static final TableField<ProcRecord, byte[]> BODY_UTF8 = new TableFieldImpl<ProcRecord, byte[]>(SQLDialect.MYSQL, "body_utf8", byte[].class, PROC);

	/**
	 * No further instances allowed
	 */
	private Proc() {
		super(SQLDialect.MYSQL, "proc", Mysql.MYSQL);
	}

}
