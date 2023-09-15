package com.practice;

import java.util.Arrays;

public class IntArrayEqual {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[] a = {1,3,5,7};
		int []b = {1,5,3,4};
		Arrays.sort(a);
		Arrays.sort(b);
		if(Arrays.equals(a, b)) {
			System.out.println("Arrays are equal.");
		}
		else {
			System.out.println("Arrays are not equal.");
		}
	}

}
