  package com.practice;

import java.util.Arrays;

public class AnagramPractice {
	public static void main(String[] args) {
		String a= "Thirupathi".toLowerCase();
		String b= "ihtapuriht";
		
		//another way of doing
		//using StringBuilder and equals method
		StringBuilder sb= new StringBuilder(b);
		String a1= sb.reverse().toString();
		if(a.equals(a1)) {
			System.out.println("yes");
		} else {
			System.out.println("not");
		}
		System.out.println("a1: " +a1);
		
		if(isAnagram(a,b)) {
			System.out.println("Yes. It is anagram.");
		}
		else {
			System.out.println("No. It is not anagram.");
		}	
	}

	private static boolean isAnagram(String a, String b) {
		// TODO Auto-generated method stub
		if(a.length()!=b.length()) {
			return false;
		}
		char[] a1 = a.toCharArray();
		char[] b1 = b.toCharArray();
		Arrays.sort(a1);
		Arrays.sort(b1);
//		for(int j=0;j<a1.length;j++) {
//			System.out.print(a1[j]);
//			System.out.print(b1[j]);
//		}
		for(int i=0;i<a1.length;i++) {
			if(a1[i]!=b1[i]) {
				return false;
			}
		}
		return true;
	}

}
