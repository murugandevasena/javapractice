package com.practice.stringpractice;

public class StringP {
	
	public static void main(String[] args) {
		String a = "java";
		System.out.println(a.hashCode());
		String b="java1";
		System.out.println(b.hashCode());
		a= a.concat(b);
		System.out.println(a.hashCode());
		
		String d = "murugan";
		StringBuilder sc = new StringBuilder(d);
		sc.reverse();
		System.out.println(sc);
		
		StringBuffer bf = new StringBuffer(d);
		bf.append('r');
		System.out.println(bf);
		
	}
	

}
