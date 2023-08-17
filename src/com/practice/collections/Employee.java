package com.practice.collections;

import java.util.Objects;

public class Employee {
	
	private String name;
	private int id;
	private String gender;
	private int salary;
	private int experience;
	public Employee(String name, int id, String gender, int salary, int experience) {
		super();
		this.name = name;
		this.id = id;
		this.gender = gender;
		this.salary = salary;
		this.experience = experience;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getExperience() {
		return experience;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", gender=" + gender + ", salary=" + salary + ", experience="
				+ experience + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(salary/10000-31);
	}
	
	
	//Hashing technique.
	@Override
	public boolean equals(Object obj) {
		if(this==obj) {
			return true;
		}
		if(obj==null) {
			return false;
		}
		if(getClass()!= obj.getClass()) {
			return false;
		}
		Employee other = (Employee) obj;
		return salary == other.salary;
	}
	
}
