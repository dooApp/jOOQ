package org.jooq.util.maven.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

/**
 * TODO write documentation<br>
 *<br>
 * Created at 09/08/13 16:20.<br>
 *
 * @author Kevin
 * @since 2.10
 *
 */
@MappedSuperclass
public class AbstractEntity {

	@Id
	@Column(name = "ID")
	public long id;

	@Column(name = "NAME")
	public String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return super.toString() + " id=" + id;
	}
}
