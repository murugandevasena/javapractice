package com.practiceon14082023;

public class Fibinonaci {
	static int a=0;
	static int b=1;
	public static void main(String[] args) {
		int count =10;
		System.out.print(a+" "+b);
		printFibinacci(count-2);
	}
	private static void printFibinacci(int i) {
		// TODO Auto-generated method stub
		int n3=0;
		if(i>0) {
			n3=a+b;
			a=b;
			b=n3;
			System.out.print(" "+b);
			printFibinacci(i-1);
		}		
	}

}
