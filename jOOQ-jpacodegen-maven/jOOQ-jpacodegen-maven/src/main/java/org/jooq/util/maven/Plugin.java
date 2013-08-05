/**
 * Copyright (c) 2009-2013, Lukas Eder, lukas.eder@gmail.com
 * All rights reserved.
 *
 * This software is licensed to you under the Apache License, Version 2.0
 * (the "License"); You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * . Redistributions of source code must retain the above copyright notice, this
 *   list of conditions and the following disclaimer.
 *
 * . Redistributions in binary form must reproduce the above copyright notice,
 *   this list of conditions and the following disclaimer in the documentation
 *   and/or other materials provided with the distribution.
 *
 * . Neither the name "jOOQ" nor the names of its contributors may be
 *   used to endorse or promote products derived from this software without
 *   specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE
 * LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
 * CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
 * POSSIBILITY OF SUCH DAMAGE.
 */
package org.jooq.util.maven;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.project.MavenProject;
import org.jooq.util.GenerationTool;
import org.jooq.util.jaxb.Configuration;
import org.reflections.Reflections;
import org.reflections.util.ConfigurationBuilder;

import javax.persistence.Entity;
import javax.xml.bind.JAXB;
import java.io.File;
import java.io.StringWriter;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.List;
import java.util.regex.Pattern;

/**
 * @goal generate
 * @phase generate-sources
 * @version $Id$
 * @author Sander Plas
 */
public class Plugin extends AbstractMojo {

	/**
	 * The Maven project.
	 *
	 * @parameter expression="${project}"
	 * @required
	 * @readonly
	 */
	private MavenProject project;

	/**
	 * The jdbc settings.
	 *
	 * @parameter
	 */
	private org.jooq.util.jaxb.Jdbc jdbc;

	/**
	 * The generator settings
	 *
	 * @parameter
	 */
	private org.jooq.util.jaxb.Generator generator;

	@Override
	public void execute() throws MojoExecutionException {
		try {
			getLog().info("ELEMENTS=" + project.getCompileClasspathElements().toString());
			List runtimeClasspathElements = project.getRuntimeClasspathElements();
			URL[] runtimeUrls = new URL[runtimeClasspathElements.size()];
			for (int i = 0; i < runtimeClasspathElements.size(); i++) {
				String element = (String) runtimeClasspathElements.get(i);
				runtimeUrls[i] = new File(element).toURI().toURL();
			}
			URLClassLoader newLoader = new URLClassLoader(runtimeUrls,
					Thread.currentThread().getContextClassLoader());
			Reflections reflections = new Reflections(new ConfigurationBuilder().addClassLoader(newLoader));
			getLog().info(reflections.getResources(Pattern.compile(".*")).toString());
			for (Class<?> jpaEntityClass : reflections.getTypesAnnotatedWith(Entity.class)) {
				getLog().info(jpaEntityClass.getName());
			}
			Configuration configuration = new Configuration();
			configuration.setJdbc(jdbc);
			configuration.setGenerator(generator);
			StringWriter writer = new StringWriter();
			JAXB.marshal(configuration, writer);
			getLog().info("Using this configuration:\n" + writer.toString());
			GenerationTool.main(configuration);
		} catch (Exception ex) {
			throw new MojoExecutionException("Error running jOOQ code generation tool", ex);
		}
		project.addCompileSourceRoot(generator.getTarget().getDirectory());
	}
}
