// Class: CS 5040
// Term: Fall 2021
// Name: Sydney Bishop
// Program Number: Assignment 3 Program 2
// IDE: Eclipse

import java.util.Stack;
import java.util.Scanner;

public class TestStackSydney {
	public static void main(String[] args) {
		
		//create variable for retry
		String retry = "Y";
		
		while(retry.equalsIgnoreCase("Y")) {
			
			//create main menu
			System.out.println("-----MAIN MENU-----");
			System.out.println("0 - Exit Program");
			System.out.println("1 – Push");
			System.out.println("2 - Pop");
			System.out.println("3 – Peek (Top)");
			System.out.println("4 - Size");
			System.out.println("5 – Is Empty?");
			System.out.println("6 – Print Stack");
		
			//prompt user to enter test number from menu
			System.out.print("Choose menu: ");
			Scanner input = new Scanner(System.in);
			String testnum = input.nextLine().trim();
		
				if(testnum.equals("1")) { //Push	
					//create stack of strings
					MyStackSydney<String> s = new MyStackSydney<String>();
			
					//prompt user to enter three characters
					System.out.println("Enter three values separated by spaces: ");
					s.push(input.next());
					s.push(input.next());
					s.push(input.nextLine().trim());
					System.out.println(s);
			
					//prompt retry
					System.out.print("Try again? (Y/N): ");
					retry = input.nextLine();
				}
				
				else if(testnum.equals("2")) { //Pop
					//create stack of strings
					MyStackSydney<String> s = new MyStackSydney<String>();
					
					//push to create stack of strings for test
					s.push("A");
					s.push("B");
					s.push("C");
					System.out.println("Original String: " + s);
					
					//pop string
					s.pop();
					System.out.println("Popped String: " + s);
					
					//prompt retry
					System.out.print("Try again? (Y/N): ");
					retry = input.nextLine();
				}
				
				else if(testnum.equals("3")) { //Peek
					//create stack of strings
					MyStackSydney<String> s = new MyStackSydney<String>();
					
					//push to create stack of strings for test
					s.push("A");
					s.push("B");
					s.push("C");
					System.out.println("Original String: " + s);
					
					//peek string
					System.out.println("Peeked String: " + s.peek());
					
					//prompt retry
					System.out.print("Try again? (Y/N): ");
					retry = input.nextLine();
				}
				
				else if(testnum.equals("4")) { //Size
					//create stack of strings
					MyStackSydney<String> s = new MyStackSydney<String>();
					
					//push to create stack of strings for test
					s.push("A");
					s.push("B");
					s.push("C");
					System.out.println("Original String: " + s);
					
					//return size
					System.out.println("Size of String: " + s.size());
					
					//prompt retry
					System.out.print("Try again? (Y/N): ");
					retry = input.nextLine();
				}
				
				else if(testnum.equals("5")) { //Is Empty?
					//create stack of strings
					MyStackSydney<String> s = new MyStackSydney<String>();
					
					//push to create stack of strings for test
					//s.push("A");
					//s.push("B");
					//s.push("C");
					System.out.println("Original String: " + s);
					
					//check if empty
					System.out.println("Is empty?: " + s.isEmpty());
					
					//prompt retry
					System.out.print("Try again? (Y/N): ");
					retry = input.nextLine();
				}
				
				else if(testnum.equals("6")) { //Print Stack
					//create stack of strings
					MyStackSydney<String> s = new MyStackSydney<String>();
					
					//push to create stack of strings for test
					s.push("A");
					s.push("B");
					s.push("C");
					
					//Print stack as single string
					System.out.println("String Created: " + s.toString());
					
					//prompt retry
					System.out.print("Try again? (Y/N): ");
					retry = input.nextLine();
				}
			
				else if (testnum.equals("0")){ //Exit program
					break;
				}
				else {
					System.out.println("Invalid Input " + testnum + ".");
				}
		}//while
		System.out.println("Program Terminated");
		
	}
}
