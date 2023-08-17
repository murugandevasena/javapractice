package com.practice.functionalinterface;

import java.util.function.Consumer;

public class ConsumerExample {
	public static void main(String[] args) {
		Consumer<Integer> display = a -> System.out.println(a+a);
		
		display.accept(2);
		
// 		It takes one input and  does not return any value.
//		Consumer<String> c1 = String::toUpperCase;
//		System.out.println(c1.accept("muruga"));
	
		
		
	}

}
