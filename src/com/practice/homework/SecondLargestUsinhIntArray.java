package com.practice.homework;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class SecondLargestUsinhIntArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//second largest
		int[] d1 = {23,45,46,53,47,89,90,102,23};
		List<Integer> lInt = Arrays.stream(d1).boxed().collect(Collectors.toList());
		int max = lInt.stream().sorted(Comparator.comparing(x->-x)).toList().get(1);
		System.out.println("Second maximum from the int[]:"+max);
		
		//ascending order
		List<Integer> lw = lInt.stream().sorted(Comparator.comparingInt(Integer::intValue)).collect(Collectors.toList());
		System.out.println("Asending order from the array:"+lw);
		
		//Descending order
		List<Integer> lw1 = lInt.stream().sorted(Comparator.comparingInt(Integer::intValue).reversed()).collect(Collectors.toList());
		System.out.println("Desending oder from the array:"+lw1);
		
		//print duplicate numbers only
		
		LinkedHashSet<Integer> lnset = new LinkedHashSet<Integer>();
		Set<Integer> s2 = lInt.stream().filter(x->!lnset.add(x)).collect(Collectors.toSet());
		System.out.println("Collect duplicate alone:" +s2);
		
		//Using forEach method to print duplicates alone
		lInt.stream().filter(x->!lnset.add(x)).forEach(y->System.out.println(y));
		
		//Remove duplicates and print ascending order
		
		
		
		
		
		

	}

}
