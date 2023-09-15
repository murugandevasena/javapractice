package com.practiceon14082023;

public class ReduceLengthLineByline {
	
	public static void main(String[] args) {
	     String g ="abcdefghi".toUpperCase();
		char[] a = g.toCharArray();
		//using nested for loop
		for(int i=0;i < a.length;i++) {
			for(int j=a.length-1;j>=i;j--) {
				System.out.print(a[j]);
			}
			System.out.println(" ");
		}
		
			//using substring
		for(int j=g.length()-1;j>=0;j--) {
			System.out.println(g.substring(0,j));
		}
		System.out.println(" ");
		
	}

}
