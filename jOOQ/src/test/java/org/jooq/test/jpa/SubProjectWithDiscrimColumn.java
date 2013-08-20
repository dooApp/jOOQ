package org.jooq.test.jpa;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 * TODO write documentation<br>
 *<br>
 * Created at 14/08/13 17:06.<br>
 *
 * @author Kevin
 * @since 2.10
 *
 */
@Entity
@DiscriminatorValue("SUBPROJECT")
public class SubProjectWithDiscrimColumn extends ProjectWithDiscrimColumn {

	/**
	 * The famous {@link org.slf4j.Logger}
	 */
	private static final Logger logger = LoggerFactory.getLogger(SubProjectWithDiscrimColumn.class);
}
