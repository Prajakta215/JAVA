package com.day04.ps9;

import java.util.Stack;

public class ExpressionUsingStack {
	public static double evaluate(String expression) {
		Stack<Double> stack = new Stack<>();
		String[] tokens = expression.split("\\s+");
		
		for(String token: tokens) {
			if(isNumeric(token)) {
				stack.push(Double.parseDouble(token));
			}else {
				double operator2 = stack.pop();
				double operator1 = stack.pop();
				
				switch (token) {
					case "+":
						stack.push(operator1 + operator2);
						break;
					case "-":
						stack.push(operator1 + operator2);
						break;
					case "*":
						stack.push(operator1 + operator2);
						break;
					case "/":
						stack.push(operator1 + operator2);
						break;
					default:
						throw new IllegalArgumentException("Invalid operator: " +token);
					
						
				}
			}
		}
		
		return stack.pop();
	}

	private static boolean isNumeric(String token) {
		// TODO Auto-generated method stub
		try {
			Double.parseDouble(token);
			return true;
		}catch(NumberFormatException e) {
			return false;
		}
		
	}
	
	public static void main(String[] args) {
		String expression = "10 2 + 6 *";
		double result = evaluate(expression);
		System.out.println("Output: " + result + " using java");
	}
}
