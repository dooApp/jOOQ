/**
 * This class is generated by jOOQ
 */
package org.jooq.test.h2.generatedclasses.tables.records;

/**
 * This class is generated by jOOQ.
 */
public class TArraysRecord extends org.jooq.impl.UpdatableRecordImpl<org.jooq.test.h2.generatedclasses.tables.records.TArraysRecord> {

	private static final long serialVersionUID = -851743228;

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public void setId(java.lang.Integer value) {
		setValue(org.jooq.test.h2.generatedclasses.tables.TArrays.ID, value);
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public java.lang.Integer getId() {
		return getValue(org.jooq.test.h2.generatedclasses.tables.TArrays.ID);
	}

	/**
	 * An uncommented item
	 * 
	 * The SQL type of this item (ARRAY) could not be mapped.<br/>
	 * Deserialising this field might not work!
	 */
	public void setStringArray(java.lang.Object[] value) {
		setValue(org.jooq.test.h2.generatedclasses.tables.TArrays.STRING_ARRAY, value);
	}

	/**
	 * An uncommented item
	 * 
	 * The SQL type of this item (ARRAY) could not be mapped.<br/>
	 * Deserialising this field might not work!
	 */
	public java.lang.Object[] getStringArray() {
		return getValue(org.jooq.test.h2.generatedclasses.tables.TArrays.STRING_ARRAY);
	}

	/**
	 * An uncommented item
	 * 
	 * The SQL type of this item (ARRAY) could not be mapped.<br/>
	 * Deserialising this field might not work!
	 */
	public void setNumberArray(java.lang.Object[] value) {
		setValue(org.jooq.test.h2.generatedclasses.tables.TArrays.NUMBER_ARRAY, value);
	}

	/**
	 * An uncommented item
	 * 
	 * The SQL type of this item (ARRAY) could not be mapped.<br/>
	 * Deserialising this field might not work!
	 */
	public java.lang.Object[] getNumberArray() {
		return getValue(org.jooq.test.h2.generatedclasses.tables.TArrays.NUMBER_ARRAY);
	}

	/**
	 * An uncommented item
	 * 
	 * The SQL type of this item (ARRAY) could not be mapped.<br/>
	 * Deserialising this field might not work!
	 */
	public void setDateArray(java.lang.Object[] value) {
		setValue(org.jooq.test.h2.generatedclasses.tables.TArrays.DATE_ARRAY, value);
	}

	/**
	 * An uncommented item
	 * 
	 * The SQL type of this item (ARRAY) could not be mapped.<br/>
	 * Deserialising this field might not work!
	 */
	public java.lang.Object[] getDateArray() {
		return getValue(org.jooq.test.h2.generatedclasses.tables.TArrays.DATE_ARRAY);
	}

	/**
	 * Create a detached TArraysRecord
	 */
	public TArraysRecord() {
		super(org.jooq.test.h2.generatedclasses.tables.TArrays.T_ARRAYS);
	}
}
