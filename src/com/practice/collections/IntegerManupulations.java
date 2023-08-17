package com.practice.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class IntegerManupulations {
	public static void main(String[] args) {
		
		List<Integer> a =Arrays.asList(1,2,4,11,13,21,9,0,32);
		a.stream().sorted().forEach(x->System.out.println(x));
		
		Collections.sort(a);
		System.out.println(a);
		List<Integer> l1= new ArrayList<>();
		Collections.addAll(l1, 4,8,34,0,-1,8,9,10,52,71);
		Collections.sort(l1);
		System.out.println(l1);
		
		Collections.sort(l1,Collections.reverseOrder());
		System.out.println("Reverse order:"+l1);
		
		List<Integer> l2 = Collections.unmodifiableList(l1); //Immutable List-we can not modify, read only list.
		l2.add(2,30);
		System.out.println(l2);
		
		
		
		
	}

}
