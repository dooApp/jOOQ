package org.jooq.impl.jpa;

import org.jooq.Record;
import org.jooq.RecordMapper;
import org.jooq.exception.MappingException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import static org.jooq.tools.reflect.Reflect.accessible;

/**
 * TODO write documentation<br>
 * <br>
 * Created at 29/07/13 16:30.<br>
 *
 * @author Christophe DUFOUR
 * @since 1.1
 */
public class JPARecordMapper<R extends Record, E> implements RecordMapper<R, E> {
    /**
     * @see {@link javax.persistence.DiscriminatorColumn}
     */
    private static final String DEFAULT_DISCRIMINATOR_COLUMN_NAME = "DTYPE";
    /**
     * The famous {@link org.slf4j.Logger}
     */
    private static final Logger logger = LoggerFactory.getLogger(JPARecordMapper.class);
    private final Class<? extends E> type;
    public JPARecordMapper(Class<? extends E> type) {
        if (!isAnEntity(type)) {
            throw new MappingException("Unable to map " + type + " as far as is not annotated with @Entity");
        }
        this.type = type;
    }
    @Override
    public E map(R record) {
        Class<? extends E> realType = getRealType(type, record);
        E result = null;
        try {
            result = accessible(realType.getDeclaredConstructor()).newInstance();
        } catch (Exception e) {
            throw new MappingException("Unable to find no args public constructor on type " + realType, e);
        }
        try {
            for (Setter<E, R> setter : JPAUtils.<E, R>getSetter(result)) {
                setter.set(result, record);
            }
            //TODO find all non transient (superclass included) field
            //TODO Set value to all fields
            //TODO call an empty method to handle relationShip
            return result;
        } catch (Exception e) {
            throw new MappingException("An error ocurred when mapping record to " + type, e);
        }
    }
    /**
     * Get the real type linked from the inheritance strategy.
     *
     * @param type   the initial type
     * @param record the record with data
     * @return the real class linked to the record
     */
    public Class<? extends E> getRealType(Class<? extends E> type, R record) {
        DiscriminatorValue discriminatorValue = type.getAnnotation(DiscriminatorValue.class);
        //If there is no Discriminator column, it means we are not in an inheritance case
        if (discriminatorValue == null) {
            return type;
        }
        String discriminatorColumn = getDiscriminatorColumn(type);
        if (discriminatorValue.value().equals(record.getValue(discriminatorColumn))) {
            return type;
        }
        for (Class<? extends E> c : JPAUtils.getSubTypeOf(type)) {
            try {
                if (c.getAnnotation(DiscriminatorValue.class).value().equals(record.getValue(discriminatorColumn))) {
                    return c;
                }
            } catch (NullPointerException e) {
                //TODO log there is an child entity without @DiscriminatorValue
            }
        }
        throw new MappingException("Unable to get real type for parent " + type + " with discriminator value " + record.getValue(discriminatorColumn));
    }
    /**
     * Return the discriminator column
     *
     * @param type
     * @return
     */
    public String getDiscriminatorColumn(Class<?> type) {
        DiscriminatorColumn discriminatorColumn = type.getAnnotation(DiscriminatorColumn.class);
        if (discriminatorColumn != null) {
            return discriminatorColumn.name();
        } else {
            if (type == Object.class) {
                return DEFAULT_DISCRIMINATOR_COLUMN_NAME;
            }
            return getDiscriminatorColumn(type.getSuperclass());
        }
    }
    /**
     * @param type the class we will analysis
     * @return true if the class is annotated with @Entity
     */
    private boolean isAnEntity(Class<?> type) {
        return type.getAnnotation(Entity.class) != null;
    }
}
