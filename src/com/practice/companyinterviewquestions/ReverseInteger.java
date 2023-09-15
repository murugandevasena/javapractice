package com.practice.companyinterviewquestions;

public class ReverseInteger {
	public static void main(String[] args) {
		int i =144;
		int ld,res = 0;
		while(i>0) {
		ld = i%10;
		res = res*10+ld;
		i =i/10;
		}
		System.out.println(res);
	}
 
}
