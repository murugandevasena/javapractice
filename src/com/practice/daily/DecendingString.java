package com.practice.daily;

import java.util.Collections;

public class DecendingString {

	public static void main(String[] args) {
		String a = "sdeftu";
		char[] s = a.toCharArray();
		char tem;
		for (int i = 0; i < a.length(); i++) {
			for (int j = i + 1; j < a.length(); j++) {
				if (s[i] < s[j]) {
					tem = s[i];
					s[i] = s[j];
					s[j] = tem;
				}
			}
		}
		for (int j=0;j<s.length;j++) {
			System.out.print(s[j]);
		}
	}
// Arrays.sort(c);
//	System.out.println(c);
}
