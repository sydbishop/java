// Class: CS 5040
// Term: Fall 2021
// Name: Sydney Bishop
// Program Number: Assignment 4 Program 1
// IDE: Eclipse

import java.util.Scanner;

public class QuickSortReverseSydney {
	
	//function to consider last element as pivot
	//place pivot at its exact position
	//place smaller elements to left of pivot
	//place greater elements to right of pivot
	static int partition (int inputs[], int start, int end) {
		int pivot = inputs[end]; //pivot element
		int i = (start-1); //pointer for greater element
		
		for (int j=start; j <= end-1; j++) {
			//if current element > pivot
			//swap with greater element pointed by i
			if (inputs[j] >= pivot) {
				i++; //increment index of smaller element
				
				//swap element at i with element at j
				int t = inputs[i];
				inputs[i] = inputs[j];
				inputs[j] = t;
			}
		}
		//swap pivot element with greater element specified by i
		int t = inputs[i+1];
		inputs[i+1] = inputs[end];
		inputs[end] = t;
		
		//return position from where partition is done
		return (i+1);
	}
	
	//function to implement quick sort
	static void quickSort(int inputs[], int start, int end) {
		if (start<end) {
			
			//elements smaller than pivot are on the left
			//elements greater than pivot are on the right
			int p = partition(inputs,start,end);
			
			//recursively call on the left of pivot
			quickSort(inputs,start,p-1);
			
			//recursively call on the right on pivot
			quickSort(inputs,p+1,end);
		}
	}
	
	//function to print array
	void printInputs(int inputs[], int n) {
		int i;
		for(i=0;i<n;i++) {
			System.out.print(inputs[i]);
			if(i<n-1) {
				System.out.print(", ");
			}
		}
		System.out.println();
	}
	
	public static void main(String[]args) {
		//create scanner for user input
		Scanner s = new Scanner(System.in);
		
		//prompt user for size of array
		System.out.print("How many integer numbers do you have?: ");
		int n = s.nextInt();
		int inputs[] = new int[n];//create array
		
		//prompt user for array elements
		System.out.print("Enter " + n + " integer numbers: ");
		for(int i=0;i<n;i++) {
			inputs[i] = s.nextInt();
		}
		
		//print array before sorting
		System.out.println("------------------------------------------------------");
		System.out.print("Inputs array before sorting (quick): ");
		QuickSortReverseSydney q1 = new QuickSortReverseSydney();
		q1.printInputs(inputs, n);
		
		//call quickSort() on array inputs
		QuickSortReverseSydney.quickSort(inputs, 0, n-1);
		
		//print array after sorting
		System.out.print("Inputs array after sorting (quick): ");
		q1.printInputs(inputs, n);
		System.out.println();
		
	}

}
