// Class: CS 5040
// Term: Fall 2021
// Name: Sydney Bishop
// Program Number: Assignment 1 Program 1
// IDE: Eclipse

import java.util.Scanner;

public class PrintReverseSydney {
	
	//recursive helper method
	public static String printCharsReverse(String str) {
		if (str.length() == 0) {
			return str;
		}
		else {
			int n = str.length();
			return str.charAt(n-1) + printCharsReverse(str.substring(0, n-1));
		}
	}

	//main method
	public static void main(String[]args) {
		//variables for retry prompt
		String retry = "Y";
		String str = "";
		
		//create scanner
		Scanner input = new Scanner(System.in);
		
		//while loop for retries
		while (retry.equalsIgnoreCase("Y")) {
			
			//prompt user to enter a string
			System.out.print("Enter a string: " + "\t");
			str = input.nextLine();
		
			//print given string in reverse
			System.out.println("String in reverse: " + "\t" + printCharsReverse(str));
		
			//prompt retry
			System.out.print("Try again? (Y/N): " + "\t");
			retry = input.nextLine();
		}
		System.out.println("Program Terminated");//while
		input.close();//close scanner
	}
}
