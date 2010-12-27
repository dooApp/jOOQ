/**
 * This class is generated by jOOQ
 */
package org.jooq.util.postgres.pg_catalog.tables.records;


import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.impl.TableRecordImpl;
import org.jooq.util.postgres.pg_catalog.tables.PgEnum;


/**
 * This class is generated by jOOQ.
 */
@Generated(value    = "http://jooq.sourceforge.net",
           comments = "This class is generated by jOOQ")
public class PgEnumRecord extends TableRecordImpl<PgEnumRecord> {

	private static final long serialVersionUID = 904315162;

	/**
	 * An uncommented item
	 * 
	 * The SQL type of this item could not be mapped. Deserialising this field might not work!
	 */
	public void setEnumtypid(Object value) {
		setValue(PgEnum.ENUMTYPID, value);
	}

	/**
	 * An uncommented item
	 * 
	 * The SQL type of this item could not be mapped. Deserialising this field might not work!
	 */
	public Object getEnumtypid() {
		return getValue(PgEnum.ENUMTYPID);
	}

	/**
	 * An uncommented item
	 * 
	 * The SQL type of this item could not be mapped. Deserialising this field might not work!
	 */
	public void setEnumlabel(Object value) {
		setValue(PgEnum.ENUMLABEL, value);
	}

	/**
	 * An uncommented item
	 * 
	 * The SQL type of this item could not be mapped. Deserialising this field might not work!
	 */
	public Object getEnumlabel() {
		return getValue(PgEnum.ENUMLABEL);
	}

	public PgEnumRecord(Configuration configuration) {
		super(configuration, PgEnum.PG_ENUM);
	}
}
