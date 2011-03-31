/**
 * This class is generated by jOOQ
 */
package org.jooq.test.db2.generatedclasses.tables;


import javax.annotation.Generated;

import org.jooq.SQLDialect;
import org.jooq.TableField;
import org.jooq.impl.TableFieldImpl;
import org.jooq.impl.TableImpl;
import org.jooq.test.db2.generatedclasses.Lukas;
import org.jooq.test.db2.generatedclasses.tables.records.VLibraryRecord;
import org.jooq.util.db2.DB2DataType;


/**
 * This class is generated by jOOQ.
 */
@Generated(value    = "http://jooq.sourceforge.net",
           comments = "This class is generated by jOOQ")
public class VLibrary extends TableImpl<VLibraryRecord> {

	private static final long serialVersionUID = -2099187976;

	/**
	 * The singleton instance of V_LIBRARY
	 */
	public static final VLibrary V_LIBRARY = new VLibrary();

	/**
	 * The class holding records for this type
	 */
	private static final Class<VLibraryRecord> __RECORD_TYPE = VLibraryRecord.class;

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<VLibraryRecord> getRecordType() {
		return __RECORD_TYPE;
	}

	/**
	 * An uncommented item
	 */
	public static final TableField<VLibraryRecord, String> AUTHOR = new TableFieldImpl<VLibraryRecord, String>(SQLDialect.DB2, "AUTHOR", DB2DataType.VARCHAR, V_LIBRARY);

	/**
	 * An uncommented item
	 */
	public static final TableField<VLibraryRecord, String> TITLE = new TableFieldImpl<VLibraryRecord, String>(SQLDialect.DB2, "TITLE", DB2DataType.VARCHAR, V_LIBRARY);

	/**
	 * No further instances allowed
	 */
	private VLibrary() {
		super(SQLDialect.DB2, "V_LIBRARY", Lukas.LUKAS);
	}
}
