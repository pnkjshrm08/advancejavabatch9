package com.codemind.springcntxt;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext;

public class Main {
	
	
	public static void main(String[] args) {
		
		ApplicationContext cntxt = new ClassPathXmlApplicationContext("Beans.xml");
		
		Employee emp = cntxt.getBean(Employee.class);
		
		System.out.println(emp);
		
		
	}

}
