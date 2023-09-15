package com.practice.methodreference;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;

public class UseDemoMethodReference {
	//static DemoMethodReference demoMethodReference = new DemoMethodReference();
	public static void main(String[] args) {
		DemoMethodReference demoMethodReference = new DemoMethodReference();
		BiFunction<Integer, Integer, Integer> g = demoMethodReference::add;
		int result = g.apply(12, 1);
		System.out.println(result);	
		
		
		Consumer<List<Integer>> con = list -> {
			for(int i=0; i<list.size();i++) 
				list.set(i, 2*list.get(i));
		};

		Consumer<List<Integer>> disp = list->list.stream().forEach(x->System.out.println(x));
		
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(2);
		list.add(20);
		list.add(10);
	
		con.accept(list);
		disp.accept(list);
	}

	//If the method in Class DemoMethodReference is non-static, the we should create object in UseClass , and then that mentod using object.(object :: method name)
	
	//If the method in Class DemoMethodReference is static , then we should use (class name :: method name).

}
