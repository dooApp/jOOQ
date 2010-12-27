/**
 * This class is generated by jOOQ
 */
package org.jooq.util.oracle.sys.tables.records;


import java.math.BigDecimal;

import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.impl.TableRecordImpl;
import org.jooq.util.oracle.sys.tables.AllTypes;


/**
 * This class is generated by jOOQ.
 *
 * Description of types accessible to the user
 */
@Generated(value    = "http://jooq.sourceforge.net",
           comments = "This class is generated by jOOQ")
public class AllTypesRecord extends TableRecordImpl<AllTypesRecord> {

	private static final long serialVersionUID = -269734632;

	/**
	 * Owner of the type
	 */
	public void setOwner(String value) {
		setValue(AllTypes.OWNER, value);
	}

	/**
	 * Owner of the type
	 */
	public String getOwner() {
		return getValue(AllTypes.OWNER);
	}

	/**
	 * Name of the type
	 */
	public void setTypeName(String value) {
		setValue(AllTypes.TYPE_NAME, value);
	}

	/**
	 * Name of the type
	 */
	public String getTypeName() {
		return getValue(AllTypes.TYPE_NAME);
	}

	/**
	 * Object identifier (OID) of the type
	 */
	public void setTypeOid(byte[] value) {
		setValue(AllTypes.TYPE_OID, value);
	}

	/**
	 * Object identifier (OID) of the type
	 */
	public byte[] getTypeOid() {
		return getValue(AllTypes.TYPE_OID);
	}

	/**
	 * Typecode of the type
	 */
	public void setTypecode(String value) {
		setValue(AllTypes.TYPECODE, value);
	}

	/**
	 * Typecode of the type
	 */
	public String getTypecode() {
		return getValue(AllTypes.TYPECODE);
	}

	/**
	 * Number of attributes in the type
	 */
	public void setAttributes(BigDecimal value) {
		setValue(AllTypes.ATTRIBUTES, value);
	}

	/**
	 * Number of attributes in the type
	 */
	public BigDecimal getAttributes() {
		return getValue(AllTypes.ATTRIBUTES);
	}

	/**
	 * Number of methods in the type
	 */
	public void setMethods(BigDecimal value) {
		setValue(AllTypes.METHODS, value);
	}

	/**
	 * Number of methods in the type
	 */
	public BigDecimal getMethods() {
		return getValue(AllTypes.METHODS);
	}

	/**
	 * Is the type a predefined type?
	 */
	public void setPredefined(String value) {
		setValue(AllTypes.PREDEFINED, value);
	}

	/**
	 * Is the type a predefined type?
	 */
	public String getPredefined() {
		return getValue(AllTypes.PREDEFINED);
	}

	/**
	 * Is the type an incomplete type?
	 */
	public void setIncomplete(String value) {
		setValue(AllTypes.INCOMPLETE, value);
	}

	/**
	 * Is the type an incomplete type?
	 */
	public String getIncomplete() {
		return getValue(AllTypes.INCOMPLETE);
	}

	/**
	 * Is the type a final type?
	 */
	public void setFinal(String value) {
		setValue(AllTypes.FINAL, value);
	}

	/**
	 * Is the type a final type?
	 */
	public String getFinal() {
		return getValue(AllTypes.FINAL);
	}

	/**
	 * Is the type an instantiable type?
	 */
	public void setInstantiable(String value) {
		setValue(AllTypes.INSTANTIABLE, value);
	}

	/**
	 * Is the type an instantiable type?
	 */
	public String getInstantiable() {
		return getValue(AllTypes.INSTANTIABLE);
	}

	/**
	 * Owner of the supertype (null if type is not a subtype)
	 */
	public void setSupertypeOwner(String value) {
		setValue(AllTypes.SUPERTYPE_OWNER, value);
	}

	/**
	 * Owner of the supertype (null if type is not a subtype)
	 */
	public String getSupertypeOwner() {
		return getValue(AllTypes.SUPERTYPE_OWNER);
	}

	/**
	 * Name of the supertype (null if type is not a subtype)
	 */
	public void setSupertypeName(String value) {
		setValue(AllTypes.SUPERTYPE_NAME, value);
	}

	/**
	 * Name of the supertype (null if type is not a subtype)
	 */
	public String getSupertypeName() {
		return getValue(AllTypes.SUPERTYPE_NAME);
	}

	/**
	 * Number of local (not inherited) attributes (if any) in the subtype
	 */
	public void setLocalAttributes(BigDecimal value) {
		setValue(AllTypes.LOCAL_ATTRIBUTES, value);
	}

	/**
	 * Number of local (not inherited) attributes (if any) in the subtype
	 */
	public BigDecimal getLocalAttributes() {
		return getValue(AllTypes.LOCAL_ATTRIBUTES);
	}

	/**
	 * Number of local (not inherited) methods (if any) in the subtype
	 */
	public void setLocalMethods(BigDecimal value) {
		setValue(AllTypes.LOCAL_METHODS, value);
	}

	/**
	 * Number of local (not inherited) methods (if any) in the subtype
	 */
	public BigDecimal getLocalMethods() {
		return getValue(AllTypes.LOCAL_METHODS);
	}

	/**
	 * Type id value of the type
	 */
	public void setTypeid(byte[] value) {
		setValue(AllTypes.TYPEID, value);
	}

	/**
	 * Type id value of the type
	 */
	public byte[] getTypeid() {
		return getValue(AllTypes.TYPEID);
	}

	public AllTypesRecord(Configuration configuration) {
		super(configuration, AllTypes.ALL_TYPES);
	}
}
