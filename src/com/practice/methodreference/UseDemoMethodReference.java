package com.practice.methodreference;

import java.util.function.BiFunction;

public class UseDemoMethodReference {
	DemoMethodReference demoMethodReference = new DemoMethodReference();
	public static void main(String[] args) {
		BiFunction<Integer, Integer, Integer> g = DemoMethodReference::add;
		int result = g.apply(12, 1);
		System.out.println(result);
				
	}

}
