package com.deloitte.vivek.twitter;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import com.deloitte.vivek.twitter.configurations.ApplicationConfiguration;
import com.deloitte.vivek.twitter.configurations.SpringMongoConfig;

/**
 * @author vdehariya This is the first class to be loaded when the project is
 *         deployed onto the server
 */
public class ApplicationInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
	/**
	 * @return Configured Spring Container
	 */
	@Override
	protected Class<?>[] getRootConfigClasses() {
		return new Class[] { ApplicationConfiguration.class,SpringMongoConfig.class };
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		return null;
	}

	/**
	 * Maps the Project API URL with rest services residing in the controller
	 */
	@Override
	protected String[] getServletMappings() {
		return new String[] { "/rest/*" };
	}
}