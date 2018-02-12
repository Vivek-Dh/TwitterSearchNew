package com.deloitte.vivek.twitter.repositories;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

import com.deloitte.vivek.twitter.models.SearchPOJO;

/**
 * @author vdehariya Repository interface implementation to hit the Twitter API
 *         with a RestTemplate
 *
 */
@Repository
public class SearchRepoImpl implements SearchRepo {

	@Autowired
	private RestTemplate restTemplate; // Reference to assign autowired TwitterRestTemplate instance
	@Value("${APIURL}") // URL of the twitter search api
	private String APIURL;
	/** Apache Logger */
	final static Logger logger = Logger.getLogger(SearchRepoImpl.class);

	/*
	 * 
	 * (non-Javadoc)
	 * 
	 * @see com.deloitte.vivek.twitter.SearchRepo#search(java.lang.String)
	 * Overridden method to hit the Twitter api with the query[GET]
	 * 
	 * @return Response Body[JSON -> POJO] of the ResponseEntity, conversion through
	 * Jackson
	 */
	@Override
	public SearchPOJO search(String query) {
		/**
		 * Using RestTemplate's getForEntity method to hit the Twitter API with a GET
		 * request The JSON data is mapped to SearchPOJO class
		 */
		ResponseEntity<SearchPOJO> response = restTemplate.getForEntity(APIURL + query, SearchPOJO.class);
		System.out.println(response.getStatusCode());
		/** Logging stack trace details */
		if (logger.isDebugEnabled()) {
			logger.debug("Inside Search Repo's search method with query = " + query);
		}
		return response.getBody(); // returning a SearchPOJO object to the service layer
	}
}
