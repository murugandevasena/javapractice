package com.practice.functionalinterface;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class PredicateExample {
	
	public static void main(String[] args) {
		
		//Predicate is an interface , which takes objects as an argument and returns boolean.
		Predicate<Integer> p = (b)->(b>18);
		System.out.println(p.test(19));
		
		BiPredicate<String, String> b = String::equals;
		System.out.println(b.test("muru", "muru"));
		
		//method reference
		BiPredicate<String, String> b1 = String::equals;
		System.out.println(b1.test("muru", "murugan"));
		
		
		
		
		
		
	}

}
