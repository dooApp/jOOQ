package org.jooq.impl.jpa;

import org.jooq.Record;

import java.lang.reflect.Field;

/**
 * TODO write documentation<br>
 * <br>
 * Created at 29/07/13 17:00.<br>
 *
 * @author Christophe DUFOUR
 */
public class FieldSetter<ENTITY, R extends Record> extends Setter<ENTITY, R> {
    private final Field field;
    private final String name;
    public FieldSetter(Field field, String name) {
        this.field = field;
        field.setAccessible(true);
        this.name = name;
    }
    @Override
    public void set(ENTITY entity, R record) throws IllegalAccessException {
        Class<?> mType = field.getType();
        if (mType.isPrimitive()) {
            if (mType == byte.class) {
                field.setByte(entity, record.getValue(name, byte.class));
            } else if (mType == short.class) {
                field.setShort(entity, record.getValue(name, short.class));
            } else if (mType == int.class) {
                field.setInt(entity, record.getValue(name, int.class));
            } else if (mType == long.class) {
                field.setLong(entity, record.getValue(name, long.class));
            } else if (mType == float.class) {
                field.setFloat(entity, record.getValue(name, float.class));
            } else if (mType == double.class) {
                field.setDouble(entity, record.getValue(name, double.class));
            } else if (mType == boolean.class) {
                field.setBoolean(entity, record.getValue(name, boolean.class));
            } else if (mType == char.class) {
                field.setChar(entity, record.getValue(name, char.class));
            }
        } else {
            field.set(entity, record.getValue(name, mType));
        }
    }
}
