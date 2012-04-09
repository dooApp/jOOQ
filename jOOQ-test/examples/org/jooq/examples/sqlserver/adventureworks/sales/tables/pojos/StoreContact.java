/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.sqlserver.adventureworks.sales.tables.pojos;

/**
 * This class is generated by jOOQ.
 */
@javax.persistence.Entity
@javax.persistence.Table(name = "StoreContact", schema = "Sales", uniqueConstraints = {
	@javax.persistence.UniqueConstraint(columnNames = {"CustomerID", "ContactID"})
})
public class StoreContact implements java.io.Serializable {

	private static final long serialVersionUID = 922184445;

	private java.lang.Integer  CustomerID;
	private java.lang.Integer  ContactID;
	private java.lang.Integer  ContactTypeID;
	private java.lang.String   rowguid;
	private java.sql.Timestamp ModifiedDate;

	@javax.persistence.Column(name = "CustomerID", nullable = false, precision = 10)
	public java.lang.Integer getCustomerID() {
		return this.CustomerID;
	}

	public void setCustomerID(java.lang.Integer CustomerID) {
		this.CustomerID = CustomerID;
	}

	@javax.persistence.Column(name = "ContactID", nullable = false, precision = 10)
	public java.lang.Integer getContactID() {
		return this.ContactID;
	}

	public void setContactID(java.lang.Integer ContactID) {
		this.ContactID = ContactID;
	}

	@javax.persistence.Column(name = "ContactTypeID", nullable = false, precision = 10)
	public java.lang.Integer getContactTypeID() {
		return this.ContactTypeID;
	}

	public void setContactTypeID(java.lang.Integer ContactTypeID) {
		this.ContactTypeID = ContactTypeID;
	}

	@javax.persistence.Column(name = "rowguid", nullable = false)
	public java.lang.String getrowguid() {
		return this.rowguid;
	}

	public void setrowguid(java.lang.String rowguid) {
		this.rowguid = rowguid;
	}

	@javax.persistence.Column(name = "ModifiedDate", nullable = false)
	public java.sql.Timestamp getModifiedDate() {
		return this.ModifiedDate;
	}

	public void setModifiedDate(java.sql.Timestamp ModifiedDate) {
		this.ModifiedDate = ModifiedDate;
	}
}
