package com.practice.hashcodeequalsoverride;

import java.util.HashMap;

public class UseEmployee {
public static void main(String[] args) {
	Employee e1 = new Employee("murugan", 101, 20000, "male");
	//Employee e2 = new Employee("murugan", 101, 20000, "male");
	Employee e2 = new Employee("ramalingam", 101, 450000, "male");
	Employee e3 = new Employee("Alli", 2, 20000, "female");
	
	HashMap<Integer, Employee> map = new HashMap<Integer, Employee>();
	map.put(e1.getId(), e1);
	map.put(e2.getId(), e2);
	map.put(e3.getId(), e3);
	
	System.out.println(e1.hashCode());
	System.out.println(e2.hashCode());
	System.out.println(e1.equals(e2));
	
	if(e1.equals(e2)) {
		System.out.println("true");
	}
	else {
		System.out.println("false");
	}
	
	
//	for(Integer i:map.keySet()) {
//		System.out.println(i.hashCode()+" "+i+" "+map.get(i));
//	}
}
}
