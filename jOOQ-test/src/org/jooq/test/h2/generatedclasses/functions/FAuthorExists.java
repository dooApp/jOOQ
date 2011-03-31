/**
 * This class is generated by jOOQ
 */
package org.jooq.test.h2.generatedclasses.functions;


import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Parameter;
import org.jooq.SQLDialect;
import org.jooq.Select;
import org.jooq.impl.ParameterImpl;
import org.jooq.impl.StoredFunctionImpl;
import org.jooq.test.h2.generatedclasses.Public;
import org.jooq.util.h2.H2DataType;


/**
 * This class is generated by jOOQ.
 */
@Generated(value    = "http://jooq.sourceforge.net",
           comments = "This class is generated by jOOQ")
public class FAuthorExists extends StoredFunctionImpl<Integer> {

	private static final long serialVersionUID = 408863060;


	/**
	 * An uncommented item
	 */
	public static final Parameter<String> P2 = new ParameterImpl<String>(SQLDialect.H2, "P2", H2DataType.VARCHAR);

	/**
	 * No further instances allowed
	 */
	public FAuthorExists() {
		super(SQLDialect.H2, "F_AUTHOR_EXISTS", Public.PUBLIC, H2DataType.INTEGER);

		addInParameter(P2);
	}

	/**
	 * Set the <code>P2</code> parameter to the function
	 */
	public void setP2(String value) {
		setValue(P2, value);
	}

	/**
	 * Set the <code>P2</code> parameter to the function
	 * <p>
	 * Use this method only, if the function is called as a {@link Field} in a {@link Select} statement!
	 */
	public void setP2(Field<String> field) {
		setField(P2, field);
	}
}
