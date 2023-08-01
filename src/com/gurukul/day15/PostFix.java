package com.gurukul.day15;

import java.util.Stack;

public class PostFix {

	public static String postfixToInfix(String expression) {
		Stack<String> stack = new Stack<>();
		String operators = "^*/+-";

		for (char c : expression.toCharArray()) {
			String currentChar = String.valueOf(c);
			if (!operators.contains(currentChar)) {
				stack.push(currentChar);
			} else {
				String operand2 = stack.pop();
				String operand1 = stack.pop();
				stack.push("(" + operand1 + currentChar + operand2 + ")");
			}
		}

		return stack.pop();
	}

	public static void main(String[] args) {
		String postfixExpression = "AB^C*D-EF/GH+/+";
		String infixExpression = postfixToInfix(postfixExpression);
		System.out.println(infixExpression);
	}
}
