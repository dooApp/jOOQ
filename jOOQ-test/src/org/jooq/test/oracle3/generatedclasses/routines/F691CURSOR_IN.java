/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle3.generatedclasses.routines;

/**
 * This class is generated by jOOQ.
 */
public class F691CURSOR_IN extends org.jooq.impl.AbstractRoutine<java.math.BigDecimal> implements java.lang.Cloneable {

	private static final long serialVersionUID = -810431991;


	/**
	 * An uncommented item
	 */
	public static final org.jooq.Parameter<java.math.BigDecimal> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.NUMERIC);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.Parameter<org.jooq.Result<org.jooq.Record>> C = createParameter("C", org.jooq.impl.SQLDataType.RESULT);

	/**
	 * Create a new routine call instance
	 */
	public F691CURSOR_IN() {
		super("F691CURSOR_IN", org.jooq.test.oracle3.generatedclasses.TEST.TEST, org.jooq.impl.SQLDataType.NUMERIC);

		setReturnParameter(RETURN_VALUE);
		addInParameter(C);
	}

	/**
	 * Set the <code>C</code> parameter to the routine
	 */
	public void setC(org.jooq.Result<org.jooq.Record> value) {
		setValue(C, value);
	}

	/**
	 * Set the <code>C</code> parameter to the function
	 * <p>
	 * Use this method only, if the function is called as a {@link org.jooq.Field} in a {@link org.jooq.Select} statement!
	 */
	public void setC(org.jooq.Field<org.jooq.Result<org.jooq.Record>> field) {
		setField(C, field);
	}
}
