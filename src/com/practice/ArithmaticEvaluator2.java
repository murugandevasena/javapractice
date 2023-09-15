package com.practice;

public class ArithmaticEvaluator2 {
	public static void main(String[] args) {
		String g = "2+3-1+47";
		String[] numbers = g.split("[+-]");
		String[] operators = g.split("[0-9]");
		int d = Integer.parseInt(numbers[0]);
		for (int i = 1; i < numbers.length; i++) 
		
		{	 
			switch (operators[i]) {
			case "+":
				d = d + Integer.parseInt(numbers[i]);
				break;
			case "-":
				d = d - Integer.parseInt(numbers[i]);
				break;
			case "*":
				d = d * Integer.parseInt(numbers[i]);
				break;
			}
		}
		System.out.println(d);
	}
}
