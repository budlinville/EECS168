import java.util.Scanner;
public class NumberGuessingGame {
	public static void main(String[] args) {
		int userGuess = 0;
		boolean correctGuess = false;
		Scanner input = new Scanner(System.in);
		final int SECRET_NUM = 73;
		
		System.out.println("Welcome to the number guessing game.");
		do {
			System.out.println("Guess a number: ");
			userGuess = input.nextInt();
			if (userGuess < SECRET_NUM) {
				System.out.println("Sorry, your guess is too low.");
				correctGuess = false;
			} else if (userGuess > SECRET_NUM) {
				System.out.println("Sorry, your guess is too high.");
				correctGuess = false;
			} else {
				System.out.println("You win!");
				correctGuess = true;
			}
		} while (correctGuess == false);
	}
}
