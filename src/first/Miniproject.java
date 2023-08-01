package first;

import java.util.Scanner;

public class Miniproject {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// RandomNumber Mini-Project
		Scanner sc = new Scanner(System.in);
		// System.out.println("Enter Number");

		int myNumber = (int) (Math.random() * 100);
		int userNumber = 0;
		do {
			System.out.println("Guess Number :");
			userNumber = sc.nextInt();
			if (myNumber > userNumber) {
				System.out.println("Your NUmber is too small");
			} else if (myNumber < userNumber) {
				System.out.println("Your NUmber is too large");
			} else {
				System.out.println("woooh!!....its correct");
			}
		} while (userNumber >= 0);

		System.out.println("Number was:");
		System.out.println(myNumber);
	}

}
