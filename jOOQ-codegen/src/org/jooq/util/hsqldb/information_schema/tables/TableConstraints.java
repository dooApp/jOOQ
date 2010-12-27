/**
 * This class is generated by jOOQ
 */
package org.jooq.util.hsqldb.information_schema.tables;


import javax.annotation.Generated;

import org.jooq.SQLDialect;
import org.jooq.TableField;
import org.jooq.impl.TableFieldImpl;
import org.jooq.impl.TableImpl;
import org.jooq.util.hsqldb.information_schema.InformationSchema;
import org.jooq.util.hsqldb.information_schema.tables.records.TableConstraintsRecord;


/**
 * This class is generated by jOOQ.
 */
@Generated(value    = "http://jooq.sourceforge.net",
           comments = "This class is generated by jOOQ")
public class TableConstraints extends TableImpl<TableConstraintsRecord> {

	private static final long serialVersionUID = -988713365;

	/**
	 * The singleton instance of TABLE_CONSTRAINTS
	 */
	public static final TableConstraints TABLE_CONSTRAINTS = new TableConstraints();

	/**
	 * The class holding records for this type
	 */
	private static final Class<TableConstraintsRecord> __RECORD_TYPE = TableConstraintsRecord.class;

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<TableConstraintsRecord> getRecordType() {
		return __RECORD_TYPE;
	}

	/**
	 * An uncommented item
	 */
	public static final TableField<TableConstraintsRecord, String> CONSTRAINT_CATALOG = new TableFieldImpl<TableConstraintsRecord, String>(SQLDialect.HSQLDB, "CONSTRAINT_CATALOG", String.class, TABLE_CONSTRAINTS);

	/**
	 * An uncommented item
	 */
	public static final TableField<TableConstraintsRecord, String> CONSTRAINT_SCHEMA = new TableFieldImpl<TableConstraintsRecord, String>(SQLDialect.HSQLDB, "CONSTRAINT_SCHEMA", String.class, TABLE_CONSTRAINTS);

	/**
	 * An uncommented item
	 */
	public static final TableField<TableConstraintsRecord, String> CONSTRAINT_NAME = new TableFieldImpl<TableConstraintsRecord, String>(SQLDialect.HSQLDB, "CONSTRAINT_NAME", String.class, TABLE_CONSTRAINTS);

	/**
	 * An uncommented item
	 */
	public static final TableField<TableConstraintsRecord, String> CONSTRAINT_TYPE = new TableFieldImpl<TableConstraintsRecord, String>(SQLDialect.HSQLDB, "CONSTRAINT_TYPE", String.class, TABLE_CONSTRAINTS);

	/**
	 * An uncommented item
	 */
	public static final TableField<TableConstraintsRecord, String> TABLE_CATALOG = new TableFieldImpl<TableConstraintsRecord, String>(SQLDialect.HSQLDB, "TABLE_CATALOG", String.class, TABLE_CONSTRAINTS);

	/**
	 * An uncommented item
	 */
	public static final TableField<TableConstraintsRecord, String> TABLE_SCHEMA = new TableFieldImpl<TableConstraintsRecord, String>(SQLDialect.HSQLDB, "TABLE_SCHEMA", String.class, TABLE_CONSTRAINTS);

	/**
	 * An uncommented item
	 */
	public static final TableField<TableConstraintsRecord, String> TABLE_NAME = new TableFieldImpl<TableConstraintsRecord, String>(SQLDialect.HSQLDB, "TABLE_NAME", String.class, TABLE_CONSTRAINTS);

	/**
	 * An uncommented item
	 */
	public static final TableField<TableConstraintsRecord, String> IS_DEFERRABLE = new TableFieldImpl<TableConstraintsRecord, String>(SQLDialect.HSQLDB, "IS_DEFERRABLE", String.class, TABLE_CONSTRAINTS);

	/**
	 * An uncommented item
	 */
	public static final TableField<TableConstraintsRecord, String> INITIALLY_DEFERRED = new TableFieldImpl<TableConstraintsRecord, String>(SQLDialect.HSQLDB, "INITIALLY_DEFERRED", String.class, TABLE_CONSTRAINTS);

	/**
	 * No further instances allowed
	 */
	private TableConstraints() {
		super(SQLDialect.HSQLDB, "TABLE_CONSTRAINTS", InformationSchema.INFORMATION_SCHEMA);
	}

}
