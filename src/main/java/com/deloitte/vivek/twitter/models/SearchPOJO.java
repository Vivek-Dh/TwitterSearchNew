package com.deloitte.vivek.twitter.models;

import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true) // JSON fields not mapped to POJO will be ignored
public class SearchPOJO {
	
	private List<Statuses> statuses; // List to store array of Results obtained from Twitter api

	/**
	 * @return the statuses list
	 */
	public List<Statuses> getStatuses() {
		return statuses;
	}

	/**
	 * @param set
	 *            the statuses to the result
	 */
	public void setStatuses(List<Statuses> statuses) {
		this.statuses = statuses;
	}

}
