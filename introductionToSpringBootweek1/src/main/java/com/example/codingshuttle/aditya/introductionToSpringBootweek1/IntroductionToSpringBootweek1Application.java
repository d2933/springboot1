package com.example.codingshuttle.aditya.introductionToSpringBootweek1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class IntroductionToSpringBootweek1Application implements CommandLineRunner {

	  //This Autowired annotation will notify our spring Boot application
	  // is to inject this bean in application wherever it needs it.
@Autowired
DBService dbservice;

//	@Autowired
//	Apple obj1;
//	@Autowired
//	Car c;
//	@Autowired
//	Apple obj2;

	public static void main(String[] args) {
		SpringApplication.run(IntroductionToSpringBootweek1Application.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		// *this is a Non-Static Main Method
//		obj1.eatApple();
//		obj2.eatApple();
//		c.getCar();

		System.out.println(dbservice.getData());
	}
}
