/**
 * This class is generated by jOOQ
 */
package org.jooq.test.hsqldb.generatedclasses.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = "http://jooq.sourceforge.net",
                            comments = "This class is generated by jOOQ")
public class IntegerRecord extends org.jooq.impl.TableRecordImpl<org.jooq.test.hsqldb.generatedclasses.tables.records.IntegerRecord> {

	private static final long serialVersionUID = 1551311729;

	/**
	 * An uncommented item
	 */
	public void setId(java.lang.Integer value) {
		setValue(org.jooq.test.hsqldb.generatedclasses.tables.Integer.ID, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.Integer getId() {
		return getValue(org.jooq.test.hsqldb.generatedclasses.tables.Integer.ID);
	}

	/**
	 * Create a detached IntegerRecord
	 */
	public IntegerRecord() {
		super(org.jooq.test.hsqldb.generatedclasses.tables.Integer.INTEGER);
	}

	/**
	 * Create an attached IntegerRecord
	 * @deprecated - 1.6.4 [#363, #789] - use the other constructor instead for unattached
	 * records, or {@link org.jooq.impl.Factory#newRecord(org.jooq.Table)} for attached ones
	 */
	@Deprecated
	public IntegerRecord(org.jooq.Configuration configuration) {
		super(org.jooq.test.hsqldb.generatedclasses.tables.Integer.INTEGER, configuration);
	}
}
