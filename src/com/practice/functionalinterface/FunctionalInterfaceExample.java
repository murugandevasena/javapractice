package com.practice.functionalinterface;

public abstract class FunctionalInterfaceExample implements Test{
//	public void say(String m) {
//		System.out.println(m);
//	}
	public static void main(String[] args) {
//		functionalInterfaceExample.say("Hello world");
//		functionalInterfaceExample.say("Murugan");
	  Test s =(int x)-> x*x;
	  Test s1 =(int x)->x+x;
	  Test s2 =(int x)->x/2;
	  int e = s.calculate(5);
	  int e1 = s1.calculate(6);
	  int e2 = s2.calculate(8);
	  System.out.println(e);
	  System.out.println(e1);
	  System.out.println(e2);
	}

}
