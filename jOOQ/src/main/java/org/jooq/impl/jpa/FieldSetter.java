package org.jooq.impl.jpa;

import org.jooq.Record;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.Field;

/**
 * TODO write documentation<br>
 * <br>
 * Created at 29/07/13 17:00.<br>
 *
 * @author Christophe DUFOUR
 * @since 1.1
 */
public class FieldSetter<ENTITY, R extends Record> extends Setter<ENTITY, R> {
    /**
     * The famous {@link org.slf4j.Logger}
     */
    private static final Logger logger = LoggerFactory.getLogger(FieldSetter.class);
    private final Field field;
    private final String name;
    public FieldSetter(Field field, String name) {
        this.field = field;
        field.setAccessible(true);
        this.name = name;
    }
    @Override
    public void set(ENTITY entity, R record) throws IllegalAccessException {
        field.set(entity, record.getValue(name));
    }
}
