package com.practice.homework;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SumOfArray {
	public static void main(String[] args) {
		int[] a = {2,3,4,5,6,7,8,9};
		int sum=0;
		//using sum
		for(int i=0;i<a.length;i++) {
			sum =sum+a[i];
		}
		System.out.println("Total sum: "+ sum);
		
		//using stream
		List<Integer> ll = Arrays.stream(a).boxed().collect(Collectors.toList());
		long sum1 = ll.stream().reduce((x, y)->x+y).get();
		System.out.println("Sum of integer array using stream:" +sum1);	
	}
}
