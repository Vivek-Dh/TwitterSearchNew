package com.deloitte.vivek.twitter.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

import com.deloitte.vivek.twitter.models.SearchPOJO;
import com.deloitte.vivek.twitter.models.Statuses;
import com.deloitte.vivek.twitter.repositories.TextResultRepo;
@Service
public class TextResultServiceImpl implements TextResultService {
	@Autowired
	TextResultRepo textResultRepo;
	@Override
	public void saveRepo(List<Statuses> statuses) {
		// TODO Auto-generated method stub
		textResultRepo.saveResults(statuses);
	}
	/*
	@Override
	public User findRepo(Query query) {
		// TODO Auto-generated method stub
		return mongoRepo.findUser(query);
	}

	@Override
	public void updateRepo(Query query,Update update) {
		// TODO Auto-generated method stub
		mongoRepo.updateUser(query,update);
	}

	@Override
	public void deleteRepo(Query query) {
		// TODO Auto-generated method stub
		mongoRepo.deleteUser(query);
	}*/
	
}
