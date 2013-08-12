package org.jooq.util.maven.entity;

import javax.persistence.*;

/**
 * TODO write documentation<br>
 * <br>
 * Created at 26/07/13 14:38.<br>
 *
 * @author Christophe DUFOUR
 * @since 1.1
 */
@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Table(name = "PERSON_TEST")
public class Person extends AbstractEntity {

	@Column(name = "AGE")
	public int age;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
