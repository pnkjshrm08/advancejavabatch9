package com.codemind.springbot.learning.MyFirstSpringbootApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee {
	
    @Autowired
	public Address address ;
   
    @Value("${companyName}")
    public String companyName ;
    
    
    

	public Employee() {
		
		System.out.println("constructor get called Employee !!");
	}

	

	public Address getAddress() {
		return address;
	}



	public void setAddress(Address address) {
		this.address = address;
	}



	@Override
	public String toString() {
		return "Employee [empName=" + address + "companyName"+ companyName +"]";
	}

}
