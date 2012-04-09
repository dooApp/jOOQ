/**
 * This class is generated by jOOQ
 */
package org.jooq.test.cubrid.generatedclasses.tables.records;

/**
 * This class is generated by jOOQ.
 */
public class TBookToBookStoreRecord extends org.jooq.impl.UpdatableRecordImpl<org.jooq.test.cubrid.generatedclasses.tables.records.TBookToBookStoreRecord> {

	private static final long serialVersionUID = -1140647159;

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 * <p>
	 * <code><pre>
	 * CONSTRAINT t_book_to_book_store__fk_b2bs_bs_name
	 * FOREIGN KEY (book_store_name)
	 * REFERENCES DBA.t_book_store (name)
	 * </pre></code>
	 */
	public void setBookStoreName(java.lang.String value) {
		setValue(org.jooq.test.cubrid.generatedclasses.tables.TBookToBookStore.BOOK_STORE_NAME, value);
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 * <p>
	 * <code><pre>
	 * CONSTRAINT t_book_to_book_store__fk_b2bs_bs_name
	 * FOREIGN KEY (book_store_name)
	 * REFERENCES DBA.t_book_store (name)
	 * </pre></code>
	 */
	public java.lang.String getBookStoreName() {
		return getValue(org.jooq.test.cubrid.generatedclasses.tables.TBookToBookStore.BOOK_STORE_NAME);
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 * <p>
	 * <code><pre>
	 * CONSTRAINT t_book_to_book_store__fk_b2bs_bs_name
	 * FOREIGN KEY (book_store_name)
	 * REFERENCES DBA.t_book_store (name)
	 * </pre></code>
	 */
	public org.jooq.test.cubrid.generatedclasses.tables.records.TBookStoreRecord fetchTBookStore() {
		return create()
			.selectFrom(org.jooq.test.cubrid.generatedclasses.tables.TBookStore.T_BOOK_STORE)
			.where(org.jooq.test.cubrid.generatedclasses.tables.TBookStore.NAME.equal(getValue(org.jooq.test.cubrid.generatedclasses.tables.TBookToBookStore.BOOK_STORE_NAME)))
			.fetchOne();
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 * <p>
	 * <code><pre>
	 * CONSTRAINT t_book_to_book_store__fk_b2bs_b_id
	 * FOREIGN KEY (book_id)
	 * REFERENCES DBA.t_book (id)
	 * </pre></code>
	 */
	public void setBookId(java.lang.Integer value) {
		setValue(org.jooq.test.cubrid.generatedclasses.tables.TBookToBookStore.BOOK_ID, value);
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 * <p>
	 * <code><pre>
	 * CONSTRAINT t_book_to_book_store__fk_b2bs_b_id
	 * FOREIGN KEY (book_id)
	 * REFERENCES DBA.t_book (id)
	 * </pre></code>
	 */
	public java.lang.Integer getBookId() {
		return getValue(org.jooq.test.cubrid.generatedclasses.tables.TBookToBookStore.BOOK_ID);
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 * <p>
	 * <code><pre>
	 * CONSTRAINT t_book_to_book_store__fk_b2bs_b_id
	 * FOREIGN KEY (book_id)
	 * REFERENCES DBA.t_book (id)
	 * </pre></code>
	 */
	public org.jooq.test.cubrid.generatedclasses.tables.records.TBookRecord fetchTBook() {
		return create()
			.selectFrom(org.jooq.test.cubrid.generatedclasses.tables.TBook.T_BOOK)
			.where(org.jooq.test.cubrid.generatedclasses.tables.TBook.ID.equal(getValue(org.jooq.test.cubrid.generatedclasses.tables.TBookToBookStore.BOOK_ID)))
			.fetchOne();
	}

	/**
	 * An uncommented item
	 */
	public void setStock(java.lang.Integer value) {
		setValue(org.jooq.test.cubrid.generatedclasses.tables.TBookToBookStore.STOCK, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.Integer getStock() {
		return getValue(org.jooq.test.cubrid.generatedclasses.tables.TBookToBookStore.STOCK);
	}

	/**
	 * Create a detached TBookToBookStoreRecord
	 */
	public TBookToBookStoreRecord() {
		super(org.jooq.test.cubrid.generatedclasses.tables.TBookToBookStore.T_BOOK_TO_BOOK_STORE);
	}
}
