/**
 * This class is generated by jOOQ
 */
package org.jooq.test.db2.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 */
public class TIdentity extends org.jooq.impl.TableImpl<org.jooq.test.db2.generatedclasses.tables.records.TIdentityRecord> {

	private static final long serialVersionUID = -935749385;

	/**
	 * The singleton instance of LUKAS.T_IDENTITY
	 */
	public static final org.jooq.test.db2.generatedclasses.tables.TIdentity T_IDENTITY = new org.jooq.test.db2.generatedclasses.tables.TIdentity();

	/**
	 * The class holding records for this type
	 */
	private static final java.lang.Class<org.jooq.test.db2.generatedclasses.tables.records.TIdentityRecord> __RECORD_TYPE = org.jooq.test.db2.generatedclasses.tables.records.TIdentityRecord.class;

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.db2.generatedclasses.tables.records.TIdentityRecord> getRecordType() {
		return __RECORD_TYPE;
	}

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.test.db2.generatedclasses.tables.records.TIdentityRecord, java.lang.Integer> ID = createField("ID", org.jooq.impl.SQLDataType.INTEGER, T_IDENTITY);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.test.db2.generatedclasses.tables.records.TIdentityRecord, java.lang.Integer> VAL = createField("VAL", org.jooq.impl.SQLDataType.INTEGER, T_IDENTITY);

	/**
	 * No further instances allowed
	 */
	private TIdentity() {
		super("T_IDENTITY", org.jooq.test.db2.generatedclasses.Lukas.LUKAS);
	}

	@Override
	public org.jooq.Identity<org.jooq.test.db2.generatedclasses.tables.records.TIdentityRecord, java.lang.Integer> getIdentity() {
		return org.jooq.test.db2.generatedclasses.Keys.IDENTITY_T_IDENTITY;
	}
}
