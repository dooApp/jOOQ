/**
 * This class is generated by jOOQ
 */
package org.jooq.test.hsqldb.generatedclasses.functions;


import javax.annotation.Generated;

import org.jooq.SQLDialect;
import org.jooq.impl.StoredFunctionImpl;
import org.jooq.test.hsqldb.generatedclasses.Public;
import org.jooq.util.hsqldb.HSQLDBDataType;


/**
 * This class is generated by jOOQ.
 */
@Generated(value    = "http://jooq.sourceforge.net",
           comments = "This class is generated by jOOQ")
public class FOne extends StoredFunctionImpl<Integer> {

	private static final long serialVersionUID = -1510431692;


	/**
	 * No further instances allowed
	 */
	public FOne() {
		super(SQLDialect.HSQLDB, "F_ONE", Public.PUBLIC, HSQLDBDataType.INTEGER);
	}
}
