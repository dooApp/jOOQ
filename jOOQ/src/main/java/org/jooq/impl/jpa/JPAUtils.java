package org.jooq.impl.jpa;

import org.jooq.Record;
import org.reflections.Reflections;
import org.reflections.scanners.SubTypesScanner;
import org.reflections.scanners.TypeAnnotationsScanner;
import org.reflections.util.ClasspathHelper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.persistence.*;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

/**
 * TODO write documentation<br>
 * <br>
 * Created at 29/07/13 16:42.<br>
 *
 * @author Christophe DUFOUR
 * @since 1.1
 */
public class JPAUtils {
    /**
     * The famous {@link org.slf4j.Logger}
     */
    private static final Logger logger = LoggerFactory.getLogger(JPAUtils.class);
    private static final Reflections reflections = new Reflections(ClasspathHelper.forJavaClassPath(), new SubTypesScanner(), new TypeAnnotationsScanner());
    //TODO handle the persistence.xml
    private static final Set<Class<?>> entities = reflections.getTypesAnnotatedWith(Entity.class);
    static {
        logger.info("Loaded entities are : {}", entities);
    }
    public static Set<Class<?>> getAllEntities() {
        return entities;
    }
    public static <E> Set<Class<? extends E>> getSubTypeOf(Class<E> clazz) {
        Set<Class<? extends E>> result = new HashSet<Class<? extends E>>();
        for (Class<?> c : getAllEntities()) {
            if (clazz.isAssignableFrom(c)) {
                result.add((Class<? extends E>) c);
            }
        }
        return result;
    }
    /**
     * Provides a list of setter to be used to set value into the entity.
     *
     * @param entity
     * @param <E>
     * @return
     */
    public static <E, R extends Record> List<Setter<E, R>> getSetter(E entity) {
        //TODO do it once by class and handle cache
        Class<E> type = (Class<E>) entity.getClass();
        List<Setter<E, R>> result = new LinkedList<Setter<E, R>>();
        boolean findByField = true;
        try {
            Access access = type.getAnnotation(Access.class);
            if (access != null && access.value() == AccessType.PROPERTY) {
                findByField = false;
            }
        } catch (Exception ignore) {
            //Should means we do not have JPA 2.0
        }
        if (findByField) {
            addFieldsFromType(type, result);
        } else {
        }
        return result;
    }
    private static <E, R extends Record> void addFieldsFromType(Class<E> type, List<Setter<E, R>> result) {
        if (type.isAnnotationPresent(Entity.class) || type.isAnnotationPresent(MappedSuperclass.class)) {
            for (Field field : type.getDeclaredFields()) {
                if ((field.getModifiers() & Modifier.STATIC) == 0 && field.getAnnotation(Transient.class) == null) {
                    result.add(new FieldSetter<E, R>(field, getColumnName(field)));
                }
            }
            addFieldsFromType((Class<E>) type.getSuperclass(), result);
        }
    }
    private static String getColumnName(Field field) {
        Column column = field.getAnnotation(Column.class);
        if (column != null && column.name() != null) {
            return column.name();
        }
        return field.getName().toUpperCase();
    }
    //private static generateSetterFromFields
}
