package com.deloitte.vivek.twitter.repositories;

import com.deloitte.vivek.twitter.models.SearchPOJO;

/**
 * @author vdehariya Repository layer interface containing search method
 *         declaration
 */
public interface SearchRepo {
	/**
	 * @param query
	 * @return NA This method has to be implemented by the implementation class
	 */
	public SearchPOJO search(String query);
}
