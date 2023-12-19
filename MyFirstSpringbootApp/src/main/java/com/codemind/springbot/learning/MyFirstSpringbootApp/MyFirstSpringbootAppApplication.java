package com.codemind.springbot.learning.MyFirstSpringbootApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class MyFirstSpringbootAppApplication {

	public static void main(String[] args) {
		
		SpringApplication.run(MyFirstSpringbootAppApplication.class, args);
		
		
	/**
		ConfigurableApplicationContext appcontext = SpringApplication.run(MyFirstSpringbootAppApplication.class, args);
		
		Employee emp = appcontext.getBean(Employee.class);
		//System.out.println(emp);
		
		
		StudentRepository repo = appcontext.getBean(StudentRepository.class);
		
		long totalRecords = repo.count();
		
		
		System.out.println("Total Records in Student Table is :: "+ totalRecords);
		
		repo.findAll().forEach(x -> System.out.println(x));
		
		**/
		
	}

}
