package com.practice.daily;

public class PrimeExample {
	public static void main(String[] args) {

		isPrimeNumer(3);
		isPrimeNumer(5);
		isPrimeNumer(6);
//		int num = 17;
//		int c = 0;
//		for (int i = 2; i < num; i++) {
//			if (num % i == 0) {
//				c++;
//			}
//		}
//		if (c == 0) {
//			System.out.println("Prime");
//		} else
//			System.out.println("Not Prime");
//	}
}

	private static void isPrimeNumer(int i) {
		// TODO Auto-generated method stub
		int flag=0;
		if(i==0||i==1) {
			System.out.println("It is not a prime number.");
		}
		else {
			for(int j=2;j<i;j++)
			{
				if(i%j==0) {
					flag++;
				}
			}
		}
		if(flag>0) {
			System.out.println(i+" is not a prime.");
		}
		else {
			System.out.println(i+" is a prime number.");
		}
		
	}
}