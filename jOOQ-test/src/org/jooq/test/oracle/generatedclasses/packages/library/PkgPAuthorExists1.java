/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle.generatedclasses.packages.library;


import java.math.BigDecimal;

import javax.annotation.Generated;

import org.jooq.Parameter;
import org.jooq.SQLDialect;
import org.jooq.impl.ParameterImpl;
import org.jooq.impl.StoredProcedureImpl;
import org.jooq.test.oracle.generatedclasses.Test;
import org.jooq.util.oracle.OracleDataType;


/**
 * This class is generated by jOOQ.
 */
@Generated(value    = "http://jooq.sourceforge.net",
           comments = "This class is generated by jOOQ")
public class PkgPAuthorExists1 extends StoredProcedureImpl {

	private static final long serialVersionUID = -1793426216;


	/**
	 * An uncommented item
	 */
	public static final Parameter<String> AUTHOR_NAME = new ParameterImpl<String>(SQLDialect.ORACLE, "AUTHOR_NAME", OracleDataType.VARCHAR2);

	/**
	 * An uncommented item
	 */
	public static final Parameter<BigDecimal> RESULT = new ParameterImpl<BigDecimal>(SQLDialect.ORACLE, "RESULT", OracleDataType.NUMBER);

	/**
	 * No further instances allowed
	 */
	public PkgPAuthorExists1() {
		super(SQLDialect.ORACLE, "LIBRARY.PKG_P_AUTHOR_EXISTS", Test.TEST);

		addInParameter(AUTHOR_NAME);
		addOutParameter(RESULT);
		setOverloaded(true);
	}

	public void setAuthorName(String value) {
		setValue(AUTHOR_NAME, value);
	}

	public BigDecimal getResult() {
		return getValue(RESULT);
	}
}
