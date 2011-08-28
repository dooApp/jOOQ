/**
 * This class is generated by jOOQ
 */
package org.jooq.test.hsqldb.generatedclasses;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = "http://jooq.sourceforge.net",
                            comments = "This class is generated by jOOQ")
public class PublicFactory extends org.jooq.util.hsqldb.HSQLDBFactory {

	private static final long serialVersionUID = 27212783;

	/**
	 * Create a factory with a connection
	 *
	 * @param connection The connection to use with objects created from this factory
	 */
	public PublicFactory(java.sql.Connection connection) {
		super(connection);
	}

	/**
	 * Create a factory with a connection and a schema mapping
	 *
	 * @param connection The connection to use with objects created from this factory
	 * @param mapping The schema mapping to use with objects created from this factory
	 */
	public PublicFactory(java.sql.Connection connection, org.jooq.SchemaMapping mapping) {
		super(connection, mapping);
	}
}
