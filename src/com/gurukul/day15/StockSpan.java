package com.gurukul.day15;

import java.util.Stack;

public class StockSpan {
    public static int[] calculateStockSpan(int[] prices) {
        int n = prices.length;
        int[] spans = new int[n];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && prices[stack.peek()] <= prices[i]) {
                stack.pop();
            }

            spans[i] = stack.isEmpty() ? i + 1 : i - stack.peek();
            stack.push(i);
        }

        return spans;
    }

    public static void main(String[] args) {
        int[] prices = {100, 80, 60, 70, 60, 75, 85};
        int[] spans = calculateStockSpan(prices);

        for (int span : spans) {
            System.out.print(span + " ");
        }
    }
}
