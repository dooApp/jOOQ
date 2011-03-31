/**
 * This class is generated by jOOQ
 */
package org.jooq.test.postgres.generatedclasses.tables;


import javax.annotation.Generated;

import org.jooq.SQLDialect;
import org.jooq.TableField;
import org.jooq.impl.TableFieldImpl;
import org.jooq.impl.UpdatableTableImpl;
import org.jooq.test.postgres.generatedclasses.Public;
import org.jooq.test.postgres.generatedclasses.enums.TLanguage;
import org.jooq.test.postgres.generatedclasses.enums.UBookStatus;
import org.jooq.test.postgres.generatedclasses.tables.records.TBookRecord;
import org.jooq.util.postgres.PostgresDataType;


/**
 * This class is generated by jOOQ.
 */
@Generated(value    = "http://jooq.sourceforge.net",
           comments = "This class is generated by jOOQ")
public class TBook extends UpdatableTableImpl<TBookRecord> {

	private static final long serialVersionUID = 1598519707;

	/**
	 * The singleton instance of t_book
	 */
	public static final TBook T_BOOK = new TBook();

	/**
	 * The class holding records for this type
	 */
	private static final Class<TBookRecord> __RECORD_TYPE = TBookRecord.class;

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<TBookRecord> getRecordType() {
		return __RECORD_TYPE;
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public static final TableField<TBookRecord, Integer> ID = new TableFieldImpl<TBookRecord, Integer>(SQLDialect.POSTGRES, "id", PostgresDataType.INTEGER, T_BOOK);

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [public.t_book.author_id]
	 * REFERENCES t_author [public.t_author.id]
	 * </pre></code>
	 */
	public static final TableField<TBookRecord, Integer> AUTHOR_ID = new TableFieldImpl<TBookRecord, Integer>(SQLDialect.POSTGRES, "author_id", PostgresDataType.INTEGER, T_BOOK);

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [public.t_book.co_author_id]
	 * REFERENCES t_author [public.t_author.id]
	 * </pre></code>
	 */
	public static final TableField<TBookRecord, Integer> CO_AUTHOR_ID = new TableFieldImpl<TBookRecord, Integer>(SQLDialect.POSTGRES, "co_author_id", PostgresDataType.INTEGER, T_BOOK);

	/**
	 * An uncommented item
	 */
	public static final TableField<TBookRecord, Integer> DETAILS_ID = new TableFieldImpl<TBookRecord, Integer>(SQLDialect.POSTGRES, "details_id", PostgresDataType.INTEGER, T_BOOK);

	/**
	 * An uncommented item
	 */
	public static final TableField<TBookRecord, String> TITLE = new TableFieldImpl<TBookRecord, String>(SQLDialect.POSTGRES, "title", PostgresDataType.CHARACTERVARYING, T_BOOK);

	/**
	 * An uncommented item
	 */
	public static final TableField<TBookRecord, Integer> PUBLISHED_IN = new TableFieldImpl<TBookRecord, Integer>(SQLDialect.POSTGRES, "published_in", PostgresDataType.INTEGER, T_BOOK);

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [public.t_book.language_id]
	 * REFERENCES t_language [public.t_language.id]
	 * </pre></code>
	 */
	public static final TableField<TBookRecord, TLanguage> LANGUAGE_ID = new TableFieldImpl<TBookRecord, TLanguage>(SQLDialect.POSTGRES, "language_id", PostgresDataType.INTEGER.asMasterDataType(TLanguage.class), T_BOOK);

	/**
	 * An uncommented item
	 */
	public static final TableField<TBookRecord, String> CONTENT_TEXT = new TableFieldImpl<TBookRecord, String>(SQLDialect.POSTGRES, "content_text", PostgresDataType.TEXT, T_BOOK);

	/**
	 * An uncommented item
	 */
	public static final TableField<TBookRecord, byte[]> CONTENT_PDF = new TableFieldImpl<TBookRecord, byte[]>(SQLDialect.POSTGRES, "content_pdf", PostgresDataType.BYTEA, T_BOOK);

	/**
	 * An uncommented item
	 */
	public static final TableField<TBookRecord, UBookStatus> STATUS = new TableFieldImpl<TBookRecord, UBookStatus>(SQLDialect.POSTGRES, "status", PostgresDataType.TEXT.asEnumDataType(UBookStatus.class), T_BOOK);

	/**
	 * No further instances allowed
	 */
	private TBook() {
		super(SQLDialect.POSTGRES, "t_book", Public.PUBLIC);
	}

	/*
	 * static initialiser
	 */
	static {
		T_BOOK.addToMainUniqueKey(ID);
	}
}
