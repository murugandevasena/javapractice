package com.practice.homework;

public class SetTestPractice {
	
	private String name;
	private int age;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "SetTestPractice [name=" + name + ", age=" + age + "]";
	}
}
