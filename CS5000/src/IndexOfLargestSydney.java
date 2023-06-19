// Class: CS 5000
// Term: Spring 2021
// Name: Sydney Bishop
// Program Number: Assignment 5 Program 1
// IDE: Eclipse

import java.util.Scanner;

public class IndexOfLargestSydney {
	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);
		
		//create variable for user input
		String retry = "Y";
				
		//while loop for retries
		while (retry.equalsIgnoreCase("Y")) {
		
			//prompt user to enter 10 integers
			System.out.println("Enter 10 integers: ");
			
			//create array
			int[] list = new int[10];
			list[0] = input.nextInt();
			list[1] = input.nextInt();
			list[2] = input.nextInt();
			list[3] = input.nextInt();
			list[4] = input.nextInt();
			list[5] = input.nextInt();
			list[6] = input.nextInt();
			list[7] = input.nextInt();
			list[8] = input.nextInt();
			list[9] = input.nextInt();
			
			//call method
			int largest = findIndex(list);
			
			//print result
			System.out.println(" ");
			System.out.println("Index of largest value: " + largest);
			
			//prompt retry
			System.out.print("Retry? (Y/N):" + "\t\t");
			retry = input.next();
		}
		System.out.println("Program Terminated");//while
		input.close();//close scanner
		
	}//main
	
	//method
	public static int findIndex(int[] list) {
		
		//create variable
		int largest = 0;
		
		//find largest value in array
		int i = 0;
		System.out.print("You entered these values: ");
		while (i < list.length) {
			System.out.print(list[i] + " ");
			if (largest < list[i]) {
				largest = list[i];
			}//if
			i++;
			
		}//while
		return largest;
		
	}//method
}
