/**
 * This class is generated by jOOQ
 */
package org.jooq.test.sybase.generatedclasses.tables.records;

/**
 * This class is generated by jOOQ.
 */
public class TDatesRecord extends org.jooq.impl.UpdatableRecordImpl<org.jooq.test.sybase.generatedclasses.tables.records.TDatesRecord> {

	private static final long serialVersionUID = -2095066435;

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public void setId(java.lang.Integer value) {
		setValue(org.jooq.test.sybase.generatedclasses.tables.TDates.T_DATES.ID, value);
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public java.lang.Integer getId() {
		return getValue(org.jooq.test.sybase.generatedclasses.tables.TDates.T_DATES.ID);
	}

	/**
	 * An uncommented item
	 */
	public void setD(java.sql.Date value) {
		setValue(org.jooq.test.sybase.generatedclasses.tables.TDates.T_DATES.D, value);
	}

	/**
	 * An uncommented item
	 */
	public java.sql.Date getD() {
		return getValue(org.jooq.test.sybase.generatedclasses.tables.TDates.T_DATES.D);
	}

	/**
	 * An uncommented item
	 */
	public void setT(java.sql.Time value) {
		setValue(org.jooq.test.sybase.generatedclasses.tables.TDates.T_DATES.T, value);
	}

	/**
	 * An uncommented item
	 */
	public java.sql.Time getT() {
		return getValue(org.jooq.test.sybase.generatedclasses.tables.TDates.T_DATES.T);
	}

	/**
	 * An uncommented item
	 */
	public void setTs(java.sql.Timestamp value) {
		setValue(org.jooq.test.sybase.generatedclasses.tables.TDates.T_DATES.TS, value);
	}

	/**
	 * An uncommented item
	 */
	public java.sql.Timestamp getTs() {
		return getValue(org.jooq.test.sybase.generatedclasses.tables.TDates.T_DATES.TS);
	}

	/**
	 * An uncommented item
	 */
	public void setDInt(java.lang.Integer value) {
		setValue(org.jooq.test.sybase.generatedclasses.tables.TDates.T_DATES.D_INT, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.Integer getDInt() {
		return getValue(org.jooq.test.sybase.generatedclasses.tables.TDates.T_DATES.D_INT);
	}

	/**
	 * An uncommented item
	 */
	public void setTsBigint(java.lang.Long value) {
		setValue(org.jooq.test.sybase.generatedclasses.tables.TDates.T_DATES.TS_BIGINT, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.Long getTsBigint() {
		return getValue(org.jooq.test.sybase.generatedclasses.tables.TDates.T_DATES.TS_BIGINT);
	}

	/**
	 * Create a detached TDatesRecord
	 */
	public TDatesRecord() {
		super(org.jooq.test.sybase.generatedclasses.tables.TDates.T_DATES);
	}
}
