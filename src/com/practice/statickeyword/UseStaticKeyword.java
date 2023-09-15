package com.practice.statickeyword;

public class UseStaticKeyword {
	public static void main(String[] args) {
		UseStaticKeyword s1 = new UseStaticKeyword();
		UseStaticKeyword s2 = new UseStaticKeyword();
		UseStaticKeyword s3 = new UseStaticKeyword();
		UseStaticKeyword s4 = new UseStaticKeyword();
		System.out.println(getName());
	}
	
	//Varaible level
	static int a =0;
	public UseStaticKeyword() {
		a++;
		System.out.println(a);
	}
	//static method
	public static String getName() {
		return "murugan";
	}
	
	//static block
	static {
		System.out.println("stati cme");
	}
	
	

}
