/**
 * This class is generated by jOOQ
 */
package org.jooq.test.postgres.generatedclasses.tables.pojos;

/**
 * This class is generated by jOOQ.
 */
@javax.persistence.Entity
@javax.persistence.Table(name = "t_identity_pk", schema = "public")
public class TIdentityPk implements java.io.Serializable {

	private static final long serialVersionUID = 2021214249;

	private java.lang.Integer id;
	private java.lang.Integer val;

	@javax.persistence.Id
	@javax.persistence.Column(name = "id", unique = true, nullable = false, precision = 32)
	public java.lang.Integer getId() {
		return this.id;
	}

	public void setId(java.lang.Integer id) {
		this.id = id;
	}

	@javax.persistence.Column(name = "val", precision = 32)
	public java.lang.Integer getVal() {
		return this.val;
	}

	public void setVal(java.lang.Integer val) {
		this.val = val;
	}
}
