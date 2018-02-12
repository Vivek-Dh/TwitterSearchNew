package com.deloitte.vivek.twitter.services;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.deloitte.vivek.twitter.models.SearchPOJO;
import com.deloitte.vivek.twitter.repositories.SearchRepo;

/**
 * @author vdehariya Service Interface Implementation to pass the search
 *         parameters to the Repo layer
 *
 */
@Service
public class SearchServiceImpl implements SearchService {
	@Autowired
	private SearchRepo searchRepo; // Reference to use the autowired Repository instance.
	@Autowired
	private TextResultService textResultService;
	/** Apache Logger */
	final static Logger logger = Logger.getLogger(SearchServiceImpl.class);

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.deloitte.vivek.twitter.SearchService#searchRepo(java.lang.String)
	 * Overridden method to pass the initial query to the Repo layer and return the
	 * result
	 * 
	 * @return Response POJO from the Repo layer
	 */
	@Override
	public SearchPOJO searchRepo(String query) {
		/** Logging stack trace details */
		if (logger.isDebugEnabled()) {
			logger.debug("Inside Search Service's search Repo method with query = " + query);
		}
		SearchPOJO pojo = searchRepo.search(query);
		if (null != pojo) {
			textResultService.saveRepo(pojo.getStatuses());
		}
		else
		{
			logger.info("POJO returned is null");
		}
		return pojo; // returning SearchPOJO object obtained from Repo layer
	}

}
