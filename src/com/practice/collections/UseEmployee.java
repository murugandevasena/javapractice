package com.practice.collections;

import java.util.HashMap;

public class UseEmployee {
	public static void main(String[] args) {
		Employee e1= new Employee("murugan", 1, "male", 10000, 4);
		Employee e2= new Employee("muruganRam", 17, "male", 10000, 10);
		Employee e3= new Employee("Deva", 32, "female", 20000, 2);
		Employee e4= new Employee("Nandhini", 4, "female", 20000, 6);
		Employee e5= new Employee("prabha", 5, "male", 30000, 1);
		
		HashMap<Integer, Employee> h1= new HashMap<Integer, Employee>(10);
		h1.put(e1.getId(), e1);
		h1.put(e2.getId(), e2);
		h1.put(e3.getId(), e3);
		h1.put(e4.getId(), e4);
		h1.put(e5.getId(), e5);
		System.out.println(h1);  
		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());
		System.out.println(e3.hashCode());
		System.out.println(e4.hashCode());
		System.out.println(e5.hashCode());
		System.out.println(e1.equals(e3));
		
		
		
		
	}

}
