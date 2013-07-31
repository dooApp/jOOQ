package org.jooq.impl.jpa;

import org.jooq.Record;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * TODO write documentation<br>
 * <br>
 * Created at 29/07/13 16:49.<br>
 *
 * @author Christophe DUFOUR
 * @since 1.1
 */
public abstract class Setter<ENTITY, R extends Record> {
    /**
     * The famous {@link org.slf4j.Logger}
     */
    private static final Logger logger = LoggerFactory.getLogger(Setter.class);
    public Setter() {
    }
    public abstract void set(ENTITY entity, R record) throws IllegalAccessException;
}
