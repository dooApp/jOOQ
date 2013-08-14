package org.jooq.test.jpa;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Embeddable;

/**
 * TODO write documentation<br>
 * <br>
 * Created at 30/07/13 15:29.<br>
 *
 * @author Christophe DUFOUR
 * @since 1.1
 */
@Embeddable
@Access(AccessType.PROPERTY)
public class Address {
    /**
     * The famous {@link org.slf4j.Logger}
     */
    private static final Logger logger = LoggerFactory.getLogger(Address.class);
    private String text;
    private String zip;
    private String city;
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public static Logger getLogger() {
        return logger;
    }
    public String getText() {
        return text;
    }
    public void setText(String text) {
        this.text = text;
    }
    public String getZip() {
        return zip;
    }
    public void setZip(String zip) {
        this.zip = zip;
    }
}
