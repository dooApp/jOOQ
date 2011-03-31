/**
 * This class is generated by jOOQ
 */
package org.jooq.test.db2.generatedclasses;


import java.sql.Connection;

import javax.annotation.Generated;

import org.jooq.SchemaMapping;
import org.jooq.util.db2.DB2Factory;


/**
 * This class is generated by jOOQ.
 */
@Generated(value    = "http://jooq.sourceforge.net",
           comments = "This class is generated by jOOQ")
public class LukasFactory extends DB2Factory {

	/**
	 * Create a factory with a connection
	 *
	 * @param connection The connection to use with objects created from this factory
	 */
	public LukasFactory(Connection connection) {
		super(connection);
	}

	/**
	 * Create a factory with a connection and a schema mapping
	 *
	 * @param connection The connection to use with objects created from this factory
	 * @param mapping The schema mapping to use with objects created from this factory
	 */
	public LukasFactory(Connection connection, SchemaMapping mapping) {
		super(connection, mapping);
	}
}
