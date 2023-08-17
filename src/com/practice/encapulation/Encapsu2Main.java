package com.practice.encapulation;

public class Encapsu2Main {
	public static void main(String[] args) {
		Encapsu2 encapsu2 = new Encapsu2();
		encapsu2.setRollNo(1);
		encapsu2.setName("Murugan");
		encapsu2.setHomeTown("Jayankondam");
		
		System.out.println(encapsu2.getRollNo());
		System.out.println(encapsu2.getName());
		System.out.println(encapsu2.getHomeTown());
	}
	/*
	 * Due to the encapsulation , we can not able to access getRollNo() and other methods directly, by creating object of 
	 * the class only , we can get results of those methods.
	 */
	

}
