package com.practice.daily;

public class NumberPattern {

	public static void main(String[] args) {
		int s = 5;
		for (int i = 1; i <= s; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*"+" ");
			}
			System.out.println();
		}
//		
//		for (int i = s; s >= 1; i--) {
//			for (int j = i; j >= 1; j--) {
//				System.out.print("*"+" ");
//			}
//			System.out.println();
//		}
  
	}

}
