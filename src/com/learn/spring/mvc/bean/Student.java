package com.learn.spring.mvc.bean;

import java.util.LinkedHashMap;

public class Student {

	String firstName;
	String lastName;
	String country;
	LinkedHashMap<String, String> countryOption;
	LinkedHashMap<String, String> language;
	String[] operatingSystem;
	
	public Student() {
		
		countryOption = new LinkedHashMap<>();
		countryOption.put("India", "India");
		countryOption.put("WestIndies", "WestIndies");
		countryOption.put("England", "England");
		countryOption.put("USA", "USA");
		language = new LinkedHashMap<>();
		language.put("C#", "C#");
		language.put("Java", "Java");
		language.put("Python", "Python");
		language.put("Ruby", "Ruby");
		
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

	public LinkedHashMap<String, String> getCountryOption() {
		return countryOption;
	}

	/*
	 * public void setCountryOption(LinkedHashMap<String, String> countryOption) {
	 * this.countryOption = countryOption; }
	 */

	public LinkedHashMap<String, String> getLanguage() {
		return language;
	}

	/*
	 * public void setLanguage(LinkedHashMap<String, String> language) {
	 * this.language = language; }
	 */

	public String[] getOperatingSystem() {
		return operatingSystem;
	}

	public void setOperatingSystem(String[] operatingSystem) {
		this.operatingSystem = operatingSystem;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
	
	
	
	
	
}
