package com.deloitte.vivek.twitter.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author vdehariya This class is used to store the JSON field values
 */
@Document(collection = "responseCollection")
@JsonIgnoreProperties(ignoreUnknown = true) // JSON fields not mapped to POJO will be ignored
public class Statuses {
	
	private String text; // Attribute to store text field from the obtained JSON data

	/**
	 * Getter method for text
	 */
	public String getText() {
		return text;
	}

	/**
	 * Setter method for text
	 */
	public void setText(String text) {
		this.text = text;
	}
}
