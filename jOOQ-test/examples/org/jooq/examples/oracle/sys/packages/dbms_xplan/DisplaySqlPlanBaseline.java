/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.oracle.sys.packages.dbms_xplan;

/**
 * This class is generated by jOOQ.
 */
public class DisplaySqlPlanBaseline extends org.jooq.impl.AbstractRoutine<org.jooq.examples.oracle.sys.udt.records.DbmsXplanTypeTableRecord> {

	private static final long serialVersionUID = 534301557;


	/**
	 * An uncommented item
	 */
	public static final org.jooq.Parameter<org.jooq.examples.oracle.sys.udt.records.DbmsXplanTypeTableRecord> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.examples.oracle.sys.udt.DbmsXplanType.DBMS_XPLAN_TYPE.getDataType().asArrayDataType(org.jooq.examples.oracle.sys.udt.records.DbmsXplanTypeTableRecord.class));

	/**
	 * An uncommented item
	 */
	public static final org.jooq.Parameter<java.lang.String> SQL_HANDLE = createParameter("SQL_HANDLE", org.jooq.impl.SQLDataType.VARCHAR, true);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.Parameter<java.lang.String> PLAN_NAME = createParameter("PLAN_NAME", org.jooq.impl.SQLDataType.VARCHAR, true);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.Parameter<java.lang.String> FORMAT = createParameter("FORMAT", org.jooq.impl.SQLDataType.VARCHAR, true);

	/**
	 * Create a new routine call instance
	 */
	public DisplaySqlPlanBaseline() {
		super("DISPLAY_SQL_PLAN_BASELINE", org.jooq.examples.oracle.sys.Sys.SYS, org.jooq.examples.oracle.sys.packages.DbmsXplan.DBMS_XPLAN, org.jooq.examples.oracle.sys.udt.DbmsXplanType.DBMS_XPLAN_TYPE.getDataType().asArrayDataType(org.jooq.examples.oracle.sys.udt.records.DbmsXplanTypeTableRecord.class));

		setReturnParameter(RETURN_VALUE);
		addInParameter(SQL_HANDLE);
		addInParameter(PLAN_NAME);
		addInParameter(FORMAT);
	}

	/**
	 * Set the <code>SQL_HANDLE</code> parameter to the routine
	 */
	public void setSqlHandle(java.lang.String value) {
		setValue(SQL_HANDLE, value);
	}

	/**
	 * Set the <code>SQL_HANDLE</code> parameter to the function
	 * <p>
	 * Use this method only, if the function is called as a {@link org.jooq.Field} in a {@link org.jooq.Select} statement!
	 */
	public void setSqlHandle(org.jooq.Field<java.lang.String> field) {
		setField(SQL_HANDLE, field);
	}

	/**
	 * Set the <code>PLAN_NAME</code> parameter to the routine
	 */
	public void setPlanName(java.lang.String value) {
		setValue(PLAN_NAME, value);
	}

	/**
	 * Set the <code>PLAN_NAME</code> parameter to the function
	 * <p>
	 * Use this method only, if the function is called as a {@link org.jooq.Field} in a {@link org.jooq.Select} statement!
	 */
	public void setPlanName(org.jooq.Field<java.lang.String> field) {
		setField(PLAN_NAME, field);
	}

	/**
	 * Set the <code>FORMAT</code> parameter to the routine
	 */
	public void setFormat(java.lang.String value) {
		setValue(FORMAT, value);
	}

	/**
	 * Set the <code>FORMAT</code> parameter to the function
	 * <p>
	 * Use this method only, if the function is called as a {@link org.jooq.Field} in a {@link org.jooq.Select} statement!
	 */
	public void setFormat(org.jooq.Field<java.lang.String> field) {
		setField(FORMAT, field);
	}
}
