// Class: CS 5040
// Term: Fall 2021
// Name: Sydney Bishop
// Program Number: Assignment 4 Program 2
// IDE: Eclipse

import java.util.Scanner;

public class RadixSortSydney {
	//get maximum element from input array
	public static int getMax(int[]inputs) {
		int max = inputs[0];
		for(int i=1;i<inputs.length;i++) {
			if(inputs[i] > max) {
				max = inputs[i];
			}
		}
		return max;
	}
	//function to extract number
	public static void ExtractDigit(int[]inputs, int pos) {
		//create queues
		Queue Q0 = new Queue();
		Queue Q1 = new Queue();
		Queue Q2 = new Queue();
		Queue Q3 = new Queue();
		Queue Q4 = new Queue();
		Queue Q5 = new Queue();
		Queue Q6 = new Queue();
		Queue Q7 = new Queue();
		Queue Q8 = new Queue();
		Queue Q9 = new Queue();
		
		//extract numbers from input array and load into queues
		for(int i=0;i<inputs.length;i++) {
			int qNum = (int)((inputs[i]%(Math.pow(10, pos+1)))/(Math.pow(10, pos)));
			switch(qNum) {
			case 0:
				Q0.enqueue(inputs[i]);
				break;
			case 1:
				Q1.enqueue(inputs[i]);
				break;
			case 2:
				Q2.enqueue(inputs[i]);
				break;
			case 3:
				Q3.enqueue(inputs[i]);
				break;
			case 4:
				Q4.enqueue(inputs[i]);
				break;
			case 5:
				Q5.enqueue(inputs[i]);
				break;
			case 6:
				Q6.enqueue(inputs[i]);
				break;
			case 7:
				Q7.enqueue(inputs[i]);
				break;
			case 8:
				Q8.enqueue(inputs[i]);
				break;
			case 9:
				Q9.enqueue(inputs[i]);
				break;
			}
		}
		//reload array
		for(int i=0;i<inputs.length;i++) {
			if(Q0.isEmpty()==false) {
				inputs[i] = (int)Q0.front();
				Q0.dequeue();
			}
			else if(Q1.isEmpty()==false) {
				inputs[i] = (int)Q1.front();
				Q1.dequeue();
			}
			else if(Q2.isEmpty()==false) {
				inputs[i] = (int)Q2.front();
				Q2.dequeue();
			}
			else if(Q3.isEmpty()==false) {
				inputs[i] = (int)Q3.front();
				Q3.dequeue();
			}
			else if(Q4.isEmpty()==false) {
				inputs[i] = (int)Q4.front();
				Q4.dequeue();
			}
			else if(Q5.isEmpty()==false) {
				inputs[i] = (int)Q5.front();
				Q5.dequeue();
			}
			else if(Q6.isEmpty()==false) {
				inputs[i] = (int)Q6.front();
				Q6.dequeue();
			}
			else if(Q7.isEmpty()==false) {
				inputs[i] = (int)Q7.front();
				Q7.dequeue();
			}
			else if(Q8.isEmpty()==false) {
				inputs[i] = (int)Q8.front();
				Q8.dequeue();
			}
			else if(Q9.isEmpty()==false) {
				inputs[i] = (int)Q9.front();
				Q9.dequeue();
			}
		}
	}
	//Radix Sort
	public static void radixSort(int[]inputs) {
		//find highest number of digits and set to k
		int k = getMax(inputs);
		//loop through radix process k times
		for(int count=0;count<k;count++) {
			ExtractDigit(inputs,count);
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
		System.out.print("Inputs array before sorting (radix): ");
		RadixSortSydney r1 = new RadixSortSydney();
		r1.printInputs(inputs, n);
		
		//call radixSort() on array inputs
		radixSort(inputs);
		
		//print array after sorting
		System.out.print("Inputs array after sorting (radix): ");
		r1.printInputs(inputs, n);
		System.out.println();
	}
}
