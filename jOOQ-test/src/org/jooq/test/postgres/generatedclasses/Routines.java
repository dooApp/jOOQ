/**
 * This class is generated by jOOQ
 */
package org.jooq.test.postgres.generatedclasses;

/**
 * This class is generated by jOOQ.
 *
 * Convenience access to all stored procedures and functions in public
 */
public final class Routines {

	/**
	 * Call public.f_arrays
	 *
	 * @param inArray
	 * @throws org.jooq.exception.DataAccessException if something went wrong executing the query
	 */
	public static java.lang.Integer[] fArrays1(org.jooq.Configuration configuration, java.lang.Integer[] inArray) {
		org.jooq.test.postgres.generatedclasses.routines.FArrays1 f = new org.jooq.test.postgres.generatedclasses.routines.FArrays1();
		f.setInArray(inArray);

		f.execute(configuration);
		return f.getReturnValue();
	}

	/**
	 * Get public.f_arrays as a field
	 *
	 * @param inArray
	 */
	public static org.jooq.Field<java.lang.Integer[]> fArrays1(java.lang.Integer[] inArray) {
		org.jooq.test.postgres.generatedclasses.routines.FArrays1 f = new org.jooq.test.postgres.generatedclasses.routines.FArrays1();
		f.setInArray(inArray);

		return f.asField();
	}

	/**
	 * Get public.f_arrays as a field
	 *
	 * @param inArray
	 */
	public static org.jooq.Field<java.lang.Integer[]> fArrays1(org.jooq.Field<java.lang.Integer[]> inArray) {
		org.jooq.test.postgres.generatedclasses.routines.FArrays1 f = new org.jooq.test.postgres.generatedclasses.routines.FArrays1();
		f.setInArray(inArray);

		return f.asField();
	}

	/**
	 * Call public.f_arrays
	 *
	 * @param inArray
	 * @throws org.jooq.exception.DataAccessException if something went wrong executing the query
	 */
	public static java.lang.Long[] fArrays2(org.jooq.Configuration configuration, java.lang.Long[] inArray) {
		org.jooq.test.postgres.generatedclasses.routines.FArrays2 f = new org.jooq.test.postgres.generatedclasses.routines.FArrays2();
		f.setInArray(inArray);

		f.execute(configuration);
		return f.getReturnValue();
	}

	/**
	 * Get public.f_arrays as a field
	 *
	 * @param inArray
	 */
	public static org.jooq.Field<java.lang.Long[]> fArrays2(java.lang.Long[] inArray) {
		org.jooq.test.postgres.generatedclasses.routines.FArrays2 f = new org.jooq.test.postgres.generatedclasses.routines.FArrays2();
		f.setInArray(inArray);

		return f.asField();
	}

	/**
	 * Get public.f_arrays as a field
	 *
	 * @param inArray
	 */
	public static org.jooq.Field<java.lang.Long[]> fArrays2(org.jooq.Field<java.lang.Long[]> inArray) {
		org.jooq.test.postgres.generatedclasses.routines.FArrays2 f = new org.jooq.test.postgres.generatedclasses.routines.FArrays2();
		f.setInArray(inArray);

		return f.asField();
	}

	/**
	 * Call public.f_arrays
	 *
	 * @param inArray
	 * @throws org.jooq.exception.DataAccessException if something went wrong executing the query
	 */
	public static java.lang.String[] fArrays3(org.jooq.Configuration configuration, java.lang.String[] inArray) {
		org.jooq.test.postgres.generatedclasses.routines.FArrays3 f = new org.jooq.test.postgres.generatedclasses.routines.FArrays3();
		f.setInArray(inArray);

		f.execute(configuration);
		return f.getReturnValue();
	}

	/**
	 * Get public.f_arrays as a field
	 *
	 * @param inArray
	 */
	public static org.jooq.Field<java.lang.String[]> fArrays3(java.lang.String[] inArray) {
		org.jooq.test.postgres.generatedclasses.routines.FArrays3 f = new org.jooq.test.postgres.generatedclasses.routines.FArrays3();
		f.setInArray(inArray);

		return f.asField();
	}

