package org.jooq.util.maven.jpa.util;

import org.apache.maven.artifact.DependencyResolutionRequiredException;
import org.apache.maven.project.MavenProject;
import org.reflections.Reflections;
import org.reflections.util.ConfigurationBuilder;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.List;

/**
 * TODO write documentation<br>
 *<br>
 * Created at 30/07/13 15:59.<br>
 *
 * @author Kevin
 * @since 2.10
 *
 */
public class ReflectionUtils {

	public Reflections reflections;

	public ReflectionUtils(MavenProject project) throws DependencyResolutionRequiredException, MalformedURLException {
		List runtimeClasspathElements = project.getRuntimeClasspathElements();
		URL[] runtimeUrls = new URL[runtimeClasspathElements.size()];
		for (int i = 0; i < runtimeClasspathElements.size(); i++) {
			String element = (String) runtimeClasspathElements.get(i);
			runtimeUrls[i] = new File(element).toURI().toURL();
		}
		URLClassLoader newLoader = new URLClassLoader(runtimeUrls,
				Thread.currentThread().getContextClassLoader());
		reflections = new Reflections(new ConfigurationBuilder().addClassLoader(newLoader)
				//	.filterInputsBy(new FilterBuilder.Include(FilterBuilder.prefix("com.dooapp.plugin.person.entity")))
				.setUrls(runtimeUrls));
	}

	public Reflections getReflexions() {
		return reflections;
	}
}
