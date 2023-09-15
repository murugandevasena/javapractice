package com.practice;

public class ReverseIntArray {

	public static void main(String[] args) {
		int[] a = { 215, 87, 563 };
		int[] output = reverseDigit(a);
		for (int a1 : output) {
			System.out.print(a1 + " ");
		}
	}

	private static int[] reverseDigit(int[] input) {
		int[] output = new int[input.length];
		for (int i = 0; i < input.length; i++) {
			int num = input[i];
			int reverse = 0;
			while (num != 0) {
				int digit = num % 10;
				reverse = reverse * 10 + digit;
				num = num / 10;
			}
			output[i] = reverse;
		}

		return output;
	}
}