	/**
	 * Get public.f_arrays as a field
	 *
	 * @param inArray
	 */
	public static org.jooq.Field<java.lang.String[]> fArrays3(org.jooq.Field<java.lang.String[]> inArray) {
		org.jooq.test.postgres.generatedclasses.routines.FArrays3 f = new org.jooq.test.postgres.generatedclasses.routines.FArrays3();
		f.setInArray(inArray);

		return f.asField();
	}

	/**
	 * Call public.f_author_exists
	 *
	 * @param authorName
	 * @throws org.jooq.exception.DataAccessException if something went wrong executing the query
	 */
	public static java.lang.Integer fAuthorExists(org.jooq.Configuration configuration, java.lang.String authorName) {
		org.jooq.test.postgres.generatedclasses.routines.FAuthorExists f = new org.jooq.test.postgres.generatedclasses.routines.FAuthorExists();
		f.setAuthorName(authorName);

		f.execute(configuration);
		return f.getReturnValue();
	}

	/**
	 * Get public.f_author_exists as a field
	 *
	 * @param authorName
	 */
	public static org.jooq.Field<java.lang.Integer> fAuthorExists(java.lang.String authorName) {
		org.jooq.test.postgres.generatedclasses.routines.FAuthorExists f = new org.jooq.test.postgres.generatedclasses.routines.FAuthorExists();
		f.setAuthorName(authorName);

		return f.asField();
	}

	/**
	 * Get public.f_author_exists as a field
	 *
	 * @param authorName
	 */
	public static org.jooq.Field<java.lang.Integer> fAuthorExists(org.jooq.Field<java.lang.String> authorName) {
		org.jooq.test.postgres.generatedclasses.routines.FAuthorExists f = new org.jooq.test.postgres.generatedclasses.routines.FAuthorExists();
		f.setAuthorName(authorName);

		return f.asField();
	}

	/**
	 * Call public.f_get_one_cursor
	 *
	 * @param bookIds
	 * @throws org.jooq.exception.DataAccessException if something went wrong executing the query
	 */
	public static org.jooq.Result<org.jooq.Record> fGetOneCursor(org.jooq.Configuration configuration, java.lang.Integer[] bookIds) {
		org.jooq.test.postgres.generatedclasses.routines.FGetOneCursor f = new org.jooq.test.postgres.generatedclasses.routines.FGetOneCursor();
		f.setBookIds(bookIds);

		f.execute(configuration);
		return f.getReturnValue();
	}

	/**
	 * Get public.f_get_one_cursor as a field
	 *
	 * @param bookIds
	 */
	public static org.jooq.Field<org.jooq.Result<org.jooq.Record>> fGetOneCursor(java.lang.Integer[] bookIds) {
		org.jooq.test.postgres.generatedclasses.routines.FGetOneCursor f = new org.jooq.test.postgres.generatedclasses.routines.FGetOneCursor();
		f.setBookIds(bookIds);

		return f.asField();
	}

	/**
	 * Get public.f_get_one_cursor as a field
	 *
	 * @param bookIds
	 */
	public static org.jooq.Field<org.jooq.Result<org.jooq.Record>> fGetOneCursor(org.jooq.Field<java.lang.Integer[]> bookIds) {
		org.jooq.test.postgres.generatedclasses.routines.FGetOneCursor f = new org.jooq.test.postgres.generatedclasses.routines.FGetOneCursor();
		f.setBookIds(bookIds);

		return f.asField();
	}

	/**
	 * Call public.f_number
	 *
	 * @param n
	 * @throws org.jooq.exception.DataAccessException if something went wrong executing the query
	 */
	public static java.lang.Integer fNumber(org.jooq.Configuration configuration, java.lang.Integer n) {
		org.jooq.test.postgres.generatedclasses.routines.FNumber f = new org.jooq.test.postgres.generatedclasses.routines.FNumber();
		f.setN(n);

		f.execute(configuration);
		return f.getReturnValue();
	}

	/**
	 * Get public.f_number as a field
	 *
	 * @param n
	 */
	public static org.jooq.Field<java.lang.Integer> fNumber(java.lang.Integer n) {
		org.jooq.test.postgres.generatedclasses.routines.FNumber f = new org.jooq.test.postgres.generatedclasses.routines.FNumber();
		f.setN(n);

		return f.asField();
	}

