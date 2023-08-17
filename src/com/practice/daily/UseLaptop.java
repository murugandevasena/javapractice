package com.practice.daily;

public class UseLaptop {
	public static void main(String[] args) {
		Processor p1 =new Processor("leneva processore", "Fourth", 12000);
		Processor p2 = new Processor("Micro processor","Fifth",10000);
		Display d1 = new Display("FisrstClass", true);
		Display d2 = new Display("SuperClass", false);
		LapTop l1 =new LapTop("Lenova", 12000, 2, p1, d1);
		LapTop l2 = new LapTop("Dell",24000,3,p2,d2);
		System.out.println(l1);
		System.out.println(l2);
	
	}

}
