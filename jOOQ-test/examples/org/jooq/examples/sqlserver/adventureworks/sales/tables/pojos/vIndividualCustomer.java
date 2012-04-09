/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.sqlserver.adventureworks.sales.tables.pojos;

/**
 * This class is generated by jOOQ.
 */
@javax.persistence.Entity
@javax.persistence.Table(name = "vIndividualCustomer", schema = "Sales")
public class vIndividualCustomer implements java.io.Serializable {

	private static final long serialVersionUID = 1389191150;

	private java.lang.Integer CustomerID;
	private java.lang.String  Title;
	private java.lang.String  FirstName;
	private java.lang.String  MiddleName;
	private java.lang.String  LastName;
	private java.lang.String  Suffix;
	private java.lang.String  Phone;
	private java.lang.String  EmailAddress;
	private java.lang.Integer EmailPromotion;
	private java.lang.String  AddressType;
	private java.lang.String  AddressLine1;
	private java.lang.String  AddressLine2;
	private java.lang.String  City;
	private java.lang.String  StateProvinceName;
	private java.lang.String  PostalCode;
	private java.lang.String  CountryRegionName;
	private java.lang.Object  Demographics;

	@javax.persistence.Column(name = "CustomerID", nullable = false, precision = 10)
	public java.lang.Integer getCustomerID() {
		return this.CustomerID;
	}

	public void setCustomerID(java.lang.Integer CustomerID) {
		this.CustomerID = CustomerID;
	}

	@javax.persistence.Column(name = "Title", length = 8)
	public java.lang.String getTitle() {
		return this.Title;
	}

	public void setTitle(java.lang.String Title) {
		this.Title = Title;
	}

	@javax.persistence.Column(name = "FirstName", nullable = false, length = 50)
	public java.lang.String getFirstName() {
		return this.FirstName;
	}

	public void setFirstName(java.lang.String FirstName) {
		this.FirstName = FirstName;
	}

	@javax.persistence.Column(name = "MiddleName", length = 50)
	public java.lang.String getMiddleName() {
		return this.MiddleName;
	}

	public void setMiddleName(java.lang.String MiddleName) {
		this.MiddleName = MiddleName;
	}

	@javax.persistence.Column(name = "LastName", nullable = false, length = 50)
	public java.lang.String getLastName() {
		return this.LastName;
	}

	public void setLastName(java.lang.String LastName) {
		this.LastName = LastName;
	}

	@javax.persistence.Column(name = "Suffix", length = 10)
	public java.lang.String getSuffix() {
		return this.Suffix;
	}

	public void setSuffix(java.lang.String Suffix) {
		this.Suffix = Suffix;
	}

	@javax.persistence.Column(name = "Phone", length = 25)
	public java.lang.String getPhone() {
		return this.Phone;
	}

	public void setPhone(java.lang.String Phone) {
		this.Phone = Phone;
	}

	@javax.persistence.Column(name = "EmailAddress", length = 50)
	public java.lang.String getEmailAddress() {
		return this.EmailAddress;
	}

	public void setEmailAddress(java.lang.String EmailAddress) {
		this.EmailAddress = EmailAddress;
	}

	@javax.persistence.Column(name = "EmailPromotion", nullable = false, precision = 10)
	public java.lang.Integer getEmailPromotion() {
		return this.EmailPromotion;
	}

	public void setEmailPromotion(java.lang.Integer EmailPromotion) {
		this.EmailPromotion = EmailPromotion;
	}

	@javax.persistence.Column(name = "AddressType", nullable = false, length = 50)
	public java.lang.String getAddressType() {
		return this.AddressType;
	}

	public void setAddressType(java.lang.String AddressType) {
		this.AddressType = AddressType;
	}

	@javax.persistence.Column(name = "AddressLine1", nullable = false, length = 60)
	public java.lang.String getAddressLine1() {
		return this.AddressLine1;
	}

	public void setAddressLine1(java.lang.String AddressLine1) {
		this.AddressLine1 = AddressLine1;
	}

	@javax.persistence.Column(name = "AddressLine2", length = 60)
	public java.lang.String getAddressLine2() {
		return this.AddressLine2;
	}

	public void setAddressLine2(java.lang.String AddressLine2) {
		this.AddressLine2 = AddressLine2;
	}

	@javax.persistence.Column(name = "City", nullable = false, length = 30)
	public java.lang.String getCity() {
		return this.City;
	}

	public void setCity(java.lang.String City) {
		this.City = City;
	}

	@javax.persistence.Column(name = "StateProvinceName", nullable = false, length = 50)
	public java.lang.String getStateProvinceName() {
		return this.StateProvinceName;
	}

	public void setStateProvinceName(java.lang.String StateProvinceName) {
		this.StateProvinceName = StateProvinceName;
	}

	@javax.persistence.Column(name = "PostalCode", nullable = false, length = 15)
	public java.lang.String getPostalCode() {
		return this.PostalCode;
	}

	public void setPostalCode(java.lang.String PostalCode) {
		this.PostalCode = PostalCode;
	}

	@javax.persistence.Column(name = "CountryRegionName", nullable = false, length = 50)
	public java.lang.String getCountryRegionName() {
		return this.CountryRegionName;
	}

	public void setCountryRegionName(java.lang.String CountryRegionName) {
		this.CountryRegionName = CountryRegionName;
	}

	@javax.persistence.Column(name = "Demographics")
	public java.lang.Object getDemographics() {
		return this.Demographics;
	}

	public void setDemographics(java.lang.Object Demographics) {
		this.Demographics = Demographics;
	}
}
