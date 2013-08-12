package org.jooq.util.maven.entity;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

/**
 * TODO write documentation<br>
 * <br>
 * Created at 26/07/13 14:43.<br>
 *
 * @author Christophe DUFOUR
 * @since 1.1
 */
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "CHILD_TYPE")
public class Child extends AbstractEntity {

}
