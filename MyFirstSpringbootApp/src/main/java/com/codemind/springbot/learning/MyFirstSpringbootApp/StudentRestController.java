package com.codemind.springbot.learning.MyFirstSpringbootApp;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/** REST API for accesss Student DATA
 * 
 * @author Pankaj Sharma
 *
 */
@RestController
public class StudentRestController {
	
	@Autowired
	StudentRepository repo ;
	
	@RequestMapping("/getstudents")
	public List<Student> getStudents() {
		
		
		Iterable<Student> students = repo.findAll();  // null pointer exception
		List<Student> stlist = new ArrayList<>() ;
		
		students.forEach(x-> stlist.add(x));
		
		System.out.println(stlist);
		return stlist ;
	}
	
	@RequestMapping(path="/saveStudent",method= RequestMethod.POST)
	public String saveStudents(@RequestBody Student st) {

		repo.save(st);
		return "Student saved successfully";

	}
	
	
	

}
