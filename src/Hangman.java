import java.util.Scanner;
import java.util.Random;

public class Hangman {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		Random random = new Random();
		String[] words = {"steam", "school", "game", "coging"};
		
		boolean playing = true;
		
		while (playing) {
			System.out.println("Game has started!");
			char[] randomWord = words[random.nextInt(words.length)].toCharArray();
			int amount = randomWord.length;
			char[] guessWord = new char[amount];
			
			for (int i = 0; i < guessWord.length; i++) {
				guessWord[i] = '_';
			}
			
			boolean guessed = false;
			int tries = 0;
			
			while (!guessed && tries != amount) {
				System.out.print("Current tries: ");
				printArray(guessWord);
				System.out.printf("You have %d tries left.\n", amount - tries);
				System.out.println("Enter a character!");
				char input = s.nextLine().charAt(0);
				
			}
		}	
	}
	
	public static void printArray(char[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}
}
