package com.gurukul.day15;

import java.util.Stack;

public class CelebretyFounder {

	static boolean Famous(int A, int B) {

		return false;
	}

	static int findCelebrity(int N) {
		Stack<Integer> stack = new Stack<>();

		for (int i = 0; i < N; i++) {
			stack.push(i);
		}

		while (stack.size() > 1) {
			int A = stack.pop();
			int B = stack.pop();

			if (Famous(A, B)) {

				stack.push(B);
			} else {

				stack.push(A);
			}
		}

		int potentialCelebrity = stack.pop();

		for (int i = 0; i < N; i++) {
			if (i != potentialCelebrity
					&& (Famous(potentialCelebrity, i) || !Famous(i, potentialCelebrity)))
				return -1;
		}

		return potentialCelebrity;
	}

	public static void main(String[] args) {
		int N = 3;
		int celebrity = findCelebrity(N);

		if (celebrity != -1) {
			System.out.println("Celebrity found at position: " + celebrity);
		} else {
			System.out.println("No celebrity found in the party.");
		}

	}
}
