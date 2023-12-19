package com.codemind.springbot.learning.MyFirstSpringbootApp;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
	
	@RequestMapping("/greetingforAM")
	public String getAMgreeting() {
		
		return "Good Morning";
	}
	
	@RequestMapping("/greetingforPM")
	public String getPMgreeting() {
		
		return "Good Evening";
	}
	
	
	@RequestMapping("/getStudentList")
	public List<Student> getStudents() {
		
		List<Student> stlist = new ArrayList<>();
		Student st1 = new Student() ;
		st1.setCity("agra");
		st1.setCourse("java");
		st1.setId("456");
		st1.setName("Aditya");
		st1.setSchool("VVPS");
		
		Student st = new Student() ;
		st.setCity("Varanasi");
		st.setCourse("C#");
		st.setId("126");
		st.setName("Pawan");
		st.setSchool("Subodh public school");
		
		
		
		stlist.add(st1);
		stlist.add(st);
		
		
		return stlist;
	}

	
	
	
}
