package com.gurukul.day15;

import java.util.*;
public class countNumber {

		public static String countOfAtoms(String formula) {
			Deque<Map<String, Integer>> stack = new ArrayDeque<>();
			Map<String, Integer> countMap = new HashMap<>();
			int i = 0;

			while (i < formula.length()) {
				char ch = formula.charAt(i);

				if (ch == '(') {
					stack.push(countMap);
					countMap = new HashMap<>();
					i++;
				} else if (ch == ')') {
					i++;
					int count = 0;
					while (i < formula.length() && Character.isDigit(formula.charAt(i))) {
						count = count * 10 + (formula.charAt(i) - '0');
						i++;
					}
					count = (count == 0) ? 1 : count;

					Map<String, Integer> prevMap = stack.pop();
					for (String atom : countMap.keySet()) {
						int prevCount = prevMap.getOrDefault(atom, 0);
						prevMap.put(atom, prevCount + count * countMap.get(atom));
					}
					countMap = prevMap;
				} else {
					int j = i + 1;
					while (j < formula.length() && Character.isLowerCase(formula.charAt(j))) {
						j++;
					}
					String atom = formula.substring(i, j);
					i = j;
					int count = 0;
					while (i < formula.length() && Character.isDigit(formula.charAt(i))) {
						count = count * 10 + (formula.charAt(i) - '0');
						i++;
					}
					count = (count == 0) ? 1 : count;
					countMap.put(atom, countMap.getOrDefault(atom, 0) + count);
				}
			}

			List<String> atoms = new ArrayList<>(countMap.keySet());
			Collections.sort(atoms);
			StringBuilder result = new StringBuilder();
			for (String atom : atoms) {
				result.append(atom);
				int count = countMap.get(atom);
				if (count > 1) {
					result.append(count);
				}
			}

			return result.toString();
		}

		public static void main(String[] args) {
			String formula = "K4(ON(SO3)2)2";
			String output = countOfAtoms(formula+" \n");
			System.out.println(output); // Output: "K4N2O14S4"
		}
	

}
