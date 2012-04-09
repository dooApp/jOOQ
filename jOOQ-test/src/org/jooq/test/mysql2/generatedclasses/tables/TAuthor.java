/**
 * This class is generated by jOOQ
 */
package org.jooq.test.mysql2.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 *
 * An entity holding authors of books
 */
public class TAuthor extends org.jooq.impl.UpdatableTableImpl<org.jooq.test.mysql2.generatedclasses.tables.records.TAuthorRecord> {

	private static final long serialVersionUID = 887389400;

	/**
	 * The singleton instance of test2.t_author
	 */
	public static final org.jooq.test.mysql2.generatedclasses.tables.TAuthor T_AUTHOR = new org.jooq.test.mysql2.generatedclasses.tables.TAuthor();

	/**
	 * The class holding records for this type
	 */
	private static final java.lang.Class<org.jooq.test.mysql2.generatedclasses.tables.records.TAuthorRecord> __RECORD_TYPE = org.jooq.test.mysql2.generatedclasses.tables.records.TAuthorRecord.class;

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.mysql2.generatedclasses.tables.records.TAuthorRecord> getRecordType() {
		return __RECORD_TYPE;
	}

	/**
	 * The author ID
	 * 
	 * PRIMARY KEY
	 */
	public final org.jooq.TableField<org.jooq.test.mysql2.generatedclasses.tables.records.TAuthorRecord, java.lang.Integer> ID = createField("ID", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The author's first name
	 */
	public final org.jooq.TableField<org.jooq.test.mysql2.generatedclasses.tables.records.TAuthorRecord, java.lang.String> FIRST_NAME = createField("FIRST_NAME", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The author's last name
	 */
	public final org.jooq.TableField<org.jooq.test.mysql2.generatedclasses.tables.records.TAuthorRecord, java.lang.String> LAST_NAME = createField("LAST_NAME", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The author's date of birth
	 */
	public final org.jooq.TableField<org.jooq.test.mysql2.generatedclasses.tables.records.TAuthorRecord, java.sql.Date> DATE_OF_BIRTH = createField("DATE_OF_BIRTH", org.jooq.impl.SQLDataType.DATE, this);

	/**
	 * The author's year of birth
	 */
	public final org.jooq.TableField<org.jooq.test.mysql2.generatedclasses.tables.records.TAuthorRecord, java.lang.Integer> YEAR_OF_BIRTH = createField("YEAR_OF_BIRTH", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The author's address
	 */
	public final org.jooq.TableField<org.jooq.test.mysql2.generatedclasses.tables.records.TAuthorRecord, java.lang.String> ADDRESS = createField("ADDRESS", org.jooq.impl.SQLDataType.VARCHAR, this);

	public TAuthor() {
		super("t_author", org.jooq.test.mysql2.generatedclasses.Test2.TEST2);
	}

	public TAuthor(java.lang.String alias) {
		super(alias, org.jooq.test.mysql2.generatedclasses.Test2.TEST2, org.jooq.test.mysql2.generatedclasses.tables.TAuthor.T_AUTHOR);
	}

	@Override
	public org.jooq.UniqueKey<org.jooq.test.mysql2.generatedclasses.tables.records.TAuthorRecord> getMainKey() {
		return org.jooq.test.mysql2.generatedclasses.Keys.KEY_T_AUTHOR_PRIMARY;
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.UniqueKey<org.jooq.test.mysql2.generatedclasses.tables.records.TAuthorRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.test.mysql2.generatedclasses.tables.records.TAuthorRecord>>asList(org.jooq.test.mysql2.generatedclasses.Keys.KEY_T_AUTHOR_PRIMARY);
	}

	@Override
	public org.jooq.test.mysql2.generatedclasses.tables.TAuthor as(java.lang.String alias) {
		return new org.jooq.test.mysql2.generatedclasses.tables.TAuthor(alias);
	}
}
