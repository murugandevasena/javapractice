package com.practice;

public class ArithmeticEvaluator {
	public static void main(String[] args) {
		String expression = "2-1+3+9-2";
		int result = evaluateExpression(expression);
		System.out.println("Output: " + result);
	}

	public static int evaluateExpression(String expression) {
		String[] numbers = expression.split("[+-]");
		String[] operators = expression.split("[0-9]+");

		int result = Integer.parseInt(numbers[0]);

		for (int i = 1; i < numbers.length; i++) {
			int num = Integer.parseInt(numbers[i]);
			if (operators[i].equals("+")) {
				result += num;
			} else if (operators[i].equals("-")) {
				result -= num;
			}
		}

		return result;
	}
}
