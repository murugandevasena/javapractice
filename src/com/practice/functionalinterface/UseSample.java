package com.practice.functionalinterface;

public class UseSample {
	public static void main(String[] args) {
		Sample s = (nums)->{
			for(Integer x:nums) {
				if(x%2==0) {
					System.out.println(x);
				}
			}
		};
		int [] nums = {5,10,15,20};
		s.getEven(nums);
	}
}
