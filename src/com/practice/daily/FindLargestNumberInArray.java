package com.practice.daily;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindLargestNumberInArray {
	static int y=0;
	
	public static void main(String[] args) {
		int[] b= {44,55,67,88,34,90,102,104};
		 findLargest(b);
		 findSmallest(b);
		 System.out.println(findLargest(b));
		 System.out.println(findSmallest(b));
		 
		 //using stream
		 List<Integer> ls = Arrays.stream(b).boxed().collect(Collectors.toList());
		 long n = ls.stream().max((x,y)->x.compareTo(y)).get();
		 System.out.println(n);
		 
		 long n1 = ls.stream().min((x,y)->x.compareTo(y)).get();
		 System.out.println(n1);
		
	}

	private static int findLargest(int[] b) {
		// TODO Auto-generated method stub
		int a = b[0];
		for(int i=0;i<b.length;i++) {
			if(a<b[i]) {
			   a=b[i];	
			}
		}
		return a;
	}
	
	private static int findSmallest(int[] b) {
		// TODO Auto-generated method stub
		int a1 = b[0];
		for(int i=0;i<b.length;i++) {
			if(a1>b[i]) {
			   a1=b[i];		
			}
		}
		return a1;
	}
	
	


}
