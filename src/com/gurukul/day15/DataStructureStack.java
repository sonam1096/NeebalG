package com.gurukul.day15;

import java.util.Scanner;
import java.util.Stack;

public class DataStructureStack {
	public static void main(String[] args) {
		System.out.println("Enter a string:");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();

		boolean isXCy = isXCyFormat(s);

		if (isXCy) {
			System.out.println("The string is in xCy format");
		} else {
			System.out.println("The string is not in xCy format");
		}
	}

	static boolean isXCyFormat(String s) {
		char[] c = s.toCharArray();
		Stack<Character> stack = new Stack<>();

		int indexOfC = -1;
		for (int i = 0; i < c.length; i++) {
			if (c[i] == 'C') {
				indexOfC = i;
				break;
			}
			stack.push(c[i]);
		}

		if (indexOfC == -1) {
			return false; // No 'C' found, not in xCy format
		}

		for (int i = indexOfC + 1; i < c.length; i++) {
			if (stack.isEmpty() || c[i] != stack.pop()) {
				return false; // If the characters don't match, it's not in xCy format
			}
		}

		return stack.isEmpty(); // Return true only if the stack is empty (all characters matched)
	}
}
