package com.practice;

public class EncapuMain {
	public static void main(String[] args) {
		EncapuPractice encapuPractice=new EncapuPractice();
		//encapuPractice.setName("Murugan");
		encapuPractice.getName();
		System.out.println(encapuPractice.getName());
	}

}

/*
 # Encapsulation is a process of integrating data and methods together within a single unit which can be accesses only
 through methods of the same class.
 
 It act as a protective layer which prevent data from being accessed from outside class.
 
 It is for data hiding.
 
 It increased data flexibility which can make read-only(omit set methods) and write(omit get methods) only.
 
 Encapsulation can be achieved by declaring private instance variable and public setter and getter methods.
 
 Encapsulation is also known as data-hiding and abstraction.
 */
