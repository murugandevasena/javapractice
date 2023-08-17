package com.practice.daily;

import java.util.Arrays;

public class AnagramPractice {
	public static void main(String[] args) {
		String s = "mayil";
		String s1 = "Tamil";
		if (isAnagram(s, s1)) {
			System.out.println("Yes,It is anagram.");
		} else {
			System.out.println("No,It is not anagram.");
		}
	}

	private static boolean isAnagram(String s, String s1) {
		// TODO Auto-generated method stub

		if (s.length() != s1.length()) {
			return false;
		}
		char[] a = s.toCharArray();
		char[] a1 = s1.toCharArray();
		Arrays.sort(a1);
		Arrays.sort(a);
		for (int i = 0; i < a.length; i++) {
			if (a[i] != a1[i]) {
				return false;
			}
		}
		return true;

	}

}
