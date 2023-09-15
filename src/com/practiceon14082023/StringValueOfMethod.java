package com.practiceon14082023;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class StringValueOfMethod {
	public static void main(String[] args) {
		
		List<Integer> li = Arrays.asList(20,2,33,11,10,5,21,15,200);
		for(Integer l:li) { 
			if(String.valueOf(l).startsWith("2")) {
				System.out.println(l);
			}
		}
		
		
		List<Integer> d = new ArrayList<Integer>();
		
		for(Integer l:li) { 
			if(String.valueOf(l).startsWith("2")) {
				d.add(l);
			}
		}
		Collections.sort(d);
		System.out.println("Collections sort" +d);
		
		//using stream
		
		List<Integer> s = li.stream().filter(x->x.toString().startsWith("2")).sorted().collect(Collectors.toList());
		
		//List<Integer> s1= li.stream().filter(x->String.valueOf(x).startsWith("2")).map(y->Integer.valueOf(y)).forEach(x->System.out.println(x));
		
		System.out.println("Using stream: " +s);
	}

}
