package com.codemind.springbot.learning.MyFirstSpringbootApp;

import org.springframework.stereotype.Component;
@Component
public class Address {
	
	public Address () {
		System.out.println("Address constructor");
		
	}
	
	public String streetNo  = "140";
	public String streetName = "Nehru path using New @component bean created";
	
	public String getStreetNo() {
		return streetNo;
	}
	public void setStreetNo(String streetNo) {
		this.streetNo = streetNo;
	}
	public String getStreetName() {
		return streetName;
	}
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	@Override
	public String toString() {
		return "Address [streetNo=" + streetNo + ", streetName=" + streetName + "]";
	}
	

	
}
