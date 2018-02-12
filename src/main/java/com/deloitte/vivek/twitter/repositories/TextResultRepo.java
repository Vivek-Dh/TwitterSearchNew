package com.deloitte.vivek.twitter.repositories;

import java.util.List;

import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;

import com.deloitte.vivek.twitter.models.SearchPOJO;
import com.deloitte.vivek.twitter.models.Statuses;

public interface TextResultRepo {
	public void saveResults(List<Statuses> statuses);

	/*public User findUser(Query query);

	public void updateUser(Query query,Update update);

	public void deleteUser(Query query); */
}
