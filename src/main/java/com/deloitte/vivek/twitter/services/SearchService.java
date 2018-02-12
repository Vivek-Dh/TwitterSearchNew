package com.deloitte.vivek.twitter.services;

import com.deloitte.vivek.twitter.models.SearchPOJO;

/**
 * @author vdehariya Service layer interface containing searchRepo method
 *         declaration
 */
public interface SearchService {
	/**
	 * @param query
	 * @return NA This method has to be implemented by the implementation class
	 */
	public SearchPOJO searchRepo(String query);
}
