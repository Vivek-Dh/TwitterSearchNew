package com.deloitte.vivek.twitter.repositories;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Repository;

import com.deloitte.vivek.twitter.models.SearchPOJO;
import com.deloitte.vivek.twitter.models.Statuses;
import com.deloitte.vivek.twitter.services.SearchServiceImpl;

@Repository
public class TextResultRepoImpl implements TextResultRepo {

	@Autowired
	private MongoTemplate mongoTemplate;
	final static Logger logger = Logger.getLogger(TextResultRepoImpl.class);

	@Override
	public void saveResults(List<Statuses> statuses) {
		mongoTemplate.insertAll(statuses);
		if (logger.isDebugEnabled()) {
			logger.info("Inside TextResultRepo's saveResults method");
		}
		// TODO Auto-generated method stub

	}
	/*
	 * @Override public User findUser(Query query) { // TODO Auto-generated method
	 * stub return (User) mongoTemplate.find(query, User.class); }
	 * 
	 * @Override public void updateUser(Query query,Update update) { // TODO
	 * Auto-generated method stub mongoTemplate.updateMulti(query, update,
	 * User.class); }
	 * 
	 * @Override public void deleteUser(Query query) { // TODO Auto-generated method
	 * stub mongoTemplate.remove(query, User.class); }
	 */
}
