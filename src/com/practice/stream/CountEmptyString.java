package com.practice.stream;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class CountEmptyString {
	public static void main(String[] args) {
		String[] words = {"murugan","","","raj","","","raja"};
		
		long x= Arrays.stream(words).filter(y->y=="").count();
		System.out.println(x);
		
		long x1= Arrays.stream(words).filter(y->y!="").count();
		System.out.println(x1);
		
		//Print duplicates numbers alone using stream
		List<Integer> l1 = Arrays.asList(1,2,1,3,4,5,6,7,8,8,9,10,10);
		
		l1.stream().filter(z-> Collections.frequency(l1,z)>1).distinct().forEach(u->System.out.print(u+" "));
		
		//Using set
		HashSet<Integer> s = new HashSet<Integer>();
		Set<Integer> s1 = l1.stream().filter(x2->!s.add(x2)).collect(Collectors.toSet());
		//System.out.println(l1);
		System.out.print(s1);
		
		//using last index of 
		List<Integer> list = l1.stream().filter(x3->l1.indexOf(x3)!= l1.lastIndexOf(x3)).distinct().collect(Collectors.toList());
		System.out.print(list);
		
		int[] a = { 25, 10, 30, 25, 30 };
		List<Integer> list1 = Arrays.stream(a).boxed().collect(Collectors.toList());
		
		HashSet<Integer> s11 = new HashSet<Integer>();
		Set<Integer> s3 = list1.stream().filter(x2-> !s11.add(x2)).collect(Collectors.toSet());
		System.out.print(s3);
		
		 
	}
}
