package com.practice.daily;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FindMaxLengthString {
	public static void main(String [] args) {
		String [] a = {"Rajesh","ram","raja","devas","Rameshoooo"};
		
		//using stream
		
		List<String> l = Arrays.asList(a);
		System.out.println(l.stream().max(Comparator.comparing(String::length)).get());
		System.out.println(l.stream().min(Comparator.comparing(String::length)).get());
		
		
		String max =a[1];
		for(int i=0;i<a.length;i++) {
			if(a[i].length()>= max.length()) {
				max=a[i];
				//System.out.println(max);
			}
		}
//		System.out.println(max.length());
		System.out.println(max);
	}

}
