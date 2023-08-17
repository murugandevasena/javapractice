package com.practice.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ArrayListPractice {
	public static void main(String[] args) {
		//int array to ArrayList
		int[] a= new int[]{3,2,1,6,5};
		
		ArrayList<Integer> a1 = Arrays.stream(a).boxed().collect(Collectors.toCollection(ArrayList::new));
		System.out.println(a1);
		
		//ArrayLits to int[] array
		
		int[] nums = a1.stream().mapToInt(Integer::intValue).toArray();
		for(int i=0;i<nums.length;i++) {
			System.out.println(nums[i]);
		}
		
		// Integer[] to ArrayList
	Integer[] a2 =new Integer[] {1,2,3,4,5};
	List<Integer> a3 = Arrays.asList(a2);
	for(int i=0;i<a3.size();i++) {
		System.out.println(a3);
	}
		
	}

}
