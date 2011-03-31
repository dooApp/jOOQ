/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle.generatedclasses.procedures;


import javax.annotation.Generated;

import org.jooq.Parameter;
import org.jooq.SQLDialect;
import org.jooq.impl.ParameterImpl;
import org.jooq.impl.StoredProcedureImpl;
import org.jooq.test.oracle.generatedclasses.Test;
import org.jooq.test.oracle.generatedclasses.udt.records.UNumberArrayRecord;
import org.jooq.util.oracle.OracleDataType;


/**
 * This class is generated by jOOQ.
 */
@Generated(value    = "http://jooq.sourceforge.net",
           comments = "This class is generated by jOOQ")
public class PArrays1 extends StoredProcedureImpl {

	private static final long serialVersionUID = 404351394;


	/**
	 * An uncommented item
	 */
	public static final Parameter<UNumberArrayRecord> IN_ARRAY = new ParameterImpl<UNumberArrayRecord>(SQLDialect.ORACLE, "IN_ARRAY", OracleDataType.NUMBER.asNumberDataType(Integer.class).asArrayDataType(UNumberArrayRecord.class));

	/**
	 * An uncommented item
	 */
	public static final Parameter<UNumberArrayRecord> OUT_ARRAY = new ParameterImpl<UNumberArrayRecord>(SQLDialect.ORACLE, "OUT_ARRAY", OracleDataType.NUMBER.asNumberDataType(Integer.class).asArrayDataType(UNumberArrayRecord.class));

	/**
	 * No further instances allowed
	 */
	public PArrays1() {
		super(SQLDialect.ORACLE, "P_ARRAYS1", Test.TEST);

		addInParameter(IN_ARRAY);
		addOutParameter(OUT_ARRAY);
	}

	public void setInArray(UNumberArrayRecord value) {
		setValue(IN_ARRAY, value);
	}

	public UNumberArrayRecord getOutArray() {
		return getValue(OUT_ARRAY);
	}
}
