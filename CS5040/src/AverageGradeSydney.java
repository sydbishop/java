// Class: CS 5040
// Term: Fall 2021
// Name: Sydney Bishop
// Program Number: Assignment 1 Program 2
// IDE: Eclipse

import java.util.Scanner;

public class AverageGradeSydney {
	
	//create recursive helper method
		public static double findAverage(int[] list, int n) {
			double sum, avg;
			if (n==1) {
				sum=list[0];
			}
			else {
				sum = list[n-1] + (n-1) * findAverage(list, n-1);
			}
			avg = sum/n;
			return avg;
		}
	
	//main method
	public static void main (String[]args) {
		
		//create variable for retry prompt
		String retry = "Y";
		
		//create scanner
		Scanner input = new Scanner(System.in);
		
		//while loop for retries
		while (retry.equalsIgnoreCase("Y")) {
			
			//prompt user to enter class size
			System.out.print("Class size: " + "\t\t");
			int size = input.nextInt();
			
			//create array to store grades
			int[] list = new int[size];
			
			//prompt user to enter grades
			System.out.print("Entered grades: " + "\t");
			
			//entered grades determine size of array
			for(int i = 0; i < list.length; i++) {
				list[i] = input.nextInt();
			}
			//clear the queue
			input.nextLine();
			
			//call method
			double avg = findAverage(list, list.length);
			
			//print average
			System.out.println("Class average: " + "\t\t" + avg);
			
			//prompt retry
			System.out.print("Try again? (Y/N): " + "\t");
			retry = input.nextLine();
			
		}//while
		System.out.println("Program Terminated");//while
		input.close();//close scanner
		
	}//main

}
