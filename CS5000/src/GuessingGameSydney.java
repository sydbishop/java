// Class: CS 5000
// Term: Spring 2021
// Name: Sydney Bishop
// Program Number: Assignment2 Program1
// IDE: Eclipse

import java.util.Random;
import java.util.Scanner;

public class GuessingGameSydney {
	public static void main(String args[]) //program main method starts
	{
		Random rand = new Random();
		int numberToGuess = rand.nextInt(100);
		int numberOfTries = 4;
		Scanner input = new Scanner(System.in);
		int guess;
		boolean win = false;
		while (win == false) {
		
			//prompt user input
			if (numberOfTries == 4) {
				System.out.println("Welcome to the Game of Guess it!");
				System.out.println("I will choose a number between 0 and 99.");
				System.out.println("You will try to guess that number. If you guess wrong, I will tell you if your guess was too high or too low.");
				System.out.println("You have 4 tries to guess the number.");
				System.out.println("Ok, I am thinking of a number. Try to guess it:");
			}
			
			guess = input.nextInt();
			numberOfTries--;
		
			if (guess == numberToGuess) {
				win = true; 
				System.out.println("Correct!");
				
			}
			
			else if (numberOfTries > 0) {
			
				if (guess < numberToGuess) {
					System.out.println("Your guess is too low");
				}
				
				else {
					System.out.println("Your guess is too high");
				}
			
			}
			
			else {
				System.out.println("Incorrect. The correct answer is " + numberToGuess);
				
			}
			
		}//while
		
	}//method
	
}//class
