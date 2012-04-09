/**
 * This class is generated by jOOQ
 */
package org.jooq.test.derby.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 */
public class VBook extends org.jooq.impl.TableImpl<org.jooq.test.derby.generatedclasses.tables.records.VBookRecord> {

	private static final long serialVersionUID = 984217237;

	/**
	 * The singleton instance of TEST.V_BOOK
	 */
	public static final org.jooq.test.derby.generatedclasses.tables.VBook V_BOOK = new org.jooq.test.derby.generatedclasses.tables.VBook();

	/**
	 * The class holding records for this type
	 */
	private static final java.lang.Class<org.jooq.test.derby.generatedclasses.tables.records.VBookRecord> __RECORD_TYPE = org.jooq.test.derby.generatedclasses.tables.records.VBookRecord.class;

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.derby.generatedclasses.tables.records.VBookRecord> getRecordType() {
		return __RECORD_TYPE;
	}

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.test.derby.generatedclasses.tables.records.VBookRecord, java.lang.Integer> ID = createField("ID", org.jooq.impl.SQLDataType.INTEGER, V_BOOK);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.test.derby.generatedclasses.tables.records.VBookRecord, java.lang.Integer> AUTHOR_ID = createField("AUTHOR_ID", org.jooq.impl.SQLDataType.INTEGER, V_BOOK);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.test.derby.generatedclasses.tables.records.VBookRecord, java.lang.Integer> CO_AUTHOR_ID = createField("CO_AUTHOR_ID", org.jooq.impl.SQLDataType.INTEGER, V_BOOK);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.test.derby.generatedclasses.tables.records.VBookRecord, java.lang.Integer> DETAILS_ID = createField("DETAILS_ID", org.jooq.impl.SQLDataType.INTEGER, V_BOOK);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.test.derby.generatedclasses.tables.records.VBookRecord, java.lang.String> TITLE = createField("TITLE", org.jooq.impl.SQLDataType.VARCHAR, V_BOOK);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.test.derby.generatedclasses.tables.records.VBookRecord, java.lang.Integer> PUBLISHED_IN = createField("PUBLISHED_IN", org.jooq.impl.SQLDataType.INTEGER, V_BOOK);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.test.derby.generatedclasses.tables.records.VBookRecord, java.lang.Integer> LANGUAGE_ID = createField("LANGUAGE_ID", org.jooq.impl.SQLDataType.INTEGER, V_BOOK);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.test.derby.generatedclasses.tables.records.VBookRecord, java.lang.String> CONTENT_TEXT = createField("CONTENT_TEXT", org.jooq.impl.SQLDataType.CLOB, V_BOOK);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.test.derby.generatedclasses.tables.records.VBookRecord, byte[]> CONTENT_PDF = createField("CONTENT_PDF", org.jooq.impl.SQLDataType.BLOB, V_BOOK);

	/**
	 * No further instances allowed
	 */
	private VBook() {
		super("V_BOOK", org.jooq.test.derby.generatedclasses.Test.TEST);
	}
}
