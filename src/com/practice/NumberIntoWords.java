package com.practice;

public class NumberIntoWords {
	public static void main(String[] args) {
		int num=22;
		 String[] units = { "zero", "one", " two", "three", "four", "five", "six", "seven", "eight", "nine",
		            "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen" };

		String[] tens = { "", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};
		
		if(num<20) {
			System.out.println(units[num]);
		}
		else {
			System.out.println(tens[num/10]+units[num%10]);
		}	
	}
}
