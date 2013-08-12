package org.jooq.util.maven.entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 * TODO write documentation<br>
 *<br>
 * Created at 01/08/13 17:18.<br>
 *
 * @author Kevin
 * @since 2.10
 *
 */
@Entity
@DiscriminatorValue("SUBBOY_DISCRIMNATOR")
public class SubBoy extends Boy {

}
