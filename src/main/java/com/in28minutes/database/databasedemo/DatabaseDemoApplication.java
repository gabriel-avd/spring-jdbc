package com.in28minutes.database.databasedemo;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.in28minutes.database.databasedemo.entity.Person;
import com.in28minutes.database.databasedemo.jdbc.PersonJdbcDao;

@SpringBootApplication
public class DatabaseDemoApplication implements CommandLineRunner{
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	PersonJdbcDao personJdbcDao;

	public static void main(String[] args) {
		SpringApplication.run(DatabaseDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		logger.info("all users -> {}", personJdbcDao.findAll());
		logger.info("user 1002 -> {}", personJdbcDao.findById(1002));
		logger.info("Deleting user 1001 -> No of rows deleted {} ", personJdbcDao.deleteById(1001));
		
		logger.info("inserting 1004 -> {} ", personJdbcDao.insert(
				new Person(1004,"Link","Hyrule", new Date())
				));
		
		logger.info("updating 1003 -> {} ", personJdbcDao.update(
				new Person(1003,"Peter","Seattle", new Date())
				));
	}
}
