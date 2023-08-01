package com.gurukul.day15;

import java.util.Stack;

public class BaseballGame {
	/*
	 * You're now a baseball game point recorder. Given a list of strings, each
	 * string can be one of the 4 following types: Integer (one round's score):
	 * Directly represents the number of points you get in this round. "+" (one
	 * round's score): Represents that the points you get in this round are the sum
	 * of the last two valid round's points. "D" (one round's score): Represents
	 * that the points you get in this round are the doubled data of the last valid
	 * round's points. "C" (an operation, which isn't a round's score): Represents
	 * the last valid round's points you get were invalid and should be removed.
	 * Each round's operation is permanent and could have an impact on the round
	 * before and the round after. You need to return the sum of the points you
	 * could get in all the rounds }
	 */

	public static int calculatePoints(String[] ops) {
		Stack<Integer> stack = new Stack<>();
		int sum = 0;

		for (String op : ops) {
			if (op.equals("C")) {
				sum -= stack.pop();
			} else if (op.equals("D")) {
				int prevScore = stack.peek();
				int newScore = prevScore * 2;
				stack.push(newScore);
				sum += newScore;
			} else if (op.equals("+")) {
				int lastScore = stack.pop();
				int prevScore = stack.peek();
				int newScore = lastScore + prevScore;
				stack.push(lastScore);
				stack.push(newScore);
				sum += newScore;
			} else {
				int score = Integer.parseInt(op);
				stack.push(score);
				sum += score;
			}
		}

		return sum;
	}

	public static void main(String[] args) {
	        String[] input = {"5", "-2", "4", "C", "D", "9", "+", "+"};
	        int result = calculatePoints(input);
	        System.out.println("Output: " + result);
	    }
}