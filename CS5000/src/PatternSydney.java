// Class: CS 5000
// Term: Spring 2021
// Name: Sydney Bishop
// Program Number: Assignment 4 Program 2
// IDE: Eclipse

public class PatternSydney {
	
	public static void main(String args[]) {
		
		int rows = 6;
		
		//outer loop
		for (int i = rows; i >= 1; i--) {
			
			//inner loop
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
			for (int k = 0; k <= rows - i; k++) {
				System.out.print("  ");
			}
		}
	}
}
	

