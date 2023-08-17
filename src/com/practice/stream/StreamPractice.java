package com.practice.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamPractice {
	public static void main(String[] args) {
		int[] a = {4,2,9,2,51,6,6,8,12,45,6,78,100,97};
		List<Integer> ls = new ArrayList<Integer>();
		ls =Arrays.stream(a).boxed().collect(Collectors.toList());
		
		//Find even numbers
		List<Integer> se = ls.stream().filter(x->x%2==0).collect(Collectors.toList());
		System.out.println(se);
		
		//find add numbers
		List<Integer> so = ls.stream().filter(x->x%2!=0).collect(Collectors.toList());
		System.out.println(so);
		
		//reverseorder
		List<Integer> ro = ls.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(ro);
		
		//Ascending Order
		List<Integer> r = ls.stream().sorted().collect(Collectors.toList());
		System.out.println(r);
		
		//remove duplicate of numbers
		List<Integer> x = ls.stream().distinct().toList();
		System.out.println(x);
		
		//sum of all numbers
//		int y = ls.stream().flatMapToInt(null)
//		System.out.println(y);
		Integer s = ls.stream().reduce(0,(i,j)->(i+j));
		System.out.println(s);
		
		//Count
		Integer g = ls.stream().reduce(0,(i,j)->(i+1));
		System.out.println(g);
		
		List<String> letters = Arrays.asList("a", "b", "c", "d", "e");
		String result = letters.stream().reduce("", String::concat);
		System.out.println(result);
		
		
		
		
//		
	}


}
