package org.jooq.test.jpa;

import org.jooq.DSLContext;
import org.jooq.SQLDialect;
import org.jooq.impl.DSL;
import org.junit.Assert;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import static org.hamcrest.core.Is.is;
import static org.jooq.impl.DSL.fieldByName;
import static org.jooq.impl.DSL.tableByName;

/**
 * TODO write documentation<br>
 * <br>
 * Created at 31/07/13 10:25.<br>
 *
 * @author Christophe DUFOUR
 * @since 1.1
 */
public class JPATest {

	/**
	 * The famous {@link org.slf4j.Logger}
	 */
	private static final Logger logger = LoggerFactory.getLogger(JPATest.class);

	@Test
	public void testProject() throws Exception {
		Connection con = DriverManager.getConnection("jdbc:h2:mem:project", "", "");
		Statement stmt = con.createStatement();
		stmt.execute("CREATE TABLE PROJECT (ID int,  NAME varchar(255),  DTYPE varchar(255),PRIMARY KEY (ID));");
		stmt.execute("INSERT INTO PROJECT (ID,NAME,DTYPE)  VALUES(1,  'A simple project name',  'PROJECT');");
		DSLContext db = DSL.using(con, SQLDialect.H2);
		System.out.println(db.select().from("PROJECT").fetch());
		Project p = db.select().from("PROJECT").fetchOne().into(Project.class);
		Assert.assertThat(p.getName(), is("A simple project name"));
		Assert.assertThat(p.getId(), is(1l));
	}

	@Test
	public void testProject2() throws Exception {
		Connection con = DriverManager.getConnection("jdbc:h2:mem:project2", "", "");
		Statement stmt = con.createStatement();
		stmt.execute("CREATE TABLE PROJECT2 (ID int,  PROJECT_NAME varchar(255),  KIND varchar(255)," +
				"" + "PRIMARY KEY (ID));");
		stmt.execute("INSERT INTO PROJECT2 (ID,PROJECT_NAME,KIND)  VALUES(11,  'A second project name',  " + "'PROJECT 2');");
		DSLContext db = DSL.using(con, SQLDialect.H2);
		System.out.println(db.select().from("PROJECT2").fetch());
		Project2 p = db.select().from("PROJECT2").fetchOne().into(Project2.class);
		Assert.assertThat(p.getName(), is("A second project name"));
		Assert.assertThat(p.getId(), is(11l));
	}

	@Test
	public void testProject3() throws Exception {
		Connection con = DriverManager.getConnection("jdbc:h2:mem:project3", "", "");
		Statement stmt = con.createStatement();
		stmt.execute("CREATE TABLE THE_PROJECT_TABLE (ID int,  PROJECT_NAME varchar(255),  KIND varchar(255)," + "PRIMARY KEY (ID));");
		stmt.execute("INSERT INTO THE_PROJECT_TABLE (ID,PROJECT_NAME,KIND)  VALUES(33,  'A third project name',  " + "'PROJECT');");
		DSLContext db = DSL.using(con, SQLDialect.H2);
		System.out.println(db.select().from("THE_PROJECT_TABLE").fetch());
		Project3 p = db.select().from("THE_PROJECT_TABLE").fetchOne().into(Project3.class);
		Assert.assertThat(p.getName(), is("A third project name"));
		Assert.assertThat(p.getId(), is(33l));
	}

	@Test
	public void testSubProject() throws Exception {
		Connection con = DriverManager.getConnection("jdbc:h2:mem:subproject", "", "");
		Statement stmt = con.createStatement();
		stmt.execute("CREATE TABLE PROJECT (ID int,  NAME varchar(255),  DTYPE varchar(255),PRIMARY KEY (ID));");
		stmt.execute("INSERT INTO PROJECT (ID,NAME,DTYPE)  VALUES(1,  'A simple project name',  'PROJECT');");
		stmt.execute("INSERT INTO PROJECT (ID,NAME,DTYPE)  VALUES(2,  'A simple subproject name',  'SUBPROJECT');");
		DSLContext db = DSL.using(con, SQLDialect.H2);
		System.out.println(db.select().from("PROJECT").fetch());
		Project p = db.select().from("PROJECT").where("ID=1").fetchOne().into(Project.class);
		Assert.assertThat(p.getName(), is("A simple project name"));
		Assert.assertThat(p.getId(), is(1l));
		Project subproject = db.select().from("PROJECT").where("ID=2").fetchOne().into(Project.class);
		Assert.assertThat(subproject.getClass().equals(SubProject.class), is(true));
		Assert.assertThat(subproject.getName(), is("A simple subproject name"));
		Assert.assertThat(subproject.getId(), is(2l));
	}

	@Test
	public void testSubProject2() throws Exception {
		Connection con = DriverManager.getConnection("jdbc:h2:mem:subproject2", "", "");
		Statement stmt = con.createStatement();
		stmt.execute("CREATE TABLE PROJECT2 (ID int,  PROJECT_NAME varchar(255),  KIND varchar(255)," +
				"" + "PRIMARY KEY (ID));");
		stmt.execute("INSERT INTO PROJECT2 (ID,PROJECT_NAME,KIND)  VALUES(11,  'A second project name',  " + "'PROJECT 2');");
		stmt.execute("INSERT INTO PROJECT2 (ID,PROJECT_NAME,KIND)  VALUES(12,  'A second subproject name',  " +
				"" + "'SUBPROJECT 2');");
		DSLContext db = DSL.using(con, SQLDialect.H2);
		System.out.println(db.select().from("PROJECT2").fetch());
		Project2 p = db.select().from("PROJECT2").where("ID=11").fetchOne().into(Project2.class);
		Assert.assertThat(p.getName(), is("A second project name"));
		Assert.assertThat(p.getId(), is(11l));
		Project2 subProject2 = db.select().from("PROJECT2").where("ID=12").fetchOne().into(Project2.class);
		Assert.assertThat(subProject2.getClass().equals(SubProject2.class), is(true));
		Assert.assertThat(subProject2.getName(), is("A second subproject name"));
		Assert.assertThat(subProject2.getId(), is(12l));
	}

