// Class: CS 5040
// Term: Fall 2021
// Name: Sydney Bishop
// Program Number: Assignment 1 Program 3
// IDE: Eclipse

import java.util.Scanner;

public class StarPatternSydney {
	
	//recursive method to print stars
	public static void printStars(int stars) {
		if (stars == 0)
			return;
		System.out.print("* ");
		
		//recursively calling printStars
		printStars(stars - 1);
	}

	//recursive method to print spaces
	public static void printSpaces(int spaces) {
		if (spaces == 0)
		return;
		System.out.print(" ");
		
		//recursively calling printSpaces
		printSpaces(spaces - 1);
	}
	
	//recursive method to print pattern
	static void printPattern(int n, int num) {
	    if (n == 0)
	        return;
	    printSpaces(n - 1);
	    printStars(num - n + 1);
	    System.out.println("");
	 
	    // recursively calling pattern()
	    printPattern(n - 1, num);
	}
	
	//main
	public static void main (String[]args) {
		
		//create variable for retry prompt
		String retry = "Y";
		
		//create scanner
		Scanner input = new Scanner(System.in);
		
		//while loop for retries
		while (retry.equalsIgnoreCase("Y")) {
				
			//prompt user to enter # of rows
			System.out.print("Enter Number of Rows: ");
			String rows = input.nextLine();
		
			//cast user input string as integer
			int stars = Integer.parseInt(rows);
		
			//call method
			printPattern(stars, stars);
			
			//prompt retry
			System.out.print("Try again? (Y/N): ");
			retry = input.nextLine();
		}
		System.out.println("Program Terminated");//while
		input.close();//close scanner
	}
}
