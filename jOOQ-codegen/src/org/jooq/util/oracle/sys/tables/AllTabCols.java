/**
 * This class is generated by jOOQ
 */
package org.jooq.util.oracle.sys.tables;


import java.math.BigDecimal;
import java.sql.Date;

import javax.annotation.Generated;

import org.jooq.SQLDialect;
import org.jooq.TableField;
import org.jooq.impl.TableFieldImpl;
import org.jooq.impl.TableImpl;
import org.jooq.util.oracle.sys.Sys;
import org.jooq.util.oracle.sys.tables.records.AllTabColsRecord;


/**
 * This class is generated by jOOQ.
 *
 * Columns of user's tables, views and clusters
 */
@Generated(value    = "http://jooq.sourceforge.net",
           comments = "This class is generated by jOOQ")
public class AllTabCols extends TableImpl<AllTabColsRecord> {

	private static final long serialVersionUID = -161767917;

	/**
	 * The singleton instance of ALL_TAB_COLS
	 */
	public static final AllTabCols ALL_TAB_COLS = new AllTabCols();

	/**
	 * The class holding records for this type
	 */
	private static final Class<AllTabColsRecord> __RECORD_TYPE = AllTabColsRecord.class;

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<AllTabColsRecord> getRecordType() {
		return __RECORD_TYPE;
	}

	/**
	 * An uncommented item
	 */
	public static final TableField<AllTabColsRecord, String> OWNER = new TableFieldImpl<AllTabColsRecord, String>(SQLDialect.ORACLE, "OWNER", String.class, ALL_TAB_COLS);

	/**
	 * Table, view or cluster name
	 */
	public static final TableField<AllTabColsRecord, String> TABLE_NAME = new TableFieldImpl<AllTabColsRecord, String>(SQLDialect.ORACLE, "TABLE_NAME", String.class, ALL_TAB_COLS);

	/**
	 * Column name
	 */
	public static final TableField<AllTabColsRecord, String> COLUMN_NAME = new TableFieldImpl<AllTabColsRecord, String>(SQLDialect.ORACLE, "COLUMN_NAME", String.class, ALL_TAB_COLS);

	/**
	 * Datatype of the column
	 */
	public static final TableField<AllTabColsRecord, String> DATA_TYPE = new TableFieldImpl<AllTabColsRecord, String>(SQLDialect.ORACLE, "DATA_TYPE", String.class, ALL_TAB_COLS);

	/**
	 * Datatype modifier of the column
	 */
	public static final TableField<AllTabColsRecord, String> DATA_TYPE_MOD = new TableFieldImpl<AllTabColsRecord, String>(SQLDialect.ORACLE, "DATA_TYPE_MOD", String.class, ALL_TAB_COLS);

	/**
	 * Owner of the datatype of the column
	 */
	public static final TableField<AllTabColsRecord, String> DATA_TYPE_OWNER = new TableFieldImpl<AllTabColsRecord, String>(SQLDialect.ORACLE, "DATA_TYPE_OWNER", String.class, ALL_TAB_COLS);

	/**
	 * Length of the column in bytes
	 */
	public static final TableField<AllTabColsRecord, BigDecimal> DATA_LENGTH = new TableFieldImpl<AllTabColsRecord, BigDecimal>(SQLDialect.ORACLE, "DATA_LENGTH", BigDecimal.class, ALL_TAB_COLS);

	/**
	 * Length: decimal digits (NUMBER) or binary digits (FLOAT)
	 */
	public static final TableField<AllTabColsRecord, BigDecimal> DATA_PRECISION = new TableFieldImpl<AllTabColsRecord, BigDecimal>(SQLDialect.ORACLE, "DATA_PRECISION", BigDecimal.class, ALL_TAB_COLS);

	/**
	 * Digits to right of decimal point in a number
	 */
	public static final TableField<AllTabColsRecord, BigDecimal> DATA_SCALE = new TableFieldImpl<AllTabColsRecord, BigDecimal>(SQLDialect.ORACLE, "DATA_SCALE", BigDecimal.class, ALL_TAB_COLS);

	/**
	 * Does column allow NULL values?
	 */
	public static final TableField<AllTabColsRecord, String> NULLABLE = new TableFieldImpl<AllTabColsRecord, String>(SQLDialect.ORACLE, "NULLABLE", String.class, ALL_TAB_COLS);

