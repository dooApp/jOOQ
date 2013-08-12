package org.jooq.util.maven.entity;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 * TODO write documentation<br>
 *<br>
 * Created at 26/07/13 17:39.<br>
 *
 * @author Kevin
 * @since 2.10
 *
 */
@Entity
@DiscriminatorValue("BOY")
@DiscriminatorColumn(name = "SUB_BOY_TYPE")
public class Boy extends Child {

}
