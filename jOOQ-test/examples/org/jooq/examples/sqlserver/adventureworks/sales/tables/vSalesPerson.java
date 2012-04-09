/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.sqlserver.adventureworks.sales.tables;

/**
 * This class is generated by jOOQ.
 */
public class vSalesPerson extends org.jooq.impl.TableImpl<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.vSalesPerson> {

	private static final long serialVersionUID = -169904248;

	/**
	 * The singleton instance of Sales.vSalesPerson
	 */
	public static final org.jooq.examples.sqlserver.adventureworks.sales.tables.vSalesPerson vSalesPerson = new org.jooq.examples.sqlserver.adventureworks.sales.tables.vSalesPerson();

	/**
	 * The class holding records for this type
	 */
	private static final java.lang.Class<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.vSalesPerson> __RECORD_TYPE = org.jooq.examples.sqlserver.adventureworks.sales.tables.records.vSalesPerson.class;

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.vSalesPerson> getRecordType() {
		return __RECORD_TYPE;
	}

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.vSalesPerson, java.lang.Integer> SalesPersonID = createField("SalesPersonID", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.vSalesPerson, java.lang.String> Title = createField("Title", org.jooq.impl.SQLDataType.NVARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.vSalesPerson, java.lang.String> FirstName = createField("FirstName", org.jooq.impl.SQLDataType.NVARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.vSalesPerson, java.lang.String> MiddleName = createField("MiddleName", org.jooq.impl.SQLDataType.NVARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.vSalesPerson, java.lang.String> LastName = createField("LastName", org.jooq.impl.SQLDataType.NVARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.vSalesPerson, java.lang.String> Suffix = createField("Suffix", org.jooq.impl.SQLDataType.NVARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.vSalesPerson, java.lang.String> JobTitle = createField("JobTitle", org.jooq.impl.SQLDataType.NVARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.vSalesPerson, java.lang.String> Phone = createField("Phone", org.jooq.impl.SQLDataType.NVARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.vSalesPerson, java.lang.String> EmailAddress = createField("EmailAddress", org.jooq.impl.SQLDataType.NVARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.vSalesPerson, java.lang.Integer> EmailPromotion = createField("EmailPromotion", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.vSalesPerson, java.lang.String> AddressLine1 = createField("AddressLine1", org.jooq.impl.SQLDataType.NVARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.vSalesPerson, java.lang.String> AddressLine2 = createField("AddressLine2", org.jooq.impl.SQLDataType.NVARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.vSalesPerson, java.lang.String> City = createField("City", org.jooq.impl.SQLDataType.NVARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.vSalesPerson, java.lang.String> StateProvinceName = createField("StateProvinceName", org.jooq.impl.SQLDataType.NVARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.vSalesPerson, java.lang.String> PostalCode = createField("PostalCode", org.jooq.impl.SQLDataType.NVARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.vSalesPerson, java.lang.String> CountryRegionName = createField("CountryRegionName", org.jooq.impl.SQLDataType.NVARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.vSalesPerson, java.lang.String> TerritoryName = createField("TerritoryName", org.jooq.impl.SQLDataType.NVARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.vSalesPerson, java.lang.String> TerritoryGroup = createField("TerritoryGroup", org.jooq.impl.SQLDataType.NVARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.vSalesPerson, java.math.BigDecimal> SalesQuota = createField("SalesQuota", org.jooq.impl.SQLDataType.NUMERIC, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.vSalesPerson, java.math.BigDecimal> SalesYTD = createField("SalesYTD", org.jooq.impl.SQLDataType.NUMERIC, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.vSalesPerson, java.math.BigDecimal> SalesLastYear = createField("SalesLastYear", org.jooq.impl.SQLDataType.NUMERIC, this);

	public vSalesPerson() {
		super("vSalesPerson", org.jooq.examples.sqlserver.adventureworks.sales.Sales.Sales);
	}

	public vSalesPerson(java.lang.String alias) {
		super(alias, org.jooq.examples.sqlserver.adventureworks.sales.Sales.Sales, org.jooq.examples.sqlserver.adventureworks.sales.tables.vSalesPerson.vSalesPerson);
	}

	@Override
	public org.jooq.examples.sqlserver.adventureworks.sales.tables.vSalesPerson as(java.lang.String alias) {
		return new org.jooq.examples.sqlserver.adventureworks.sales.tables.vSalesPerson(alias);
	}
}
