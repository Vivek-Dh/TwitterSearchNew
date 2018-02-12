package com.deloitte.vivek.twitter.configurations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoDbFactory;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.mongodb.MongoClient;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.deloitte.vivek.twitter")
public class SpringMongoConfig {
	@Bean
	public MongoDbFactory mongoDbFactory() throws Exception {
		System.out.println("factory");
		return new SimpleMongoDbFactory(new MongoClient("localhost", 27017), "TwitterDB");
	}

	@Bean
	public MongoTemplate mongoTemplate() throws Exception {
		System.out.println("mongo");
		MongoTemplate mongoTemplate = new MongoTemplate(mongoDbFactory());
		System.out.println("mongonext");
		return mongoTemplate;

	}

}