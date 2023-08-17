package com.practice.abstraction;

public class Dog extends AnimalAbstract {

	public Dog(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	
	public void makeSound() {
		System.out.println(getName()+ " barks");
	}

}
