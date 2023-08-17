package com.practice.daily;

import java.util.ArrayList;
import java.util.List;

public class ArrayToArrayList {
	public static void main(String [] args) {
		int [] a = {1,2,3,4,5,6,7,8,9};
		List<Integer> l1 = new ArrayList<Integer>();
		//Normal for loop int [] array to Integer ArrayList.
		for(int i =0 ;i< a.length;i++) {
			l1.add(a[i]);
			
		}
		System.out.println("Normal for loop"+ l1);
		
		//Enhanced for loop
		List<Integer> l2 = new ArrayList<Integer>();
		for(Integer i:a) {
			l2.add(i);
		}
		System.out.println("Enhanced for loop"+l2);
		
		//arrayList to array
		
		int [] b= new int[l1.size()];
		
		for(int j=0;j<l1.size();j++) {
			b[j]=l1.get(j);
			System.out.print(+b[j]+" ");
		}
		
		//String array into String arraylist.
		String[] str = {"my","name","is","murugan"};
		List<String> l = new ArrayList<String>();
		for(String x:str) {
			l.add(x);
		}
		System.out.println();
		System.out.println("String array to arraylist:"+l);
		
		
		
	}

}
