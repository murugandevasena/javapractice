package com.practiceon14082023;

import java.util.List;

public class Emp {
	String name;
	int age;
	int salary;
	List<String> city;
	
	public Emp(String name, int age, int salary, List<String> city) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.city = city;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public List<String> getCity() {
		return city;
	}

	public void setCity(List<String> city) {
		this.city = city;
	}
	
	
	

}
