package com.practice.functionalinterface;

public class FindMinimumUsingFunctionInterface {
	public static void main(String[] args) {
		Demo1 d = (a) -> {
			int min = a[0];
			for (int i = 0; i < a.length; i++) {
				
				if (min > a[i]) {
					min = a[i];
				}
			}
			if (min % 2 == 0) {
				System.out.println(min + " is even number.");
			} else {
				System.out.println(min + " is odd number,");
			}

		};
		int[] a = { 23, 24, 26, 45 };
		d.findMinimum(a);

	}

}
