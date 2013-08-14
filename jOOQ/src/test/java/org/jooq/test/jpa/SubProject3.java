package org.jooq.test.jpa;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.persistence.Entity;

/**
 * TODO write documentation<br>
 * <br>
 * Created at 30/07/13 15:23.<br>
 *
 * @author Christophe DUFOUR
 * @since 1.1
 */
@Entity
public class SubProject3 extends Project3 {
    /**
     * The famous {@link org.slf4j.Logger}
     */
    private static final Logger logger = LoggerFactory.getLogger(SubProject3.class);
}
