package com.practice.hashcodeequalsoverride;

import java.util.Objects;

public class Employee {
	private String name;
	private int id;
	private int salary;
	private String gender;
	public Employee(String name, int id, int salary, String gender) {
		this.name = name;
		this.id = id;
		this.salary = salary;
		this.gender = gender;
	}
	
	





	@Override
	public int hashCode() {
		return Objects.hash(gender);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(gender, other.gender);
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
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", salary=" + salary + ", gender=" + gender + "]";
	}
	
	
	

}
