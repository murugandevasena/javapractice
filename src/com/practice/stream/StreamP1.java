package com.practice.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class StreamP1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,4,5,6,7};
		List<Integer> ls = Arrays.asList(1,4,5,6,7);
		int max = ls.stream().max((x,y)->x-y).get();
		int max1 = ls.stream().max((x,y)->x.compareTo(y)).get();
		System.out.println(max1);
		
		
		
		

	}

}
