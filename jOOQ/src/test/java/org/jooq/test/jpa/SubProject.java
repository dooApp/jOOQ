package org.jooq.test.jpa;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 * TODO write documentation<br>
 * <br>
 * Created at 30/07/13 15:18.<br>
 *
 * @author Christophe DUFOUR
 * @since 1.1
 */
@Entity
@DiscriminatorValue("SUBPROJECT")
public class SubProject extends Project {
    /**
     * The famous {@link org.slf4j.Logger}
     */
    private static final Logger logger = LoggerFactory.getLogger(SubProject.class);
}