	@Test
	public void testSubProject3() throws Exception {
		Connection con = DriverManager.getConnection("jdbc:h2:mem:subproject3", "", "");
		Statement stmt = con.createStatement();
		stmt.execute("CREATE TABLE THE_PROJECT_TABLE (ID int,  PROJECT_NAME varchar(255),  KIND varchar(255)," +
				"__JPA_CLASS varchar(255)," + "PRIMARY KEY (ID));");
		stmt.execute("INSERT INTO THE_PROJECT_TABLE (ID,PROJECT_NAME,__JPA_CLASS)  VALUES(1,  " +
				"'A third project name', 'org.jooq.test.jpa.Project3');");
		stmt.execute("INSERT INTO THE_PROJECT_TABLE (ID,PROJECT_NAME,__JPA_CLASS)  VALUES(2,  " +
				"'A simple subproject name','org.jooq.test.jpa.SubProject3');");
		DSLContext db = DSL.using(con, SQLDialect.H2);
		System.out.println(db.select().from("THE_PROJECT_TABLE").fetch());
		Project3 p = db.select().from("THE_PROJECT_TABLE").where("ID=1").fetchOne().into(Project3.class);
		Assert.assertThat(p.getName(), is("A third project name"));
		Assert.assertThat(p.getId(), is(1l));
		Project3 subProject3 = db.select().from("THE_PROJECT_TABLE").where("ID=2").fetchOne().into(Project3.class);
		Assert.assertThat(subProject3.getClass().equals(SubProject3.class), is(true));
		Assert.assertThat(subProject3.getName(), is("A simple subproject name"));
		Assert.assertThat(subProject3.getId(), is(2l));
	}

	@Test
	public void dummyTest() throws Exception {
		Connection con = DriverManager.getConnection("jdbc:h2:mem:dummy", "", "");
		Statement stmt = con.createStatement();
		stmt.execute("CREATE TABLE THE_PROJECT_TABLE (ID int,  PROJECT_NAME varchar(255),  KIND varchar(255)," +
				"TOTO varchar(10)," + "PRIMARY KEY (ID));");
		stmt.execute("CREATE TABLE THE_PROJECT_TABLE2 (ID int,  PROJECT_NAME varchar(255),  KIND varchar(255)," +
				"" + "PRIMARY KEY (ID));");
		stmt.execute("INSERT INTO THE_PROJECT_TABLE (ID,PROJECT_NAME,KIND,TOTO)  VALUES(33,  'A third project name', " +
				" " + "'PROJECT','TOTO');");
		stmt.execute("INSERT INTO THE_PROJECT_TABLE2 (ID,PROJECT_NAME,KIND)  VALUES(34,  'A third project name',  " +
				"" + "'PROJECT');");
		DSLContext db = DSL.using(con, SQLDialect.H2);
		Object result = db.select().from("THE_PROJECT_TABLE").union(db.select(fieldByName("ID"), fieldByName("PROJECT_NAME"), fieldByName("KIND"), DSL.value("FAKEVALUE").as("TOTO")).from(tableByName("THE_PROJECT_TABLE2"))).fetch();
		System.out.println(result);
		//System.out.println(result.get(0).getValue("ID"));
	}

	@Test
	public void testSubProjectWithDiscrimColumn() throws Exception {
		Connection con = DriverManager.getConnection("jdbc:h2:mem:subproject", "", "");
		Statement stmt = con.createStatement();
		stmt.execute("CREATE TABLE PROJECTWITHDISCRIMCOLUMN (ID int,  NAME varchar(255),  " +
				"TYPE varchar(255),PRIMARY KEY (ID));");
		stmt.execute("INSERT INTO PROJECTWITHDISCRIMCOLUMN (ID,NAME,TYPE)  VALUES(1,  'A simple project name',  'ProjectWithDiscrimColumn');");
		stmt.execute("INSERT INTO PROJECTWITHDISCRIMCOLUMN (ID,NAME,TYPE)  VALUES(2,  'A simple subproject name',  'SUBPROJECT');");
		DSLContext db = DSL.using(con, SQLDialect.H2);
		System.out.println(db.select().from("PROJECTWITHDISCRIMCOLUMN").fetch());
		ProjectWithDiscrimColumn p = db.select().from("PROJECTWITHDISCRIMCOLUMN").where("ID=1").fetchOne().into(ProjectWithDiscrimColumn.class);
		Assert.assertThat(p.getName(), is("A simple project name"));
		Assert.assertThat(p.getId(), is(1l));
		ProjectWithDiscrimColumn subproject = db.select().from("PROJECTWITHDISCRIMCOLUMN").where("ID=2").fetchOne().into(ProjectWithDiscrimColumn
				.class);
		Assert.assertThat(subproject.getClass().equals(SubProjectWithDiscrimColumn.class), is(true));
		Assert.assertThat(subproject.getName(), is("A simple subproject name"));
		Assert.assertThat(subproject.getId(), is(2l));
	}
}
