package com.deloitte.vivek.twitter.services;

import java.util.List;

import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;

import com.deloitte.vivek.twitter.models.SearchPOJO;
import com.deloitte.vivek.twitter.models.Statuses;

public interface TextResultService {
	public void saveRepo(List<Statuses> statuses);
	/*public Statuses findRepo(Query query);
	public void updateRepo(Query query,Update update);
	public void deleteRepo(Query query);*/
}
