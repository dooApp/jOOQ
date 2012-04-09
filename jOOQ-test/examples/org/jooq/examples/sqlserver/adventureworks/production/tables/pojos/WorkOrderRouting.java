/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.sqlserver.adventureworks.production.tables.pojos;

/**
 * This class is generated by jOOQ.
 */
@javax.persistence.Entity
@javax.persistence.Table(name = "WorkOrderRouting", schema = "Production", uniqueConstraints = {
	@javax.persistence.UniqueConstraint(columnNames = {"WorkOrderID", "ProductID", "OperationSequence"})
})
public class WorkOrderRouting implements java.io.Serializable {

	private static final long serialVersionUID = 374057530;

	private java.lang.Integer    WorkOrderID;
	private java.lang.Integer    ProductID;
	private java.lang.Short      OperationSequence;
	private java.lang.Short      LocationID;
	private java.sql.Timestamp   ScheduledStartDate;
	private java.sql.Timestamp   ScheduledEndDate;
	private java.sql.Timestamp   ActualStartDate;
	private java.sql.Timestamp   ActualEndDate;
	private java.math.BigDecimal ActualResourceHrs;
	private java.math.BigDecimal PlannedCost;
	private java.math.BigDecimal ActualCost;
	private java.sql.Timestamp   ModifiedDate;

	@javax.persistence.Column(name = "WorkOrderID", nullable = false, precision = 10)
	public java.lang.Integer getWorkOrderID() {
		return this.WorkOrderID;
	}

	public void setWorkOrderID(java.lang.Integer WorkOrderID) {
		this.WorkOrderID = WorkOrderID;
	}

	@javax.persistence.Column(name = "ProductID", nullable = false, precision = 10)
	public java.lang.Integer getProductID() {
		return this.ProductID;
	}

	public void setProductID(java.lang.Integer ProductID) {
		this.ProductID = ProductID;
	}

	@javax.persistence.Column(name = "OperationSequence", nullable = false, precision = 5)
	public java.lang.Short getOperationSequence() {
		return this.OperationSequence;
	}

	public void setOperationSequence(java.lang.Short OperationSequence) {
		this.OperationSequence = OperationSequence;
	}

	@javax.persistence.Column(name = "LocationID", nullable = false, precision = 5)
	public java.lang.Short getLocationID() {
		return this.LocationID;
	}

	public void setLocationID(java.lang.Short LocationID) {
		this.LocationID = LocationID;
	}

	@javax.persistence.Column(name = "ScheduledStartDate", nullable = false)
	public java.sql.Timestamp getScheduledStartDate() {
		return this.ScheduledStartDate;
	}

	public void setScheduledStartDate(java.sql.Timestamp ScheduledStartDate) {
		this.ScheduledStartDate = ScheduledStartDate;
	}

	@javax.persistence.Column(name = "ScheduledEndDate", nullable = false)
	public java.sql.Timestamp getScheduledEndDate() {
		return this.ScheduledEndDate;
	}

	public void setScheduledEndDate(java.sql.Timestamp ScheduledEndDate) {
		this.ScheduledEndDate = ScheduledEndDate;
	}

	@javax.persistence.Column(name = "ActualStartDate")
	public java.sql.Timestamp getActualStartDate() {
		return this.ActualStartDate;
	}

	public void setActualStartDate(java.sql.Timestamp ActualStartDate) {
		this.ActualStartDate = ActualStartDate;
	}

	@javax.persistence.Column(name = "ActualEndDate")
	public java.sql.Timestamp getActualEndDate() {
		return this.ActualEndDate;
	}

	public void setActualEndDate(java.sql.Timestamp ActualEndDate) {
		this.ActualEndDate = ActualEndDate;
	}

	@javax.persistence.Column(name = "ActualResourceHrs", precision = 9, scale = 4)
	public java.math.BigDecimal getActualResourceHrs() {
		return this.ActualResourceHrs;
	}

	public void setActualResourceHrs(java.math.BigDecimal ActualResourceHrs) {
		this.ActualResourceHrs = ActualResourceHrs;
	}

	@javax.persistence.Column(name = "PlannedCost", nullable = false, precision = 19, scale = 4)
	public java.math.BigDecimal getPlannedCost() {
		return this.PlannedCost;
	}

	public void setPlannedCost(java.math.BigDecimal PlannedCost) {
		this.PlannedCost = PlannedCost;
	}

	@javax.persistence.Column(name = "ActualCost", precision = 19, scale = 4)
	public java.math.BigDecimal getActualCost() {
		return this.ActualCost;
	}

	public void setActualCost(java.math.BigDecimal ActualCost) {
		this.ActualCost = ActualCost;
	}

	@javax.persistence.Column(name = "ModifiedDate", nullable = false)
	public java.sql.Timestamp getModifiedDate() {
		return this.ModifiedDate;
	}

	public void setModifiedDate(java.sql.Timestamp ModifiedDate) {
		this.ModifiedDate = ModifiedDate;
	}
}
