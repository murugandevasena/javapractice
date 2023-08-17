package com.practice.daily;

public class FindMaxLengthString {
	public static void main(String [] args) {
		String [] a = {"Rajesh","ram","raja","devas","Ramesh"};
		String max =a[1];
		for(int i=0;i<a.length;i++) {
			if(a[i].length()>= max.length()) {
				max=a[i];
				System.out.println(max);
			}
		}
		System.out.println(max.length());
		System.out.println(max);
	}

}