	/**
	 * Get public.f_number as a field
	 *
	 * @param n
	 */
	public static org.jooq.Field<java.lang.Integer> fNumber(org.jooq.Field<java.lang.Integer> n) {
		org.jooq.test.postgres.generatedclasses.routines.FNumber f = new org.jooq.test.postgres.generatedclasses.routines.FNumber();
		f.setN(n);

		return f.asField();
	}

	/**
	 * Call public.f_one
	 *
	 * @throws org.jooq.exception.DataAccessException if something went wrong executing the query
	 */
	public static java.lang.Integer fOne(org.jooq.Configuration configuration) {
		org.jooq.test.postgres.generatedclasses.routines.FOne f = new org.jooq.test.postgres.generatedclasses.routines.FOne();

		f.execute(configuration);
		return f.getReturnValue();
	}

	/**
	 * Get public.f_one as a field
	 *
	 */
	public static org.jooq.Field<java.lang.Integer> fOne() {
		org.jooq.test.postgres.generatedclasses.routines.FOne f = new org.jooq.test.postgres.generatedclasses.routines.FOne();

		return f.asField();
	}

	/**
	 * Call public.f317
	 *
	 * @param p1
	 * @param p2
	 * @param p3
	 * @param p4
	 * @throws org.jooq.exception.DataAccessException if something went wrong executing the query
	 */
	public static java.lang.Integer f317(org.jooq.Configuration configuration, java.lang.Integer p1, java.lang.Integer p2, java.lang.Integer p3, java.lang.Integer p4) {
		org.jooq.test.postgres.generatedclasses.routines.F317 f = new org.jooq.test.postgres.generatedclasses.routines.F317();
		f.setP1(p1);
		f.setP2(p2);
		f.setP3(p3);
		f.setP4(p4);

		f.execute(configuration);
		return f.getReturnValue();
	}

	/**
	 * Get public.f317 as a field
	 *
	 * @param p1
	 * @param p2
	 * @param p3
	 * @param p4
	 */
	public static org.jooq.Field<java.lang.Integer> f317(java.lang.Integer p1, java.lang.Integer p2, java.lang.Integer p3, java.lang.Integer p4) {
		org.jooq.test.postgres.generatedclasses.routines.F317 f = new org.jooq.test.postgres.generatedclasses.routines.F317();
		f.setP1(p1);
		f.setP2(p2);
		f.setP3(p3);
		f.setP4(p4);

		return f.asField();
	}

	/**
	 * Get public.f317 as a field
	 *
	 * @param p1
	 * @param p2
	 * @param p3
	 * @param p4
	 */
	public static org.jooq.Field<java.lang.Integer> f317(org.jooq.Field<java.lang.Integer> p1, org.jooq.Field<java.lang.Integer> p2, org.jooq.Field<java.lang.Integer> p3, org.jooq.Field<java.lang.Integer> p4) {
		org.jooq.test.postgres.generatedclasses.routines.F317 f = new org.jooq.test.postgres.generatedclasses.routines.F317();
		f.setP1(p1);
		f.setP2(p2);
		f.setP3(p3);
		f.setP4(p4);

		return f.asField();
	}

	/**
	 * Call public.p_arrays
	 *
	 * @param inArray IN parameter
	 * @param outArray OUT parameter
	 * @throws org.jooq.exception.DataAccessException if something went wrong executing the query
	 */
	public static java.lang.Long[] pArrays2(org.jooq.Configuration configuration, java.lang.Long[] inArray) {
		org.jooq.test.postgres.generatedclasses.routines.PArrays2 p = new org.jooq.test.postgres.generatedclasses.routines.PArrays2();
		p.setInArray(inArray);

		p.execute(configuration);
		return p.getOutArray();
	}

