package com.practice.abstraction;

public abstract class AnimalAbstract {
	private String name;

	public AnimalAbstract(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
	abstract void makeSound();

}
/*
 * Abstraction is process of hiding implementation details from the user,only showing the functionality.
 * Example:driving a car
 * 
 * Abstraction is general template which is followed by the classes that extend it.
 * It have set rules and regulation which are followed and implemented by it sub classes.
 * 
 * Polymorphism is main advantage of abstraction.
 * 
 * It can be achieved by using abstract classes and methods and interfaces.
 * 
 * Abstract class can not be instantiated.
 */

