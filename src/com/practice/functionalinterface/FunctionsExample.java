 package com.practice.functionalinterface;

import java.util.function.BiFunction;
import java.util.function.Function;

public class FunctionsExample {
	public static void main(String [] args) {
		
		//Function<T,R> where T is an argument,R is return.
		Function<Integer,String> s = (i)-> i+100 + " is a result";
		System.out.println(s.apply(1));
		
		//BiFunction<T,T,R> T is an arguments, R is return.
		BiFunction<Integer, Long, String> s1 = (i,j)-> i*j + " is a result";
		System.out.println(s1.apply(2, (long) 200000));	
		
		
		BiFunction<String, Integer, Character> s3 = String::charAt;
		System.out.println(s3.apply("Murugan",1));
		
		BiFunction <String,Character,Integer> s4 = String::indexOf;
		System.out.println(s4.apply("raalindret",'i'));
		
		BiFunction<Integer, String,Character> s5 = new FindChar()::findOf;
		System.out.println(s5.apply(5, "ramsaran"));
		
		
		
		
	}
}

class FindChar{
		public char findOf(int k,String g) {
			return g.charAt(k);
		}
		
}
