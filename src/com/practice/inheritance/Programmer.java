package com.practice.inheritance;

public class Programmer extends Manager {
	int bonous=10000;
	public static void main(String[] args) {
		int z=98;
		Programmer programmer =new Programmer();
		System.out.println("Manager salary:"+programmer.salary);
		System.out.println("Programmer salary:"+programmer.bonous);
		System.out.println(+z);
	}

}
