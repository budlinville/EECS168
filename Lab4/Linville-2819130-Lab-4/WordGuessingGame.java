import java.util.Scanner;
public class WordGuessingGame {
	public static void main(String[] args){
		String userGuess = " ";
		final String SECRET_WORD = "valentine";
		Scanner input = new Scanner(System.in);
		boolean correctGuess = false;
		
		System.out.print("Welcome to the word guesing game.\nGuess a word: ");
		
		while(correctGuess != true) {
			userGuess = input.next();
			
			if(userGuess.equals(SECRET_WORD)) {
				System.out.print("You win!");
				correctGuess = true;
			} else {
				System.out.print("Incorrect. Guess again: ");
				correctGuess = false;
			}
		}
		input.close();	
	}
}
