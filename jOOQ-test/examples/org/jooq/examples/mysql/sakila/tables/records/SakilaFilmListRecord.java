/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.mysql.sakila.tables.records;

/**
 * This class is generated by jOOQ.
 *
 * VIEW
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class SakilaFilmListRecord extends org.jooq.impl.TableRecordImpl<org.jooq.examples.mysql.sakila.tables.records.SakilaFilmListRecord> implements org.jooq.Record8<java.lang.Short, java.lang.String, java.lang.String, java.lang.String, java.math.BigDecimal, java.lang.Short, org.jooq.examples.mysql.sakila.enums.SakilaFilmListRating, java.lang.String> {

	private static final long serialVersionUID = 713279642;

	/**
	 * Setter for <code>sakila.film_list.FID</code>. 
	 */
	public void setFid(java.lang.Short value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>sakila.film_list.FID</code>. 
	 */
	public java.lang.Short getFid() {
		return (java.lang.Short) getValue(0);
	}

	/**
	 * Setter for <code>sakila.film_list.title</code>. 
	 */
	public void setTitle(java.lang.String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>sakila.film_list.title</code>. 
	 */
	public java.lang.String getTitle() {
		return (java.lang.String) getValue(1);
	}

	/**
	 * Setter for <code>sakila.film_list.description</code>. 
	 */
	public void setDescription(java.lang.String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>sakila.film_list.description</code>. 
	 */
	public java.lang.String getDescription() {
		return (java.lang.String) getValue(2);
	}

	/**
	 * Setter for <code>sakila.film_list.category</code>. 
	 */
	public void setCategory(java.lang.String value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>sakila.film_list.category</code>. 
	 */
	public java.lang.String getCategory() {
		return (java.lang.String) getValue(3);
	}

	/**
	 * Setter for <code>sakila.film_list.price</code>. 
	 */
	public void setPrice(java.math.BigDecimal value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>sakila.film_list.price</code>. 
	 */
	public java.math.BigDecimal getPrice() {
		return (java.math.BigDecimal) getValue(4);
	}

	/**
	 * Setter for <code>sakila.film_list.length</code>. 
	 */
	public void setLength(java.lang.Short value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>sakila.film_list.length</code>. 
	 */
	public java.lang.Short getLength() {
		return (java.lang.Short) getValue(5);
	}

	/**
	 * Setter for <code>sakila.film_list.rating</code>. 
	 */
	public void setRating(org.jooq.examples.mysql.sakila.enums.SakilaFilmListRating value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>sakila.film_list.rating</code>. 
	 */
	public org.jooq.examples.mysql.sakila.enums.SakilaFilmListRating getRating() {
		return (org.jooq.examples.mysql.sakila.enums.SakilaFilmListRating) getValue(6);
	}

	/**
	 * Setter for <code>sakila.film_list.actors</code>. 
	 */
	public void setActors(java.lang.String value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>sakila.film_list.actors</code>. 
	 */
	public java.lang.String getActors() {
		return (java.lang.String) getValue(7);
	}

	// -------------------------------------------------------------------------
	// Record8 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row8<java.lang.Short, java.lang.String, java.lang.String, java.lang.String, java.math.BigDecimal, java.lang.Short, org.jooq.examples.mysql.sakila.enums.SakilaFilmListRating, java.lang.String> fieldsRow() {
		return (org.jooq.Row8) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row8<java.lang.Short, java.lang.String, java.lang.String, java.lang.String, java.math.BigDecimal, java.lang.Short, org.jooq.examples.mysql.sakila.enums.SakilaFilmListRating, java.lang.String> valuesRow() {
		return (org.jooq.Row8) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Short> field1() {
		return org.jooq.examples.mysql.sakila.tables.SakilaFilmList.FILM_LIST.FID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field2() {
		return org.jooq.examples.mysql.sakila.tables.SakilaFilmList.FILM_LIST.TITLE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field3() {
		return org.jooq.examples.mysql.sakila.tables.SakilaFilmList.FILM_LIST.DESCRIPTION;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field4() {
		return org.jooq.examples.mysql.sakila.tables.SakilaFilmList.FILM_LIST.CATEGORY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.math.BigDecimal> field5() {
		return org.jooq.examples.mysql.sakila.tables.SakilaFilmList.FILM_LIST.PRICE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Short> field6() {
		return org.jooq.examples.mysql.sakila.tables.SakilaFilmList.FILM_LIST.LENGTH;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<org.jooq.examples.mysql.sakila.enums.SakilaFilmListRating> field7() {
		return org.jooq.examples.mysql.sakila.tables.SakilaFilmList.FILM_LIST.RATING;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field8() {
		return org.jooq.examples.mysql.sakila.tables.SakilaFilmList.FILM_LIST.ACTORS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Short value1() {
		return getFid();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value2() {
		return getTitle();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value3() {
		return getDescription();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value4() {
		return getCategory();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.math.BigDecimal value5() {
		return getPrice();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Short value6() {
		return getLength();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.examples.mysql.sakila.enums.SakilaFilmListRating value7() {
		return getRating();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value8() {
		return getActors();
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached SakilaFilmListRecord
	 */
	public SakilaFilmListRecord() {
		super(org.jooq.examples.mysql.sakila.tables.SakilaFilmList.FILM_LIST);
	}
}