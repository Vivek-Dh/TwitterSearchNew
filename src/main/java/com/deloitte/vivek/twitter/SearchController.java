package com.deloitte.vivek.twitter;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.deloitte.vivek.twitter.models.SearchPOJO;
import com.deloitte.vivek.twitter.services.SearchService;

/**
 * Search controller used to
 * 
 * * expose twitter search api
 * 
 * @author vdehariya
 *
 */
@RestController
@RequestMapping("/search")
public class SearchController {

	/** Search Service Object Encapsulating Twitter Search */
	@Autowired
	private SearchService searchService;

	/** Apache Logger */
	final static Logger logger = Logger.getLogger(SearchController.class);

	/**
	 * "/search/context" api which will query twitter
	 * 
	 * @param query
	 *            is the text that would be searched on twitter
	 * @return Search Response containing the top 50 text
	 */
	@RequestMapping(value = "/context", method = RequestMethod.POST)
	public SearchPOJO context(@RequestParam(value = "query") String query) {
		/** Logging stack trace details */
		if (logger.isDebugEnabled()) {
			logger.debug("In SearchController's context method with query " + query);
		}
		return searchService.searchRepo(query); // returning JSON data back to the Request source
	}
}
