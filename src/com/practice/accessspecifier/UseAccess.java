package com.practice.accessspecifier;

public class UseAccess {

	public static void main(String [] args) {
		Access access =new Access();
		access.name = "ram";
		access.age= 21;
		access.height=5.7f;
		//colour is not accessible outside the class because it is declared as private.
		
	}
}
