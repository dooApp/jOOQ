package org.jooq.test.jpa;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.persistence.*;
import java.util.Date;

/**
 * TODO write documentation<br>
 * <br>
 * Created at 30/07/13 15:35.<br>
 *
 * @author Christophe DUFOUR
 * @since 1.1
 */
@MappedSuperclass
public abstract class AbstractEntity {
    /**
     * The famous {@link org.slf4j.Logger}
     */
    private static final Logger logger = LoggerFactory.getLogger(AbstractEntity.class);
    @Temporal(value = TemporalType.TIMESTAMP)
    private Date creationDate;
    @Temporal(value = TemporalType.TIMESTAMP)
    private Date updateDate;
    @Transient
    private String useless;
    @PostLoad
    private void postLoad() {
        useless = Math.random() + "";
    }
    @PrePersist
    private void prepersist() {
        System.out.println("prepersist");
    }
    @PostPersist
    private void postpersist() {
        System.out.println("postpersist");
    }
}