	/**
	 * Call public.p_arrays
	 *
	 * @param inArray IN parameter
	 * @param outArray OUT parameter
	 * @throws org.jooq.exception.DataAccessException if something went wrong executing the query
	 */
	public static java.lang.Integer[] pArrays1(org.jooq.Configuration configuration, java.lang.Integer[] inArray) {
		org.jooq.test.postgres.generatedclasses.routines.PArrays1 p = new org.jooq.test.postgres.generatedclasses.routines.PArrays1();
		p.setInArray(inArray);

		p.execute(configuration);
		return p.getOutArray();
	}

	/**
	 * Call public.p_arrays
	 *
	 * @param inArray IN parameter
	 * @param outArray OUT parameter
	 * @throws org.jooq.exception.DataAccessException if something went wrong executing the query
	 */
	public static java.lang.String[] pArrays3(org.jooq.Configuration configuration, java.lang.String[] inArray) {
		org.jooq.test.postgres.generatedclasses.routines.PArrays3 p = new org.jooq.test.postgres.generatedclasses.routines.PArrays3();
		p.setInArray(inArray);

		p.execute(configuration);
		return p.getOutArray();
	}

	/**
	 * Call public.p_author_exists
	 *
	 * @param authorName IN parameter
	 * @param result OUT parameter
	 * @throws org.jooq.exception.DataAccessException if something went wrong executing the query
	 */
	public static java.lang.Integer pAuthorExists(org.jooq.Configuration configuration, java.lang.String authorName) {
		org.jooq.test.postgres.generatedclasses.routines.PAuthorExists p = new org.jooq.test.postgres.generatedclasses.routines.PAuthorExists();
		p.setAuthorName(authorName);

		p.execute(configuration);
		return p.getResult();
	}

	/**
	 * Call public.p_create_author
	 *
	 * @throws org.jooq.exception.DataAccessException if something went wrong executing the query
	 */
	public static void pCreateAuthor(org.jooq.Configuration configuration) {
		org.jooq.test.postgres.generatedclasses.routines.PCreateAuthor p = new org.jooq.test.postgres.generatedclasses.routines.PCreateAuthor();

		p.execute(configuration);
	}

	/**
	 * Call public.p_create_author_by_name
	 *
	 * @param firstName IN parameter
	 * @param lastName IN parameter
	 * @throws org.jooq.exception.DataAccessException if something went wrong executing the query
	 */
	public static void pCreateAuthorByName(org.jooq.Configuration configuration, java.lang.String firstName, java.lang.String lastName) {
		org.jooq.test.postgres.generatedclasses.routines.PCreateAuthorByName p = new org.jooq.test.postgres.generatedclasses.routines.PCreateAuthorByName();
		p.setFirstName(firstName);
		p.setLastName(lastName);

		p.execute(configuration);
	}

	/**
	 * Call public.p_enhance_address1
	 *
	 * @param address IN parameter
	 * @param no OUT parameter
	 * @throws org.jooq.exception.DataAccessException if something went wrong executing the query
	 */
	public static java.lang.String pEnhanceAddress1(org.jooq.Configuration configuration, org.jooq.test.postgres.generatedclasses.udt.records.UAddressTypeRecord address) {
		org.jooq.test.postgres.generatedclasses.routines.PEnhanceAddress1 p = new org.jooq.test.postgres.generatedclasses.routines.PEnhanceAddress1();
		p.setAddress(address);

		p.execute(configuration);
		return p.getNo();
	}

	/**
	 * Call public.p_enhance_address2
	 *
	 * @param address OUT parameter
	 * @throws org.jooq.exception.DataAccessException if something went wrong executing the query
	 */
	public static org.jooq.test.postgres.generatedclasses.udt.records.UAddressTypeRecord pEnhanceAddress2(org.jooq.Configuration configuration) {
		org.jooq.test.postgres.generatedclasses.routines.PEnhanceAddress2 p = new org.jooq.test.postgres.generatedclasses.routines.PEnhanceAddress2();

		p.execute(configuration);
		return p.getAddress();
	}

