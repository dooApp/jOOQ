/**
 * This class is generated by jOOQ
 */
package org.jooq.util.h2.information_schema.tables;


import javax.annotation.Generated;

import org.jooq.SQLDialect;
import org.jooq.TableField;
import org.jooq.impl.TableFieldImpl;
import org.jooq.impl.TableImpl;
import org.jooq.util.h2.information_schema.InformationSchema;
import org.jooq.util.h2.information_schema.tables.records.TablesRecord;


/**
 * This class is generated by jOOQ.
 */
@Generated(value    = "http://jooq.sourceforge.net",
           comments = "This class is generated by jOOQ")
public class Tables extends TableImpl<TablesRecord> {

	private static final long serialVersionUID = 1867939522;

	/**
	 * The singleton instance of TABLES
	 */
	public static final Tables TABLES = new Tables();

	/**
	 * The class holding records for this type
	 */
	private static final Class<TablesRecord> __RECORD_TYPE = TablesRecord.class;

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<TablesRecord> getRecordType() {
		return __RECORD_TYPE;
	}

	/**
	 * An uncommented item
	 */
	public static final TableField<TablesRecord, String> TABLE_CATALOG = new TableFieldImpl<TablesRecord, String>(SQLDialect.H2, "TABLE_CATALOG", String.class, TABLES);

	/**
	 * An uncommented item
	 */
	public static final TableField<TablesRecord, String> TABLE_SCHEMA = new TableFieldImpl<TablesRecord, String>(SQLDialect.H2, "TABLE_SCHEMA", String.class, TABLES);

	/**
	 * An uncommented item
	 */
	public static final TableField<TablesRecord, String> TABLE_NAME = new TableFieldImpl<TablesRecord, String>(SQLDialect.H2, "TABLE_NAME", String.class, TABLES);

	/**
	 * An uncommented item
	 */
	public static final TableField<TablesRecord, String> TABLE_TYPE = new TableFieldImpl<TablesRecord, String>(SQLDialect.H2, "TABLE_TYPE", String.class, TABLES);

	/**
	 * An uncommented item
	 */
	public static final TableField<TablesRecord, String> STORAGE_TYPE = new TableFieldImpl<TablesRecord, String>(SQLDialect.H2, "STORAGE_TYPE", String.class, TABLES);

	/**
	 * An uncommented item
	 */
	public static final TableField<TablesRecord, String> SQL = new TableFieldImpl<TablesRecord, String>(SQLDialect.H2, "SQL", String.class, TABLES);

	/**
	 * An uncommented item
	 */
	public static final TableField<TablesRecord, String> REMARKS = new TableFieldImpl<TablesRecord, String>(SQLDialect.H2, "REMARKS", String.class, TABLES);

	/**
	 * An uncommented item
	 */
	public static final TableField<TablesRecord, Long> LAST_MODIFICATION = new TableFieldImpl<TablesRecord, Long>(SQLDialect.H2, "LAST_MODIFICATION", Long.class, TABLES);

	/**
	 * An uncommented item
	 */
	public static final TableField<TablesRecord, Integer> ID = new TableFieldImpl<TablesRecord, Integer>(SQLDialect.H2, "ID", Integer.class, TABLES);

	/**
	 * An uncommented item
	 */
	public static final TableField<TablesRecord, String> TYPE_NAME = new TableFieldImpl<TablesRecord, String>(SQLDialect.H2, "TYPE_NAME", String.class, TABLES);

	/**
	 * An uncommented item
	 */
	public static final TableField<TablesRecord, String> TABLE_CLASS = new TableFieldImpl<TablesRecord, String>(SQLDialect.H2, "TABLE_CLASS", String.class, TABLES);

	/**
	 * No further instances allowed
	 */
	private Tables() {
		super(SQLDialect.H2, "TABLES", InformationSchema.INFORMATION_SCHEMA);
	}

}
