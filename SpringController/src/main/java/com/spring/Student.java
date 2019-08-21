package com.spring;

import java.util.LinkedHashMap;

public class Student {
	private String firstName;
	private String lastName;
	private String country;
	private LinkedHashMap<String, String> countryOption;
	public Student() {
		//populate country Options:using ISO country code
		countryOption=new  LinkedHashMap<String, String>();
		countryOption.put("SD", "Sudan");
		countryOption.put("FR", "France");
		countryOption.put("IN", "India");
		countryOption.put("US", "USA");
		countryOption.put("DE", "Germany");
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public LinkedHashMap<String, String> getCountryOption() {
		return countryOption;
	}
	

}
