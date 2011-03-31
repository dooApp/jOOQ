/**
 * This class is generated by jOOQ
 */
package org.jooq.test.db2.generatedclasses.tables;


import javax.annotation.Generated;

import org.jooq.SQLDialect;
import org.jooq.TableField;
import org.jooq.impl.TableFieldImpl;
import org.jooq.impl.UpdatableTableImpl;
import org.jooq.test.db2.generatedclasses.Lukas;
import org.jooq.test.db2.generatedclasses.tables.records.XTestCase_85Record;
import org.jooq.util.db2.DB2DataType;


/**
 * This class is generated by jOOQ.
 */
@Generated(value    = "http://jooq.sourceforge.net",
           comments = "This class is generated by jOOQ")
public class XTestCase_85 extends UpdatableTableImpl<XTestCase_85Record> {

	private static final long serialVersionUID = -1816227882;

	/**
	 * The singleton instance of X_TEST_CASE_85
	 */
	public static final XTestCase_85 X_TEST_CASE_85 = new XTestCase_85();

	/**
	 * The class holding records for this type
	 */
	private static final Class<XTestCase_85Record> __RECORD_TYPE = XTestCase_85Record.class;

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<XTestCase_85Record> getRecordType() {
		return __RECORD_TYPE;
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public static final TableField<XTestCase_85Record, Integer> ID = new TableFieldImpl<XTestCase_85Record, Integer>(SQLDialect.DB2, "ID", DB2DataType.INTEGER, X_TEST_CASE_85);

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [LUKAS.X_TEST_CASE_85.X_UNUSED_ID, LUKAS.X_TEST_CASE_85.X_UNUSED_NAME]
	 * REFERENCES X_UNUSED [LUKAS.X_UNUSED.ID, LUKAS.X_UNUSED.NAME]
	 * </pre></code>
	 */
	public static final TableField<XTestCase_85Record, Integer> X_UNUSED_ID = new TableFieldImpl<XTestCase_85Record, Integer>(SQLDialect.DB2, "X_UNUSED_ID", DB2DataType.INTEGER, X_TEST_CASE_85);

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [LUKAS.X_TEST_CASE_85.X_UNUSED_ID, LUKAS.X_TEST_CASE_85.X_UNUSED_NAME]
	 * REFERENCES X_UNUSED [LUKAS.X_UNUSED.ID, LUKAS.X_UNUSED.NAME]
	 * </pre></code>
	 */
	public static final TableField<XTestCase_85Record, String> X_UNUSED_NAME = new TableFieldImpl<XTestCase_85Record, String>(SQLDialect.DB2, "X_UNUSED_NAME", DB2DataType.VARCHAR, X_TEST_CASE_85);

	/**
	 * No further instances allowed
	 */
	private XTestCase_85() {
		super(SQLDialect.DB2, "X_TEST_CASE_85", Lukas.LUKAS);
	}

	/*
	 * static initialiser
	 */
	static {
		X_TEST_CASE_85.addToMainUniqueKey(ID);
	}
}
