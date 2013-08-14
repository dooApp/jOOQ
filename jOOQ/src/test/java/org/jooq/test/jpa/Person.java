package org.jooq.test.jpa;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.persistence.*;

/**
 * TODO write documentation<br>
 * <br>
 * Created at 30/07/13 15:28.<br>
 *
 * @author Christophe DUFOUR
 * @since 1.1
 */
@Entity
public class Person extends AbstractEntity{
    /**
     * The famous {@link org.slf4j.Logger}
     */
    private static final Logger logger = LoggerFactory.getLogger(Person.class);
    @Id
    private long id;
    private String name;
    @Embedded
    @AttributeOverrides(value = {@AttributeOverride(name = "text", column = @Column(name = "ADDRESS_TEXT"))})
    private Address address;
}
