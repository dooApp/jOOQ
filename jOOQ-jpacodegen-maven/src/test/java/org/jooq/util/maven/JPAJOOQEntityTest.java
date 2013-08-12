package org.jooq.util.maven;

import junit.framework.Assert;
import junit.framework.TestCase;
import org.jooq.util.maven.entity.Person;
import org.jooq.util.maven.jpa.model.JPAEntity;

/**
 * TODO write documentation<br>
 *<br>
 * Created at 12/08/13 09:51.<br>
 *
 * @author Kevin
 * @since 2.10
 *
 */
public class JPAJOOQEntityTest extends TestCase {

	public void testThatJPAClassNameIsRight() {
		JPAEntity entity = new JPAEntity(Person.class);
		Assert.assertEquals(entity.getClassName(), "Person");
	}
}
