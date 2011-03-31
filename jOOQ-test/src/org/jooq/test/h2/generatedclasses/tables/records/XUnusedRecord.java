/**
 * This class is generated by jOOQ
 */
package org.jooq.test.h2.generatedclasses.tables.records;


import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.test.h2.generatedclasses.tables.XUnused;


/**
 * This class is generated by jOOQ.
 */
@Generated(value    = "http://jooq.sourceforge.net",
           comments = "This class is generated by jOOQ")
public class XUnusedRecord extends UpdatableRecordImpl<XUnusedRecord> {

	private static final long serialVersionUID = 1023641454;

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public void setId(Integer value) {
		setValue(XUnused.ID, value);
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public Integer getId() {
		return getValue(XUnused.ID);
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public void setName(String value) {
		setValue(XUnused.NAME, value);
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public String getName() {
		return getValue(XUnused.NAME);
	}

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [PUBLIC.X_UNUSED.ID_REF, PUBLIC.X_UNUSED.NAME_REF]
	 * REFERENCES X_UNUSED [PUBLIC.X_UNUSED.ID, PUBLIC.X_UNUSED.NAME, PUBLIC.X_UNUSED.ID]
	 * </pre></code>
	 */
	public void setIdRef(Integer value) {
		setValue(XUnused.ID_REF, value);
	}

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [PUBLIC.X_UNUSED.ID_REF, PUBLIC.X_UNUSED.NAME_REF]
	 * REFERENCES X_UNUSED [PUBLIC.X_UNUSED.ID, PUBLIC.X_UNUSED.NAME, PUBLIC.X_UNUSED.ID]
	 * </pre></code>
	 */
	public Integer getIdRef() {
		return getValue(XUnused.ID_REF);
	}

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [PUBLIC.X_UNUSED.ID_REF, PUBLIC.X_UNUSED.NAME_REF]
	 * REFERENCES X_UNUSED [PUBLIC.X_UNUSED.ID, PUBLIC.X_UNUSED.NAME, PUBLIC.X_UNUSED.ID]
	 * </pre></code>
	 */
	public void setNameRef(String value) {
		setValue(XUnused.NAME_REF, value);
	}

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [PUBLIC.X_UNUSED.ID_REF, PUBLIC.X_UNUSED.NAME_REF]
	 * REFERENCES X_UNUSED [PUBLIC.X_UNUSED.ID, PUBLIC.X_UNUSED.NAME, PUBLIC.X_UNUSED.ID]
	 * </pre></code>
	 */
	public String getNameRef() {
		return getValue(XUnused.NAME_REF);
	}

	/**
	 * An uncommented item
	 */
	public void setClass_(Integer value) {
		setValue(XUnused.CLASS, value);
	}

	/**
	 * An uncommented item
	 */
	public Integer getClass_() {
		return getValue(XUnused.CLASS);
	}

	/**
	 * An uncommented item
	 * 
	 * This item causes a name clash. That is why an underline character was appended to the Java field name
	 */
	public void setFields_(Integer value) {
		setValue(XUnused.FIELDS, value);
	}

	/**
	 * An uncommented item
	 * 
	 * This item causes a name clash. That is why an underline character was appended to the Java field name
	 */
	public Integer getFields_() {
		return getValue(XUnused.FIELDS);
	}

	/**
	 * An uncommented item
	 * 
	 * This item causes a name clash. That is why an underline character was appended to the Java field name
	 */
	public void setTable_(Integer value) {
		setValue(XUnused.TABLE, value);
	}

	/**
	 * An uncommented item
	 * 
	 * This item causes a name clash. That is why an underline character was appended to the Java field name
	 */
	public Integer getTable_() {
		return getValue(XUnused.TABLE);
	}

	/**
	 * An uncommented item
	 * 
	 * This item causes a name clash. That is why an underline character was appended to the Java field name
	 */
	public void setConfiguration_(Integer value) {
		setValue(XUnused.CONFIGURATION, value);
	}

	/**
	 * An uncommented item
	 * 
	 * This item causes a name clash. That is why an underline character was appended to the Java field name
	 */
	public Integer getConfiguration_() {
		return getValue(XUnused.CONFIGURATION);
	}

	/**
	 * An uncommented item
	 */
	public void setUDT(Integer value) {
		setValue(XUnused.U_D_T, value);
	}

	/**
	 * An uncommented item
	 */
	public Integer getUDT() {
		return getValue(XUnused.U_D_T);
	}

	/**
	 * An uncommented item
	 * 
	 * This item causes a name clash. That is why an underline character was appended to the Java field name
	 */
	public void setMetaData_(Integer value) {
		setValue(XUnused.META_DATA, value);
	}

	/**
	 * An uncommented item
	 * 
	 * This item causes a name clash. That is why an underline character was appended to the Java field name
	 */
	public Integer getMetaData_() {
		return getValue(XUnused.META_DATA);
	}

	/**
	 * An uncommented item
	 * 
	 * This item causes a name clash. That is why an underline character was appended to the Java field name
	 */
	public void setValues_(Integer value) {
		setValue(XUnused.VALUES, value);
	}

	/**
	 * An uncommented item
	 * 
	 * This item causes a name clash. That is why an underline character was appended to the Java field name
	 */
	public Integer getValues_() {
		return getValue(XUnused.VALUES);
	}

	/**
	 * An uncommented item
	 * 
	 * This item causes a name clash. That is why an underline character was appended to the Java field name
	 */
	public void setType0_(Integer value) {
		setValue(XUnused.TYPE0, value);
	}

	/**
	 * An uncommented item
	 * 
	 * This item causes a name clash. That is why an underline character was appended to the Java field name
	 */
	public Integer getType0_() {
		return getValue(XUnused.TYPE0);
	}

	/**
	 * An uncommented item
	 * 
	 * This item causes a name clash. That is why an underline character was appended to the Java field name
	 */
	public void setPrimaryKey_(Integer value) {
		setValue(XUnused.PRIMARY_KEY, value);
	}

	/**
	 * An uncommented item
	 * 
	 * This item causes a name clash. That is why an underline character was appended to the Java field name
	 */
	public Integer getPrimaryKey_() {
		return getValue(XUnused.PRIMARY_KEY);
	}

	/**
	 * An uncommented item
	 */
	public void setPrimarykey(Integer value) {
		setValue(XUnused.PRIMARYKEY, value);
	}

	/**
	 * An uncommented item
	 */
	public Integer getPrimarykey() {
		return getValue(XUnused.PRIMARYKEY);
	}

	public XUnusedRecord(Configuration configuration) {
		super(configuration, XUnused.X_UNUSED);
	}
}
