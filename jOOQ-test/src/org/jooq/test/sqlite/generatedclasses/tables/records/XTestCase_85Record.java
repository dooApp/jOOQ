/**
 * This class is generated by jOOQ
 */
package org.jooq.test.sqlite.generatedclasses.tables.records;


import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.test.sqlite.generatedclasses.tables.XTestCase_85;


/**
 * This class is generated by jOOQ.
 */
@Generated(value    = "http://jooq.sourceforge.net",
           comments = "This class is generated by jOOQ")
public class XTestCase_85Record extends UpdatableRecordImpl<XTestCase_85Record> {

	private static final long serialVersionUID = 925557609;

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public void setId(Integer value) {
		setValue(XTestCase_85.ID, value);
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public Integer getId() {
		return getValue(XTestCase_85.ID);
	}

	/**
	 * An uncommented item
	 */
	public void setXUnusedId(Integer value) {
		setValue(XTestCase_85.X_UNUSED_ID, value);
	}

	/**
	 * An uncommented item
	 */
	public Integer getXUnusedId() {
		return getValue(XTestCase_85.X_UNUSED_ID);
	}

	/**
	 * An uncommented item
	 */
	public void setXUnusedName(String value) {
		setValue(XTestCase_85.X_UNUSED_NAME, value);
	}

	/**
	 * An uncommented item
	 */
	public String getXUnusedName() {
		return getValue(XTestCase_85.X_UNUSED_NAME);
	}

	public XTestCase_85Record(Configuration configuration) {
		super(configuration, XTestCase_85.X_TEST_CASE_85);
	}
}
