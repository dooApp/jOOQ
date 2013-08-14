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
@Table(name = "THE_PROJECT_TABLE")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Project3 {
    /**
     * The famous {@link org.slf4j.Logger}
     */
    private static final Logger logger = LoggerFactory.getLogger(Project3.class);
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
