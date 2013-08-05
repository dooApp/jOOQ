package org.jooq.jpa;

import org.jooq.Record;
import org.jooq.TableLike;

import javax.persistence.InheritanceType;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: ksenechal
 * Date: 31/07/13
 * Time: 22:19
 * To change this template use File | Settings | File Templates.
 */
public interface JPATable<R extends Record> extends TableLike<R> {

	InheritanceType getInheritanceType();

	/**
	 * Returns the {@link javax.persistence.DiscriminatorValue discriminator value} of the annotated model
	 * @return
	 */
	String getDiscriminatorValue();
	/**
	 * Returns the {@link javax.persistence.DiscriminatorColumn discriminator column} of the annotated model.<br>
	 * The default return value is "DTYPE".
	 * @return
	 */
	String getDiscriminatorColumn();

	/**
	 * Returns the tables of model inherited entities.
	 * @return
	 */
	List<JPATable<?>> getInheritedTables();

	/**
	 * Returns the jpa table name.<br>
	 * If the {@link javax.persistence.Table column annotation} is present, it'll return its name.<br>
	 * Else it'll return the java class name to upper case.
	 * @return
	 */
	String getTableName();
	/**
	 * Returns the entity class bind to this table
	 * @return
	 */
	Class getEntityClass();
	
	/**
	 * Returns the parent table. Null if thus table is the top of the hierarchy.
	 * @return
	 */
	JPATable<?> getParentTable();
	
	/**
	 * Returns the parent inheritance type.
	 * @return
	 */
	InheritanceType getParentInheritanceType();

}
