/**
 * This class is generated by jOOQ
 */
package org.jooq.test.access.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TBookStore extends org.jooq.impl.TableImpl<org.jooq.test.access.generatedclasses.tables.records.TBookStoreRecord> {

	private static final long serialVersionUID = -2137699300;

	/**
	 * The singleton instance of <code>T_BOOK_STORE</code>
	 */
	public static final org.jooq.test.access.generatedclasses.tables.TBookStore T_BOOK_STORE = new org.jooq.test.access.generatedclasses.tables.TBookStore();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.access.generatedclasses.tables.records.TBookStoreRecord> getRecordType() {
		return org.jooq.test.access.generatedclasses.tables.records.TBookStoreRecord.class;
	}

	/**
	 * The column <code>T_BOOK_STORE.XNAME</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.test.access.generatedclasses.tables.records.TBookStoreRecord, java.lang.String> XNAME = createField("XNAME", org.jooq.impl.SQLDataType.VARCHAR.length(16777216), T_BOOK_STORE);

	/**
	 * No further instances allowed
	 */
	private TBookStore() {
		super("T_BOOK_STORE", org.jooq.test.access.generatedclasses.DefaultSchema.DEFAULT_SCHEMA);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<org.jooq.test.access.generatedclasses.tables.records.TBookStoreRecord> getPrimaryKey() {
		return org.jooq.test.access.generatedclasses.Keys.PK_T_BOOK_STORE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<org.jooq.test.access.generatedclasses.tables.records.TBookStoreRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.test.access.generatedclasses.tables.records.TBookStoreRecord>>asList(org.jooq.test.access.generatedclasses.Keys.PK_T_BOOK_STORE);
	}
}
