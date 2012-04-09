/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle3.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 */
public class X_TEST_CASE_85 extends org.jooq.impl.UpdatableTableImpl<org.jooq.Record> implements java.lang.Cloneable {

	private static final long serialVersionUID = -175183593;

	/**
	 * The singleton instance of TEST.X_TEST_CASE_85
	 */
	public static final org.jooq.test.oracle3.generatedclasses.tables.X_TEST_CASE_85 X_TEST_CASE_85 = new org.jooq.test.oracle3.generatedclasses.tables.X_TEST_CASE_85();

	/**
	 * The class holding records for this type
	 */
	private static final java.lang.Class<org.jooq.Record> __RECORD_TYPE = org.jooq.Record.class;

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.Record> getRecordType() {
		return __RECORD_TYPE;
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Integer> ID = createField("ID", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * CONSTRAINT FK_X_TEST_CASE_85
	 * FOREIGN KEY (X_UNUSED_ID, X_UNUSED_NAME)
	 * REFERENCES TEST.X_UNUSED (ID, NAME)
	 * </pre></code>
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Integer> X_UNUSED_ID = createField("X_UNUSED_ID", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * CONSTRAINT FK_X_TEST_CASE_85
	 * FOREIGN KEY (X_UNUSED_ID, X_UNUSED_NAME)
	 * REFERENCES TEST.X_UNUSED (ID, NAME)
	 * </pre></code>
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> X_UNUSED_NAME = createField("X_UNUSED_NAME", org.jooq.impl.SQLDataType.VARCHAR, this);

	public X_TEST_CASE_85() {
		super("X_TEST_CASE_85", org.jooq.test.oracle3.generatedclasses.TEST.TEST);
	}

	public X_TEST_CASE_85(java.lang.String alias) {
		super(alias, org.jooq.test.oracle3.generatedclasses.TEST.TEST, org.jooq.test.oracle3.generatedclasses.tables.X_TEST_CASE_85.X_TEST_CASE_85);
	}

	@Override
	public org.jooq.UniqueKey<org.jooq.Record> getMainKey() {
		return org.jooq.test.oracle3.generatedclasses.Keys.PK_X_TEST_CASE_85;
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.UniqueKey<org.jooq.Record>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.Record>>asList(org.jooq.test.oracle3.generatedclasses.Keys.PK_X_TEST_CASE_85);
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.ForeignKey<org.jooq.Record, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<org.jooq.Record, ?>>asList(org.jooq.test.oracle3.generatedclasses.Keys.FK_X_TEST_CASE_85);
	}

	@Override
	public org.jooq.test.oracle3.generatedclasses.tables.X_TEST_CASE_85 as(java.lang.String alias) {
		return new org.jooq.test.oracle3.generatedclasses.tables.X_TEST_CASE_85(alias);
	}
}
