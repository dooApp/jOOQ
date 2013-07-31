package org.jooq.test.jpa;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.persistence.*;

/**
 * TODO write documentation<br>
 * <br>
 * Created at 30/07/13 15:16.<br>
 *
 * @author Christophe DUFOUR
 * @since 1.1
 */
@Entity
@DiscriminatorColumn(name = "KIND")
@DiscriminatorValue("PROJECT 2")
public class Project2 {
    /**
     * The famous {@link org.slf4j.Logger}
     */
    private static final Logger logger = LoggerFactory.getLogger(Project2.class);
    @Id
    private long id;
    public String getName() {
        return name;
    }
    public long getId() {
        return id;
    }
    @Column(name = "PROJECT_NAME")
    private String name;
}
