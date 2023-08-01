package com.gurukul.day15;

import java.util.Stack;
public class Asteroids {

    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();
        
        for (int asteroid : asteroids) {
            while (!stack.isEmpty() && asteroid < 0 && stack.peek() > 0) {
                if (Math.abs(asteroid) > stack.peek()) {
                    stack.pop();
                } else if (Math.abs(asteroid) == stack.peek()) {
                    stack.pop();
                    break;
                } else {
                    break;
                }
            }
            
            if (stack.isEmpty() && asteroid > 0 &&  stack.peek() < 0) {
                stack.push(asteroid);
            }
        }
        
        int[] result = new int[stack.size()];
        for (int i = stack.size() - 1; i >= 0; i--) {
            result[i] = stack.pop();
        }
        
        return result;
    }
}

