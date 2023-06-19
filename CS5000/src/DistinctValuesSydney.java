// Class: CS 5000
// Term: Spring 2021
// Name: Sydney Bishop
// Program Number: Assignment 5 Program 1
// IDE: Eclipse

import java.util.Scanner;

public class DistinctValuesSydney {
	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);
		
		//create variables
		String retry = "Y";
		int[] list = new int[10];
		int[] distinctList = new int[10];
		
		//while loop for retries
		while (retry.equalsIgnoreCase("Y")) {
				
			//create variables for printing lists
			int i = 0, j = 0;
			
			//prompt user to enter 10 integers
			System.out.println("Enter 10 integers: ");
					
			//create array
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
			distinctList = getValues(list);
				
			//return original array
			System.out.print("Array before processing: ");
			while (i < list.length) {
				System.out.print(list[i] + " ");
				i++;
			}
			System.out.println(" ");
			
			//return new array
			System.out.print("Array after processing: ");
			while (j < distinctList.length) {
				System.out.print(distinctList[j] + " ");
				j++;
			}
			System.out.println(" ");
			
			//prompt retry
			System.out.print("Retry? (Y/N):" + "\t\t");
			retry = input.next();
		}
		System.out.println("Program Terminated");//while
		input.close();//close scanner
		
	}//main
	
	//method - return input array with distinct values only
	public static int[] getValues(int[] list) {
		
		//create variables for new array
		int[] newList = new int[10];
		newList[0] = list[0];
		int i = 1, j = 0, k = 0, index = 1;
		
		//loop thru input list
		for (i = 1; i < list.length; i++) {
			
			//create variable for value at current index
			int currentValue = list[i];
			
			//create variable for duplicate input
			boolean duplicate = false;
			
			//loop thru newList
			for (j = 0; j < newList.length; j++) {
				//check if current value is in newList
				if (currentValue == newList[j]) {
					duplicate = true;
				}
			}//inner for loop
			
			//if duplicate value skip, else add to newList
			if (duplicate) {
				k++;//keep track of number of duplicates
			}	
			else {
				index = i-k;//subtract count of duplicates from index
				newList[index] = list[i]; 
			}//if
			
		}//outer for loop
		
		//eliminate trailing 0s
		index = list.length - k;
		int[] distinctList = new int[index];
		for(i = 0; i < index; i++) {
			distinctList[i] = newList[i];
		}
		
		return distinctList;	
		
	}//method
}
	
