package com.practice.daily;

public class FibonacciPractice {
	static int a=0;
	static int b=1;
//	public int a=0;
//	public int b=1;
	/*
	 * if we want call varaiables withing static method, we have declare it as a static varaible.
	 * 
	 * Otherwise, we have to create object of the class, then call the variable within static method.
	 */
	public static void main(String[] args) {
		//FibonacciPractice fibonacciPractice =new FibonacciPractice();
		int count=6;
		System.out.print(a+" "+b);
		printFibonacci(count-2);
	}
	private static void printFibonacci(int i) {
		// TODO Auto-generated method stub
		int tmp=0;
		if(i>0) {
			tmp=a+b;
			a=b;
			b=tmp;
			System.out.print(" "+tmp);
			printFibonacci(i-1);  
		}
		
	}

}
