package com.practice.abstraction;

public class AbstractionExample {
	public static void main(String[] args) {
		AnimalAbstract myDog = new Dog("Dommy");
		AnimalAbstract myCat = new Dog("Kitcat");
		myDog.makeSound();
		myCat.makeSound();
	}

}
