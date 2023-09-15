package com.practice.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
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
		//Integer s = ls.stream().reduce(0,(i,j)->(i+j));
		Integer s = ls.stream().reduce(0,Integer::sum);
		System.out.println(s);
		
		//Count
		Integer g = ls.stream().reduce(0,(i,j)->(i+1));
		
		System.out.println("find :" +g);
		
		List<String> letters = Arrays.asList("a", "b", "c", "d", "e");
		String result = letters.stream().reduce("", String::concat);
		System.out.println(result);
		
		String[] s1 = {"i", "am","a","java","developer"};
		Arrays.stream(s1).mapToInt(String::length).forEach(y->System.out.println(y));
		
		List<Integer> ls1 = Arrays.asList(25,10,30,25,30);
		HashSet<Integer> hs = new HashSet<Integer>();
		Set<Integer> s11 =ls1.stream().filter(x1->(!hs.add(x1))).collect(Collectors.toSet());
		System.out.println(s11);
		
		
		
		//White data system interview question
		int[] arr1 = {23,45,67,89,90,96,97,90,97};
		int [] arr2 = {12,41,55,76,89,101};
		
		List<Integer> l1 = Arrays.stream(arr1).boxed().collect(Collectors.toList());
		
		//l1.stream().distinct().forEach(System.out::println);
		
		
		
		l1.stream().filter(x22->(!hs.add(x22))).collect(Collectors.toSet()).forEach(System.out::println);
		
		List<Integer> l2 = Arrays.stream(arr2).boxed().collect(Collectors.toList());
		List<List<Integer>> ll = Arrays.asList(l1,l2);
		ll.stream().flatMap(u->u.stream()).collect(Collectors.toList()).forEach(System.out::println);
		
		
		//anotherway
		
		IntStream int1 = IntStream.of(arr1);
		IntStream int2 = IntStream.of(arr2);
		IntStream flatIntStream = IntStream.concat(int1, int2);
		
		flatIntStream.forEach(System.out::println);
		
		
		
		
		
	}


}
