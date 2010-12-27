/**
 * This class is generated by jOOQ
 */
package org.jooq.util.h2.information_schema.tables.records;


import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.impl.TableRecordImpl;
import org.jooq.util.h2.information_schema.tables.Constraints;


/**
 * This class is generated by jOOQ.
 */
@Generated(value    = "http://jooq.sourceforge.net",
           comments = "This class is generated by jOOQ")
public class ConstraintsRecord extends TableRecordImpl<ConstraintsRecord> {

	private static final long serialVersionUID = -1999995563;

	/**
	 * An uncommented item
	 */
	public void setConstraintCatalog(String value) {
		setValue(Constraints.CONSTRAINT_CATALOG, value);
	}

	/**
	 * An uncommented item
	 */
	public String getConstraintCatalog() {
		return getValue(Constraints.CONSTRAINT_CATALOG);
	}

	/**
	 * An uncommented item
	 */
	public void setConstraintSchema(String value) {
		setValue(Constraints.CONSTRAINT_SCHEMA, value);
	}

	/**
	 * An uncommented item
	 */
	public String getConstraintSchema() {
		return getValue(Constraints.CONSTRAINT_SCHEMA);
	}

	/**
	 * An uncommented item
	 */
	public void setConstraintName(String value) {
		setValue(Constraints.CONSTRAINT_NAME, value);
	}

	/**
	 * An uncommented item
	 */
	public String getConstraintName() {
		return getValue(Constraints.CONSTRAINT_NAME);
	}

	/**
	 * An uncommented item
	 */
	public void setConstraintType(String value) {
		setValue(Constraints.CONSTRAINT_TYPE, value);
	}

	/**
	 * An uncommented item
	 */
	public String getConstraintType() {
		return getValue(Constraints.CONSTRAINT_TYPE);
	}

	/**
	 * An uncommented item
	 */
	public void setTableCatalog(String value) {
		setValue(Constraints.TABLE_CATALOG, value);
	}

	/**
	 * An uncommented item
	 */
	public String getTableCatalog() {
		return getValue(Constraints.TABLE_CATALOG);
	}

	/**
	 * An uncommented item
	 */
	public void setTableSchema(String value) {
		setValue(Constraints.TABLE_SCHEMA, value);
	}

	/**
	 * An uncommented item
	 */
	public String getTableSchema() {
		return getValue(Constraints.TABLE_SCHEMA);
	}

	/**
	 * An uncommented item
	 */
	public void setTableName(String value) {
		setValue(Constraints.TABLE_NAME, value);
	}

	/**
	 * An uncommented item
	 */
	public String getTableName() {
		return getValue(Constraints.TABLE_NAME);
	}

	/**
	 * An uncommented item
	 */
	public void setUniqueIndexName(String value) {
		setValue(Constraints.UNIQUE_INDEX_NAME, value);
	}

	/**
	 * An uncommented item
	 */
	public String getUniqueIndexName() {
		return getValue(Constraints.UNIQUE_INDEX_NAME);
	}

	/**
	 * An uncommented item
	 */
	public void setCheckExpression(String value) {
		setValue(Constraints.CHECK_EXPRESSION, value);
	}

	/**
	 * An uncommented item
	 */
	public String getCheckExpression() {
		return getValue(Constraints.CHECK_EXPRESSION);
	}

	/**
	 * An uncommented item
	 */
	public void setColumnList(String value) {
		setValue(Constraints.COLUMN_LIST, value);
	}

	/**
	 * An uncommented item
	 */
	public String getColumnList() {
		return getValue(Constraints.COLUMN_LIST);
	}

	/**
	 * An uncommented item
	 */
	public void setRemarks(String value) {
		setValue(Constraints.REMARKS, value);
	}

	/**
	 * An uncommented item
	 */
	public String getRemarks() {
		return getValue(Constraints.REMARKS);
	}

	/**
	 * An uncommented item
	 */
	public void setSql(String value) {
		setValue(Constraints.SQL, value);
	}

	/**
	 * An uncommented item
	 */
	public String getSql() {
		return getValue(Constraints.SQL);
	}

	/**
	 * An uncommented item
	 */
	public void setId(Integer value) {
		setValue(Constraints.ID, value);
	}

	/**
	 * An uncommented item
	 */
	public Integer getId() {
		return getValue(Constraints.ID);
	}

	public ConstraintsRecord(Configuration configuration) {
		super(configuration, Constraints.CONSTRAINTS);
	}
}
