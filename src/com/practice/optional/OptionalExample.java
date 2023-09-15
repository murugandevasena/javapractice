package com.practice.optional;

import java.util.Optional;

import com.practice.collections.Employee;

public class OptionalExample {
	public static void main(String[] args) {
		String g = "";
		System.out.println("double quort length: "+g.length());
		//Employee e1 =null;
		Optional<String> values = Optional.ofNullable(g);
		
		if(values.isPresent()) {
			System.out.println("Value is present :"+values.isPresent());
		}
		else {
			System.out.println("Value is not present:"+values.isEmpty());
		}
		
		//Alternative
		System.out.println(values.orElse("String is not there"));
		System.out.println(values.orElseThrow(()->new NullPointerException("null pointer execption")));
		
//		System.out.println(values.get());
//		System.out.println(values.isEmpty());
//		System.out.println(values.isPresent());
		
		//System.out.println(values.orElse("Not found"));
	}

}
