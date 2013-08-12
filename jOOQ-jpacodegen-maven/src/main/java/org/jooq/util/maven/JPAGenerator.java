package org.jooq.util.maven;

import org.jooq.tools.JooqLogger;
import org.jooq.util.JavaGenerator;
import org.jooq.util.maven.jpa.model.JPAEntity;
import org.jooq.util.maven.jpa.writer.EntitiesFileWriter;
import org.jooq.util.maven.jpa.writer.EntityFileWriter;
import org.reflections.Reflections;

import javax.persistence.Entity;
import java.io.File;
import java.util.Properties;

/**
 * TODO write documentation<br>
 *<br>
 * Created at 30/07/13 16:29.<br>
 *
 * @author Kevin
 * @since 2.10
 *
 */
public class JPAGenerator extends JavaGenerator {

	private static final JooqLogger log = JooqLogger.getLogger(JPAGenerator.class);

	private final Reflections reflections;

	private final Properties settings;

	private String packageName;

	private String jooqPackageName;

	File generation_dir;

	public JPAGenerator(Reflections reflections, Properties settings) {
		this.reflections = reflections;
		this.settings = settings;
		generation_dir = new File(settings.getProperty("projectPath") + System.getProperty("file.separator") + settings.getProperty("directory")
				+ System.getProperty("file.separator") +
				settings
						.getProperty("packageName").replace(".", System.getProperty("file.separator")));
		if (!generation_dir.exists()) {
			generation_dir.mkdirs();
		}
		packageName = settings.getProperty("packageName");
		jooqPackageName = settings.getProperty("jooqPackageName");
	}

	public void execute() {
		EntitiesFileWriter entitiesFileWriter = new EntitiesFileWriter(generation_dir, settings.getProperty("packageName"));
		for (Class<?> jpaEntityClass : reflections.getTypesAnnotatedWith(Entity.class)) {
			generateEntityTable(jpaEntityClass);
			entitiesFileWriter.addEntity(jpaEntityClass);
		}
		entitiesFileWriter.close();
	}

	private void generateEntityTable(Class<?> jpaClass) {
		JPAEntity jpaEntity = new JPAEntity(jpaClass);
		EntityFileWriter entityFileWriter = new EntityFileWriter(jpaEntity, generation_dir, packageName, jooqPackageName);
		entityFileWriter.open();
		entityFileWriter.generateContent(reflections);
		entityFileWriter.close();
	}
}