	/**
	 * Call public.p_enhance_address3
	 *
	 * @param address IN OUT parameter
	 * @throws org.jooq.exception.DataAccessException if something went wrong executing the query
	 */
	public static org.jooq.test.postgres.generatedclasses.udt.records.UAddressTypeRecord pEnhanceAddress3(org.jooq.Configuration configuration, org.jooq.test.postgres.generatedclasses.udt.records.UAddressTypeRecord address) {
		org.jooq.test.postgres.generatedclasses.routines.PEnhanceAddress3 p = new org.jooq.test.postgres.generatedclasses.routines.PEnhanceAddress3();
		p.setAddress(address);

		p.execute(configuration);
		return p.getAddress();
	}

	/**
	 * Call public.p_get_one_cursor
	 *
	 * @param total OUT parameter
	 * @param books OUT parameter
	 * @param bookIds IN parameter
	 * @throws org.jooq.exception.DataAccessException if something went wrong executing the query
	 */
	public static org.jooq.test.postgres.generatedclasses.routines.PGetOneCursor pGetOneCursor(org.jooq.Configuration configuration, java.lang.Integer[] bookIds) {
		org.jooq.test.postgres.generatedclasses.routines.PGetOneCursor p = new org.jooq.test.postgres.generatedclasses.routines.PGetOneCursor();
		p.setBookIds(bookIds);

		p.execute(configuration);
		return p;
	}

	/**
	 * Call public.p_get_two_cursors
	 *
	 * @param books OUT parameter
	 * @param authors OUT parameter
	 * @throws org.jooq.exception.DataAccessException if something went wrong executing the query
	 */
	public static org.jooq.test.postgres.generatedclasses.routines.PGetTwoCursors pGetTwoCursors(org.jooq.Configuration configuration) {
		org.jooq.test.postgres.generatedclasses.routines.PGetTwoCursors p = new org.jooq.test.postgres.generatedclasses.routines.PGetTwoCursors();

		p.execute(configuration);
		return p;
	}

	/**
	 * Call public.p_triggers
	 *
	 * @throws org.jooq.exception.DataAccessException if something went wrong executing the query
	 */
	public static java.lang.Object pTriggers(org.jooq.Configuration configuration) {
		org.jooq.test.postgres.generatedclasses.routines.PTriggers f = new org.jooq.test.postgres.generatedclasses.routines.PTriggers();

		f.execute(configuration);
		return f.getReturnValue();
	}

	/**
	 * Get public.p_triggers as a field
	 *
	 */
	public static org.jooq.Field<java.lang.Object> pTriggers() {
		org.jooq.test.postgres.generatedclasses.routines.PTriggers f = new org.jooq.test.postgres.generatedclasses.routines.PTriggers();

		return f.asField();
	}

	/**
	 * Call public.p_unused
	 *
	 * @param in1 IN parameter
	 * @param out1 OUT parameter
	 * @param out2 IN OUT parameter
	 * @throws org.jooq.exception.DataAccessException if something went wrong executing the query
	 */
	public static org.jooq.test.postgres.generatedclasses.routines.PUnused pUnused(org.jooq.Configuration configuration, java.lang.String in1, java.lang.Integer out2) {
		org.jooq.test.postgres.generatedclasses.routines.PUnused p = new org.jooq.test.postgres.generatedclasses.routines.PUnused();
		p.setIn1(in1);
		p.setOut2(out2);

		p.execute(configuration);
		return p;
	}

	/**
	 * Call public.p391
	 *
	 * @param i1 IN parameter
	 * @param io1 IN OUT parameter
	 * @param o1 OUT parameter
	 * @param o2 OUT parameter
	 * @param io2 IN OUT parameter
	 * @param i2 IN parameter
	 * @throws org.jooq.exception.DataAccessException if something went wrong executing the query
	 */
	public static org.jooq.test.postgres.generatedclasses.routines.P391 p391(org.jooq.Configuration configuration, java.lang.Integer i1, java.lang.Integer io1, java.lang.Integer io2, java.lang.Integer i2) {
		org.jooq.test.postgres.generatedclasses.routines.P391 p = new org.jooq.test.postgres.generatedclasses.routines.P391();
		p.setI1(i1);
		p.setIo1(io1);
		p.setIo2(io2);
		p.setI2(i2);

		p.execute(configuration);
		return p;
	}

	/**
	 * No instances
	 */
	private Routines() {}
}
