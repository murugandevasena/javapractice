package com.practice.functionalinterface;

import java.util.function.Supplier;

public class Suppliers {
	public static void main(String[] args) {
		
		//Supplier is an interface which takes nothing and returns an object.
		String s ="muruganRamalingam";
		Supplier<Integer> b = ()-> s.length();
		Supplier<Boolean> b1 = ()-> s.contains("m");
		Supplier<String> b2 = ()-> s.toUpperCase();
		Supplier<Character> b3 = ()->s.charAt(5);
		System.out.println(b.get());
		System.out.println(b1.get());
		System.out.println(b2.get());
		System.out.println(b3.get());
	}

}
