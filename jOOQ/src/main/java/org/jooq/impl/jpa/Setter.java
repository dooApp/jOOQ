package org.jooq.impl.jpa;

import org.jooq.Record;

/**
 * TODO write documentation<br>
 * <br>
 * Created at 29/07/13 16:49.<br>
 *
 * @author Christophe DUFOUR
 * @since 1.1
 */
public abstract class Setter<ENTITY, R extends Record> {

	public Setter() {
	}

	public abstract void set(ENTITY entity, R record) throws IllegalAccessException;
}
