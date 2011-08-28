/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.mysql.sakila.tables.records;

/**
 * This class is generated by jOOQ.
 *
 * VIEW
 */
@javax.annotation.Generated(value    = "http://jooq.sourceforge.net",
                            comments = "This class is generated by jOOQ")
public class ActorInfoRecord extends org.jooq.impl.TableRecordImpl<org.jooq.examples.mysql.sakila.tables.records.ActorInfoRecord> {

	private static final long serialVersionUID = -1041377120;

	/**
	 * An uncommented item
	 */
	public void setActorId(java.lang.Short value) {
		setValue(org.jooq.examples.mysql.sakila.tables.ActorInfo.ACTOR_ID, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.Short getActorId() {
		return getValue(org.jooq.examples.mysql.sakila.tables.ActorInfo.ACTOR_ID);
	}

	/**
	 * An uncommented item
	 */
	public void setFirstName(java.lang.String value) {
		setValue(org.jooq.examples.mysql.sakila.tables.ActorInfo.FIRST_NAME, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.String getFirstName() {
		return getValue(org.jooq.examples.mysql.sakila.tables.ActorInfo.FIRST_NAME);
	}

	/**
	 * An uncommented item
	 */
	public void setLastName(java.lang.String value) {
		setValue(org.jooq.examples.mysql.sakila.tables.ActorInfo.LAST_NAME, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.String getLastName() {
		return getValue(org.jooq.examples.mysql.sakila.tables.ActorInfo.LAST_NAME);
	}

	/**
	 * An uncommented item
	 */
	public void setFilmInfo(java.lang.String value) {
		setValue(org.jooq.examples.mysql.sakila.tables.ActorInfo.FILM_INFO, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.String getFilmInfo() {
		return getValue(org.jooq.examples.mysql.sakila.tables.ActorInfo.FILM_INFO);
	}

	/**
	 * Create a detached ActorInfoRecord
	 */
	public ActorInfoRecord() {
		super(org.jooq.examples.mysql.sakila.tables.ActorInfo.ACTOR_INFO);
	}

	/**
	 * Create an attached ActorInfoRecord
	 * @deprecated - 1.6.4 [#363, #789] - use the other constructor instead for unattached
	 * records, or {@link org.jooq.impl.Factory#newRecord(org.jooq.Table)} for attached ones
	 */
	@Deprecated
	public ActorInfoRecord(org.jooq.Configuration configuration) {
		super(org.jooq.examples.mysql.sakila.tables.ActorInfo.ACTOR_INFO, configuration);
	}
}
