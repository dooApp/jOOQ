/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.mysql.sakila.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = "http://jooq.sourceforge.net",
                            comments = "This class is generated by jOOQ")
public class Country extends org.jooq.impl.UpdatableTableImpl<org.jooq.examples.mysql.sakila.tables.records.CountryRecord> {

	private static final long serialVersionUID = 1649523596;

	/**
	 * The singleton instance of country
	 */
	public static final org.jooq.examples.mysql.sakila.tables.Country COUNTRY = new org.jooq.examples.mysql.sakila.tables.Country();

	/**
	 * The class holding records for this type
	 */
	private static final java.lang.Class<org.jooq.examples.mysql.sakila.tables.records.CountryRecord> __RECORD_TYPE = org.jooq.examples.mysql.sakila.tables.records.CountryRecord.class;

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.examples.mysql.sakila.tables.records.CountryRecord> getRecordType() {
		return __RECORD_TYPE;
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public static final org.jooq.TableField<org.jooq.examples.mysql.sakila.tables.records.CountryRecord, java.lang.Short> COUNTRY_ID = new org.jooq.impl.TableFieldImpl<org.jooq.examples.mysql.sakila.tables.records.CountryRecord, java.lang.Short>("country_id", org.jooq.impl.SQLDataType.SMALLINT, COUNTRY);

	/**
	 * An uncommented item
	 * 
	 * This item causes a name clash. That is why an underline character was appended to the Java field name
	 */
	public static final org.jooq.TableField<org.jooq.examples.mysql.sakila.tables.records.CountryRecord, java.lang.String> COUNTRY_ = new org.jooq.impl.TableFieldImpl<org.jooq.examples.mysql.sakila.tables.records.CountryRecord, java.lang.String>("country", org.jooq.impl.SQLDataType.VARCHAR, COUNTRY);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.examples.mysql.sakila.tables.records.CountryRecord, java.sql.Timestamp> LAST_UPDATE = new org.jooq.impl.TableFieldImpl<org.jooq.examples.mysql.sakila.tables.records.CountryRecord, java.sql.Timestamp>("last_update", org.jooq.impl.SQLDataType.TIMESTAMP, COUNTRY);

	/**
	 * No further instances allowed
	 */
	private Country() {
		super("country", org.jooq.examples.mysql.sakila.Sakila.SAKILA);
	}

	@Override
	public org.jooq.Identity<org.jooq.examples.mysql.sakila.tables.records.CountryRecord, java.lang.Short> getIdentity() {
		return org.jooq.examples.mysql.sakila.Keys.IDENTITY_country;
	}

	@Override
	public org.jooq.UniqueKey<org.jooq.examples.mysql.sakila.tables.records.CountryRecord> getMainKey() {
		return org.jooq.examples.mysql.sakila.Keys.KEY_country_PRIMARY;
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.UniqueKey<org.jooq.examples.mysql.sakila.tables.records.CountryRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.examples.mysql.sakila.tables.records.CountryRecord>>asList(org.jooq.examples.mysql.sakila.Keys.KEY_country_PRIMARY);
	}
}
