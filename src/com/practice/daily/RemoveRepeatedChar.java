package com.practice.daily;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;

public class RemoveRepeatedChar {
	
	public static void main(String[] args) {
		
		
		String g ="onesoft technology";
		char[] d = g.toCharArray();
		
		int x= d.length;
		System.out.println("char array length: "+x);
		LinkedHashSet<Character> h = new LinkedHashSet<Character>();
		//normal for loop
		for(int i=0;i<x;i++) {
			h.add(d[i]);
		}
		System.out.println("remove duplicate charcters using normal for loop:"+h);
		
		//Using enhanced for loop
		for(char c:d) {
			h.add(c);
		}
		System.out.println("Remove chanratcers using enhanced for loop"+h);
		
	   
		
		//return the duplicate string
		String g1 ="onesoft technology technology";
		String[] t = g1.split(" ");
		List<String> list = Arrays.asList(t);
		System.out.println(list);
		
		list.stream().filter(x1->Collections.frequency(list, x1)>1).distinct().forEach(u->System.out.println(u+" "));
		
	}
}