	/**
	 * Sequence number of the column as created
	 */
	public static final TableField<AllTabColsRecord, BigDecimal> COLUMN_ID = new TableFieldImpl<AllTabColsRecord, BigDecimal>(SQLDialect.ORACLE, "COLUMN_ID", BigDecimal.class, ALL_TAB_COLS);

	/**
	 * Length of default value for the column
	 */
	public static final TableField<AllTabColsRecord, BigDecimal> DEFAULT_LENGTH = new TableFieldImpl<AllTabColsRecord, BigDecimal>(SQLDialect.ORACLE, "DEFAULT_LENGTH", BigDecimal.class, ALL_TAB_COLS);

	/**
	 * Default value for the column
	 */
	public static final TableField<AllTabColsRecord, String> DATA_DEFAULT = new TableFieldImpl<AllTabColsRecord, String>(SQLDialect.ORACLE, "DATA_DEFAULT", String.class, ALL_TAB_COLS);

	/**
	 * The number of distinct values in the column
	 */
	public static final TableField<AllTabColsRecord, BigDecimal> NUM_DISTINCT = new TableFieldImpl<AllTabColsRecord, BigDecimal>(SQLDialect.ORACLE, "NUM_DISTINCT", BigDecimal.class, ALL_TAB_COLS);

	/**
	 * The low value in the column
	 */
	public static final TableField<AllTabColsRecord, byte[]> LOW_VALUE = new TableFieldImpl<AllTabColsRecord, byte[]>(SQLDialect.ORACLE, "LOW_VALUE", byte[].class, ALL_TAB_COLS);

	/**
	 * The high value in the column
	 */
	public static final TableField<AllTabColsRecord, byte[]> HIGH_VALUE = new TableFieldImpl<AllTabColsRecord, byte[]>(SQLDialect.ORACLE, "HIGH_VALUE", byte[].class, ALL_TAB_COLS);

	/**
	 * The density of the column
	 */
	public static final TableField<AllTabColsRecord, BigDecimal> DENSITY = new TableFieldImpl<AllTabColsRecord, BigDecimal>(SQLDialect.ORACLE, "DENSITY", BigDecimal.class, ALL_TAB_COLS);

	/**
	 * The number of nulls in the column
	 */
	public static final TableField<AllTabColsRecord, BigDecimal> NUM_NULLS = new TableFieldImpl<AllTabColsRecord, BigDecimal>(SQLDialect.ORACLE, "NUM_NULLS", BigDecimal.class, ALL_TAB_COLS);

	/**
	 * The number of buckets in histogram for the column
	 */
	public static final TableField<AllTabColsRecord, BigDecimal> NUM_BUCKETS = new TableFieldImpl<AllTabColsRecord, BigDecimal>(SQLDialect.ORACLE, "NUM_BUCKETS", BigDecimal.class, ALL_TAB_COLS);

	/**
	 * The date of the most recent time this column was analyzed
	 */
	public static final TableField<AllTabColsRecord, Date> LAST_ANALYZED = new TableFieldImpl<AllTabColsRecord, Date>(SQLDialect.ORACLE, "LAST_ANALYZED", Date.class, ALL_TAB_COLS);

	/**
	 * The sample size used in analyzing this column
	 */
	public static final TableField<AllTabColsRecord, BigDecimal> SAMPLE_SIZE = new TableFieldImpl<AllTabColsRecord, BigDecimal>(SQLDialect.ORACLE, "SAMPLE_SIZE", BigDecimal.class, ALL_TAB_COLS);

	/**
	 * Character set name
	 */
	public static final TableField<AllTabColsRecord, String> CHARACTER_SET_NAME = new TableFieldImpl<AllTabColsRecord, String>(SQLDialect.ORACLE, "CHARACTER_SET_NAME", String.class, ALL_TAB_COLS);

	/**
	 * Declaration length of character type column
	 */
	public static final TableField<AllTabColsRecord, BigDecimal> CHAR_COL_DECL_LENGTH = new TableFieldImpl<AllTabColsRecord, BigDecimal>(SQLDialect.ORACLE, "CHAR_COL_DECL_LENGTH", BigDecimal.class, ALL_TAB_COLS);

