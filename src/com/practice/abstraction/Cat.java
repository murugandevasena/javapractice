package com.practice.abstraction;

public class Cat extends AnimalAbstract {

	public Cat(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	public void makeSound() {
		System.out.println(getName()+" meos");
	}

}
