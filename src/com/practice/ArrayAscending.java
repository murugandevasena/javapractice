package com.practice;

import java.util.Arrays;
import java.util.List;

public class ArrayAscending {
	public static void main(String[] args) {
		String g = "1,3,5,6,2,9,12,7";
		String[] p = g.split(",");
		int[] num = new int[g.length()];
		for (int i = 0; i < p.length; i++) {
			num[i] = Integer.parseInt(p[i]);
		}
		for (int j = 0; j < num.length; j++) {
			System.out.println(num[j]);
			Arrays.sort(num);
		}
		
		
		Integer[] a ={515,341,98};
        Arrays.sort(a);
      
//        List<Integer> list = Arrays.asList(a);
//        list.stream().sorted().toList().forEach(x->System.out.println(x));
	}
}
