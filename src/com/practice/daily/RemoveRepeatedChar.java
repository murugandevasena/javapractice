package com.practice.daily;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveRepeatedChar {
	
	public static void main(String[] args) {
		
		
		String g ="onesofttechnology";
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
	}
}
