/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle.generatedclasses.test.routines;

/**
 * This class is generated by jOOQ.
 */
public class F691cursorOut extends org.jooq.impl.AbstractRoutine<org.jooq.Result<org.jooq.Record>> {

	private static final long serialVersionUID = -589977465;


	/**
	 * An uncommented item
	 */
	public static final org.jooq.Parameter<org.jooq.Result<org.jooq.Record>> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.RESULT);

	/**
	 * Create a new routine call instance
	 */
	public F691cursorOut() {
		super("F691CURSOR_OUT", org.jooq.test.oracle.generatedclasses.test.Test.TEST, org.jooq.impl.SQLDataType.RESULT);

		setReturnParameter(RETURN_VALUE);
	}
}
