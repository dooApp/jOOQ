package org.jooq.test.jpa;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 * TODO write documentation<br>
 * <br>
 * Created at 30/07/13 15:21.<br>
 *
 * @author Christophe DUFOUR
 * @since 1.1
 */
@Entity
@DiscriminatorValue("SUBPROJECT 2")
public class SubProject2 extends Project2 {
    /**
     * The famous {@link org.slf4j.Logger}
     */
    private static final Logger logger = LoggerFactory.getLogger(SubProject2.class);
}
