/**
 * This class is generated by jOOQ
 */
package org.jooq.test.postgres.generatedclasses.udt.records;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = "http://jooq.sourceforge.net",
                            comments = "This class is generated by jOOQ")
public class UStreetTypeRecord extends org.jooq.impl.UDTRecordImpl<org.jooq.test.postgres.generatedclasses.udt.records.UStreetTypeRecord> {

	private static final long serialVersionUID = -1934147675;


	/**
	 * An uncommented item
	 */
	public void setStreet(java.lang.String value) {
		setValue(org.jooq.test.postgres.generatedclasses.udt.UStreetType.STREET, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.String getStreet() {
		return getValue(org.jooq.test.postgres.generatedclasses.udt.UStreetType.STREET);
	}

	/**
	 * An uncommented item
	 */
	public void setNo(java.lang.String value) {
		setValue(org.jooq.test.postgres.generatedclasses.udt.UStreetType.NO, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.String getNo() {
		return getValue(org.jooq.test.postgres.generatedclasses.udt.UStreetType.NO);
	}

	/**
	 * An uncommented item
	 */
	public void setFloors(java.lang.Integer[] value) {
		setValue(org.jooq.test.postgres.generatedclasses.udt.UStreetType.FLOORS, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.Integer[] getFloors() {
		return getValue(org.jooq.test.postgres.generatedclasses.udt.UStreetType.FLOORS);
	}

	public UStreetTypeRecord() {
		super(org.jooq.test.postgres.generatedclasses.udt.UStreetType.U_STREET_TYPE);
	}
}
