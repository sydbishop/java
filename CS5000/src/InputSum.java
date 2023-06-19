// Class: CS 5000
// Term: Spring 2021
// Name: Sydney Bishop
// Program Number: Assignment 4 Program 1
// IDE: Eclipse

import java.util.Scanner; 

public class InputSum {

	public static void main(String args[]) {
		
		//establish variables
		int number = 0;
		int sum = 0;
		String numbers = "";
		String retry = "";
		
		//create scanner for user input
		Scanner input = new Scanner(System.in); 
		
		//begin while loop
		while (number != -1) {
			
			//prompt user to enter positive integers
			System.out.println("Enter positive integers (-1 to quit): ");
			number = input.nextInt();
				
			//user can enter sentinel value -1 to quit
			if (number == -1) {
					
				//remove final comma on integers displayed
				numbers = numbers.replaceAll(", $", "");
					
				//display all positive integers entered
				System.out.println("Entered numbers: " + numbers);
					
				//calculate sum of positive integers
				System.out.println("The Sum: " + "\t" + sum);
					
				//prompt user to rerun program with new set of inputs
				System.out.print("Retry? (Y/N): " + "\t"); 
				retry = input.next();
						
					if (retry.equalsIgnoreCase("Y")) {
						number = 0;
						sum = 0;
						numbers = "";
					}
						
					else {
						System.out.println("Program Terminated");
					}
						
				//restart loop
				continue;
				
				} 
				
			//ignore negative integers other than sentinel value -1
			else if (number < 0) {
					
			}
				
			//store positive integers
			else {
					
				//concatenate integers into a single string
				numbers = numbers.concat(String.valueOf(number));
				numbers = numbers.concat(", ");
					
				//add integers entered by user to calculate sum
				sum += number;
				
			}
		}
		
	}
	
}
