package org.jooq.util.maven;

import java.util.ResourceBundle;
import java.util.concurrent.Executor;

import com.dooapp.lib.annotation.FX;
import com.dooapp.lib.event.bus.EventBus;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * TODO write documentation<br>
 *<br>
 * Created at 30/07/13 16:29.<br>
 *
 * @author Kevin
 * @since 2.10
 *
 */
public class JPAGenerator {

	/**
	 * The famous {@link Logger}
	 */
	private static final Logger logger = LoggerFactory.getLogger(JPAGenerator.class);

	/**
	 * The famous {@link EventBus}
	 */
	@Inject
	private EventBus bus;

	/**
	 * The famous {@link java.util.ResourceBundle}
	 */
	@Inject
	private ResourceBundle rb;

	/**
	 * An {@link java.util.concurrent.Executor} going back to the FX-Thread
	 */
	@Inject
	@FX
	private Executor fx;

	/**
	 * protected constructor to prevent non IOC instantiation.
	 */
	@Inject
	protected JPAGenerator() {
	}
}
