package org.jooq.test.jpa;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * TODO write documentation<br>
 * <br>
 * Created at 30/07/13 15:15.<br>
 *
 * @author Christophe DUFOUR
 * @since 1.1
 */
@Entity
@DiscriminatorValue("PROJECT")
public class Project {
    /**
     * The famous {@link org.slf4j.Logger}
     */
    private static final Logger logger = LoggerFactory.getLogger(Project.class);
    @Id
    private long id;
    private String name;
    public long getId() {
        return id;
    }
    public String getName() {
        return name;
    }
}
