/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.sqlserver.adventureworks.sales.tables;

/**
 * This class is generated by jOOQ.
 */
public class Individual extends org.jooq.impl.UpdatableTableImpl<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.Individual> {

	private static final long serialVersionUID = -957091740;

	/**
	 * The singleton instance of Sales.Individual
	 */
	public static final org.jooq.examples.sqlserver.adventureworks.sales.tables.Individual Individual = new org.jooq.examples.sqlserver.adventureworks.sales.tables.Individual();

	/**
	 * The class holding records for this type
	 */
	private static final java.lang.Class<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.Individual> __RECORD_TYPE = org.jooq.examples.sqlserver.adventureworks.sales.tables.records.Individual.class;

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.Individual> getRecordType() {
		return __RECORD_TYPE;
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 * <p>
	 * <code><pre>
	 * CONSTRAINT FK_Individual_Customer_CustomerID
	 * FOREIGN KEY (CustomerID)
	 * REFERENCES Sales.Customer (CustomerID)
	 * </pre></code>
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.Individual, java.lang.Integer> CustomerID = createField("CustomerID", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * CONSTRAINT FK_Individual_Contact_ContactID
	 * FOREIGN KEY (ContactID)
	 * REFERENCES Person.Contact (ContactID)
	 * </pre></code>
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.Individual, java.lang.Integer> ContactID = createField("ContactID", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * An uncommented item
	 * 
	 * The SQL type of this item (xml, ) could not be mapped.<br/>
	 * Deserialising this field might not work!
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.Individual, java.lang.Object> Demographics = createField("Demographics", org.jooq.util.sqlserver.SQLServerDataType.getDefaultDataType("xml"), this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.Individual, java.sql.Timestamp> ModifiedDate = createField("ModifiedDate", org.jooq.impl.SQLDataType.TIMESTAMP, this);

	public Individual() {
		super("Individual", org.jooq.examples.sqlserver.adventureworks.sales.Sales.Sales);
	}

	public Individual(java.lang.String alias) {
		super(alias, org.jooq.examples.sqlserver.adventureworks.sales.Sales.Sales, org.jooq.examples.sqlserver.adventureworks.sales.tables.Individual.Individual);
	}

	@Override
	public org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.Individual> getMainKey() {
		return org.jooq.examples.sqlserver.adventureworks.sales.Keys.PK_Individual_CustomerID;
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.Individual>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.Individual>>asList(org.jooq.examples.sqlserver.adventureworks.sales.Keys.PK_Individual_CustomerID);
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.ForeignKey<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.Individual, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.Individual, ?>>asList(org.jooq.examples.sqlserver.adventureworks.sales.Keys.FK_Individual_Customer_CustomerID, org.jooq.examples.sqlserver.adventureworks.sales.Keys.FK_Individual_Contact_ContactID);
	}

	@Override
	public org.jooq.examples.sqlserver.adventureworks.sales.tables.Individual as(java.lang.String alias) {
		return new org.jooq.examples.sqlserver.adventureworks.sales.tables.Individual(alias);
	}
}
