package com.gurukul.day15;

import java.util.Stack;

public class ParkingG {

	private static final int MAX_CAPACITY = 10;

	public static void main(String[] args) {
		Stack<String> garageLane = new Stack<>();
		Stack<Integer> movesCounter = new Stack<>();

		// Sample input
		String input = "A ABC123"; // Car 'ABC123' arrives
		processInput(garageLane, movesCounter, input);

		input = "A XYZ789"; // Car 'XYZ789' arrives
		processInput(garageLane, movesCounter, input);

		input = "D ABC123"; // Car 'ABC123' departs
		processInput(garageLane, movesCounter, input);

		input = "D XYZ789"; // Car 'XYZ789' departs
		processInput(garageLane, movesCounter, input);
	}

	private static void processInput(Stack<String> garageLane, Stack<Integer> movesCounter, String input) {
		char action = input.charAt(0);
		String licensePlate = input.substring(2);

		if (action == 'A') {
			if (garageLane.size() < MAX_CAPACITY) {
				garageLane.push(licensePlate);
				movesCounter.push(0);
				System.out.println("Car '" + licensePlate + "' has arrived. Garage has space.");
			} else {
				System.out.println("Car '" + licensePlate + "' cannot enter. Garage is full.");
			}
		} else if (action == 'D') {
			int moves = 0;
			while (!garageLane.isEmpty()) {
				String car = garageLane.pop();
				moves++;
				if (car.equals(licensePlate)) {
					break;
				}
			}
			System.out.println("Car '" + licensePlate + "' has departed. Moved out " + (moves - 1)
					+ " time(s) to allow others to depart.");
			movesCounter.pop();
		}

	}

}
