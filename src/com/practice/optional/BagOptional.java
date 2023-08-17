package com.practice.optional;

import java.util.Optional;

public class BagOptional {
	public static void main(String[] args) {
		Bag bag= null;
		//ofNullable allows further manipulation even it is a null.
		Optional<Bag> value = Optional.ofNullable(bag);
		// of() does not allow further if it is null.
		//Optional<Bag> value = Optional.of(bag);
		System.out.println(value);
		System.out.println(value.isEmpty());
		System.out.println(value.isPresent());
		System.out.println(value.orElse(bag));	
		System.out.println(value.orElseThrow(()->new NullPointerException("No value")));
	}
}
