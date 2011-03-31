/**
 * This class is generated by jOOQ
 */
package org.jooq.test.derby.generatedclasses.tables.records;


import java.sql.SQLException;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.test.derby.generatedclasses.tables.XTestCase_64_69;
import org.jooq.test.derby.generatedclasses.tables.XTestCase_71;
import org.jooq.test.derby.generatedclasses.tables.XUnused;


/**
 * This class is generated by jOOQ.
 */
@Generated(value    = "http://jooq.sourceforge.net",
           comments = "This class is generated by jOOQ")
public class XTestCase_64_69Record extends UpdatableRecordImpl<XTestCase_64_69Record> {

	private static final long serialVersionUID = 658486558;

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public void setId(Integer value) {
		setValue(XTestCase_64_69.ID, value);
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public Integer getId() {
		return getValue(XTestCase_64_69.ID);
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public List<XTestCase_71Record> getXTestCase_71List() throws SQLException {
		return create()
			.selectFrom(XTestCase_71.X_TEST_CASE_71)
			.where(XTestCase_71.TEST_CASE_64_69_ID.equal(getValue(XTestCase_64_69.ID)))
			.fetch()
			.getRecords();
	}

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [TEST.X_TEST_CASE_64_69.UNUSED_ID]
	 * REFERENCES X_UNUSED [TEST.X_UNUSED.ID]
	 * </pre></code>
	 */
	public void setUnusedId(Integer value) {
		setValue(XTestCase_64_69.UNUSED_ID, value);
	}

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [TEST.X_TEST_CASE_64_69.UNUSED_ID]
	 * REFERENCES X_UNUSED [TEST.X_UNUSED.ID]
	 * </pre></code>
	 */
	public Integer getUnusedId() {
		return getValue(XTestCase_64_69.UNUSED_ID);
	}

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [TEST.X_TEST_CASE_64_69.UNUSED_ID]
	 * REFERENCES X_UNUSED [TEST.X_UNUSED.ID]
	 * </pre></code>
	 */
	public XUnusedRecord getXUnused() throws SQLException {
		return create()
			.selectFrom(XUnused.X_UNUSED)
			.where(XUnused.ID.equal(getValue(XTestCase_64_69.UNUSED_ID)))
			.fetchOne();
	}

	public XTestCase_64_69Record(Configuration configuration) {
		super(configuration, XTestCase_64_69.X_TEST_CASE_64_69);
	}
}
