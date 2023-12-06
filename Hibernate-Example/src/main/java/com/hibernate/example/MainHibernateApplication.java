package com.hibernate.example;

import org.hibernate.Session;

public class MainHibernateApplication {
	
	public static void main(String[] args) {
		System.out.println("this is my hibernate project ");
		
		//save my Student object using session Factory
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		
		
		
		
		Student st1 = new Student();
		st1.setId("56474");
		st1.setName("Mohit");
		st1.setCity("Bhopal");
		st1.setCourse("maths");
		st1.setSchool("VVPS");
		session.save(st1);
		
		
		//Student st  = session.load(Student.class, "457");
		
		System.out.println(st1);
		
		
		// Any class's object is this. that class should be @Entity
		
		session.getTransaction().commit();
		
		HibernateUtil.shutdown();
		
		

	}

}
