package com.practice.collections;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetManupulations {
	public static void main(String[] args) {
		//Set<Integer> set = new HashSet<>(); Hashset does not follow insertion order.Set does not allow duplicates.
		//Set<Integer> set =new LinkedHashSet<Integer>(); // Linkedhashset follow the insertion order.
		Set<Integer> set = new TreeSet<Integer>(); //Treeset will give output as ascending order.
		Collections.addAll(set, 12,2,3,3,4,4,5,6,10,7,8,9);
		System.out.println(set);
	}

}
