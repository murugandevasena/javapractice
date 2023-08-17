package com.practice.optional;

import java.util.Optional;

import com.practice.collections.Employee;

public class OptionalExample {
	public static void main(String[] args) {
		String g ="";
		//Employee e1 =null;
		Optional<String> values = Optional.ofNullable(g);
		System.out.println(values.get());
		System.out.println(values.isEmpty());
		System.out.println(values.isPresent());
		//System.out.println(values.orElse("Not found"));
	}

}
