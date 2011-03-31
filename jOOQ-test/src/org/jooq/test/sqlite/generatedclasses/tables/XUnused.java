/**
 * This class is generated by jOOQ
 */
package org.jooq.test.sqlite.generatedclasses.tables;


import javax.annotation.Generated;

import org.jooq.SQLDialect;
import org.jooq.TableField;
import org.jooq.impl.TableFieldImpl;
import org.jooq.impl.UpdatableTableImpl;
import org.jooq.test.sqlite.generatedclasses.tables.records.XUnusedRecord;
import org.jooq.util.sqlite.SQLiteDataType;


/**
 * This class is generated by jOOQ.
 */
@Generated(value    = "http://jooq.sourceforge.net",
           comments = "This class is generated by jOOQ")
public class XUnused extends UpdatableTableImpl<XUnusedRecord> {

	private static final long serialVersionUID = -1383921679;

	/**
	 * The singleton instance of x_unused
	 */
	public static final XUnused X_UNUSED = new XUnused();

	/**
	 * The class holding records for this type
	 */
	private static final Class<XUnusedRecord> __RECORD_TYPE = XUnusedRecord.class;

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<XUnusedRecord> getRecordType() {
		return __RECORD_TYPE;
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public static final TableField<XUnusedRecord, Integer> ID = new TableFieldImpl<XUnusedRecord, Integer>(SQLDialect.SQLITE, "ID", SQLiteDataType.INT, X_UNUSED);

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public static final TableField<XUnusedRecord, String> NAME = new TableFieldImpl<XUnusedRecord, String>(SQLDialect.SQLITE, "NAME", SQLiteDataType.VARCHAR, X_UNUSED);

	/**
	 * An uncommented item
	 */
	public static final TableField<XUnusedRecord, Integer> ID_REF = new TableFieldImpl<XUnusedRecord, Integer>(SQLDialect.SQLITE, "ID_REF", SQLiteDataType.INT, X_UNUSED);

	/**
	 * An uncommented item
	 */
	public static final TableField<XUnusedRecord, Integer> CLASS = new TableFieldImpl<XUnusedRecord, Integer>(SQLDialect.SQLITE, "CLASS", SQLiteDataType.INT, X_UNUSED);

	/**
	 * An uncommented item
	 */
	public static final TableField<XUnusedRecord, Integer> FIELDS = new TableFieldImpl<XUnusedRecord, Integer>(SQLDialect.SQLITE, "FIELDS", SQLiteDataType.INT, X_UNUSED);

	/**
	 * An uncommented item
	 */
	public static final TableField<XUnusedRecord, Integer> CONFIGURATION = new TableFieldImpl<XUnusedRecord, Integer>(SQLDialect.SQLITE, "CONFIGURATION", SQLiteDataType.INT, X_UNUSED);

	/**
	 * An uncommented item
	 */
	public static final TableField<XUnusedRecord, Integer> U_D_T = new TableFieldImpl<XUnusedRecord, Integer>(SQLDialect.SQLITE, "U_D_T", SQLiteDataType.INT, X_UNUSED);

	/**
	 * An uncommented item
	 */
	public static final TableField<XUnusedRecord, Integer> META_DATA = new TableFieldImpl<XUnusedRecord, Integer>(SQLDialect.SQLITE, "META_DATA", SQLiteDataType.INT, X_UNUSED);

	/**
	 * An uncommented item
	 */
	public static final TableField<XUnusedRecord, Integer> TYPE0 = new TableFieldImpl<XUnusedRecord, Integer>(SQLDialect.SQLITE, "TYPE0", SQLiteDataType.INT, X_UNUSED);

	/**
	 * An uncommented item
	 */
	public static final TableField<XUnusedRecord, Integer> PRIMARY_KEY = new TableFieldImpl<XUnusedRecord, Integer>(SQLDialect.SQLITE, "PRIMARY_KEY", SQLiteDataType.INT, X_UNUSED);

	/**
	 * An uncommented item
	 */
	public static final TableField<XUnusedRecord, Integer> PRIMARYKEY = new TableFieldImpl<XUnusedRecord, Integer>(SQLDialect.SQLITE, "PRIMARYKEY", SQLiteDataType.INT, X_UNUSED);

	/**
	 * An uncommented item
	 */
	public static final TableField<XUnusedRecord, String> NAME_REF = new TableFieldImpl<XUnusedRecord, String>(SQLDialect.SQLITE, "NAME_REF", SQLiteDataType.VARCHAR, X_UNUSED);

	/**
	 * No further instances allowed
	 */
	private XUnused() {
		super(SQLDialect.SQLITE, "x_unused");
	}

	/*
	 * static initialiser
	 */
	static {
		X_UNUSED.addToMainUniqueKey(ID);
	}
}