	/**
	 * Are the statistics calculated without merging underlying partitions?
	 */
	public static final TableField<AllTabColsRecord, String> GLOBAL_STATS = new TableFieldImpl<AllTabColsRecord, String>(SQLDialect.ORACLE, "GLOBAL_STATS", String.class, ALL_TAB_COLS);

	/**
	 * Were the statistics entered directly by the user?
	 */
	public static final TableField<AllTabColsRecord, String> USER_STATS = new TableFieldImpl<AllTabColsRecord, String>(SQLDialect.ORACLE, "USER_STATS", String.class, ALL_TAB_COLS);

	/**
	 * The average length of the column in bytes
	 */
	public static final TableField<AllTabColsRecord, BigDecimal> AVG_COL_LEN = new TableFieldImpl<AllTabColsRecord, BigDecimal>(SQLDialect.ORACLE, "AVG_COL_LEN", BigDecimal.class, ALL_TAB_COLS);

	/**
	 * The maximum length of the column in characters
	 */
	public static final TableField<AllTabColsRecord, BigDecimal> CHAR_LENGTH = new TableFieldImpl<AllTabColsRecord, BigDecimal>(SQLDialect.ORACLE, "CHAR_LENGTH", BigDecimal.class, ALL_TAB_COLS);

	/**
	 * C if maximum length is specified in characters, B if in bytes
	 */
	public static final TableField<AllTabColsRecord, String> CHAR_USED = new TableFieldImpl<AllTabColsRecord, String>(SQLDialect.ORACLE, "CHAR_USED", String.class, ALL_TAB_COLS);

	/**
	 * Is column data in 8.0 image format?
	 */
	public static final TableField<AllTabColsRecord, String> V80_FMT_IMAGE = new TableFieldImpl<AllTabColsRecord, String>(SQLDialect.ORACLE, "V80_FMT_IMAGE", String.class, ALL_TAB_COLS);

	/**
	 * Has column data been upgraded to the latest type version format?
	 */
	public static final TableField<AllTabColsRecord, String> DATA_UPGRADED = new TableFieldImpl<AllTabColsRecord, String>(SQLDialect.ORACLE, "DATA_UPGRADED", String.class, ALL_TAB_COLS);

	/**
	 * Is this a hidden column?
	 */
	public static final TableField<AllTabColsRecord, String> HIDDEN_COLUMN = new TableFieldImpl<AllTabColsRecord, String>(SQLDialect.ORACLE, "HIDDEN_COLUMN", String.class, ALL_TAB_COLS);

	/**
	 * Is this a virtual column?
	 */
	public static final TableField<AllTabColsRecord, String> VIRTUAL_COLUMN = new TableFieldImpl<AllTabColsRecord, String>(SQLDialect.ORACLE, "VIRTUAL_COLUMN", String.class, ALL_TAB_COLS);

	/**
	 * Sequence number of the column in the segment
	 */
	public static final TableField<AllTabColsRecord, BigDecimal> SEGMENT_COLUMN_ID = new TableFieldImpl<AllTabColsRecord, BigDecimal>(SQLDialect.ORACLE, "SEGMENT_COLUMN_ID", BigDecimal.class, ALL_TAB_COLS);

	/**
	 * Internal sequence number of the column
	 */
	public static final TableField<AllTabColsRecord, BigDecimal> INTERNAL_COLUMN_ID = new TableFieldImpl<AllTabColsRecord, BigDecimal>(SQLDialect.ORACLE, "INTERNAL_COLUMN_ID", BigDecimal.class, ALL_TAB_COLS);

	/**
	 * An uncommented item
	 */
	public static final TableField<AllTabColsRecord, String> HISTOGRAM = new TableFieldImpl<AllTabColsRecord, String>(SQLDialect.ORACLE, "HISTOGRAM", String.class, ALL_TAB_COLS);

	/**
	 * Qualified column name
	 */
	public static final TableField<AllTabColsRecord, String> QUALIFIED_COL_NAME = new TableFieldImpl<AllTabColsRecord, String>(SQLDialect.ORACLE, "QUALIFIED_COL_NAME", String.class, ALL_TAB_COLS);

	/**
	 * No further instances allowed
	 */
	private AllTabCols() {
		super(SQLDialect.ORACLE, "ALL_TAB_COLS", Sys.SYS);
	}

}
