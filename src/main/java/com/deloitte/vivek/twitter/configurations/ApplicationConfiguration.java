package com.deloitte.vivek.twitter.configurations;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.social.twitter.api.impl.TwitterTemplate;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * @author vdehariya
 *
 */
@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.deloitte.vivek.twitter")
@PropertySource("classpath:config.properties")
public class ApplicationConfiguration {
	/**
	 * Accessing twitter validation keys through properties file
	 */
	@Value("${consumerKey}")
	private String consumerKey; // String containing ConsumerKey for the Twitter Application
	@Value("${consumerSecret}")
	private String consumerSecret; // String containing ConsumerSecret for the Twitter Application
	@Value("${accessToken}")
	private String accessToken; // String containing AccessToken for the Twitter Application
	@Value("${accessTokenSecret}")
	private String accessTokenSecret; // String containing AccessTokenSecret for the Twitter Application
	final static Logger logger = Logger.getLogger(ApplicationConfiguration.class);

	/**
	 * Configuring the twitter template with validation keys
	 * 
	 * @return TwitterRestTemplate object
	 */
	@Bean
	public RestTemplate getRestTemplate() {
		/** Logging stack trace details */
		if (logger.isDebugEnabled()) {
			logger.debug("Inside Spring APP INIT Application Configuration's getRestTemplate method");
		}
		/**
		 * Configuring Twitter Template with the validation keys and converting it to a
		 * RestTemplate
		 */
		TwitterTemplate tte = new TwitterTemplate(consumerKey, consumerSecret, accessToken, accessTokenSecret);
		RestTemplate restTemplate = tte.getRestTemplate();
		return restTemplate; // Storing the configured TwitterRestTemplate into Container
	}
}
