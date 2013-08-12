package org.jooq.util.maven.entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

/**
 * TODO write documentation<br>
 *<br>
 * Created at 26/07/13 17:41.<br>
 *
 * @author Kevin
 * @since 2.10
 *
 */
@Entity
@DiscriminatorValue("GIRL")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Girl extends Child {

}
