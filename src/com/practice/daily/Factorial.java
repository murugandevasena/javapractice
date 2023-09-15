package com.practice.daily;

public class Factorial {
	public static int fa=1;
	public static void main(String[] args) {
		int i,fact = 1;
		int number=5;
		for(i=1;i<=number;i++) {
			fact=fact*i;
		}
		System.out.println("factorial result:"+fact);
		
		
		//Using recursive
		//recursive(1);
		
	}

//	public static void recursive(int j2) {
//		// TODO Auto-generated method stub
//		
//		if(j2<=5) {
//			fa=fa*j2;
//			
//		}
//		System.out.println("Recursive:" + fa);
//		recursive(++j2);
//	}
}

 
