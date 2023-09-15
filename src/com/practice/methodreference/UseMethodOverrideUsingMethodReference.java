package com.practice.methodreference;

import java.util.function.BiFunction;

public class UseMethodOverrideUsingMethodReference {

	//MethodOverrideUsingMethodReference methodOverrideUsingMethodReference =new MethodOverrideUsingMethodReference();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Static method can be override using method reference
		BiFunction<Integer, Integer, Integer> l1 = MethodOverrideUsingMethodReference::add;
		System.out.println(l1.apply(10, 12));
		BiFunction<Integer, Float, Float> l2 = MethodOverrideUsingMethodReference::add;
		float x= l2.apply(12, 20.4f);
		System.out.println(x);
		BiFunction<Float, Float, Float> l3 = MethodOverrideUsingMethodReference::add;
		System.out.println(l3.apply(12.3f, 13.3f));
		

	}

}
