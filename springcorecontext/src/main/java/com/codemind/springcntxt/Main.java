package com.codemind.springcntxt;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext;

public class Main {
	
	
	public static void main(String[] args) {
		
		ApplicationContext cntxt = new ClassPathXmlApplicationContext("Beans.xml");
		
		//Employee emp = cntxt.getBean(Employee.class);
		
		Employee emp1 = (Employee) cntxt.getBean("rohit");
		Employee emp2 = (Employee) cntxt.getBean("rohit");
		
	   
		/** Scopes of the Bean
		 *   1. Prototype
		 *   2. Singleton
		 *   
		 */
		
		/**
		 * Auto wiring  
		 * 
		 * 
		 */
		
			
		System.out.println(emp1);
		
		
	}

}
