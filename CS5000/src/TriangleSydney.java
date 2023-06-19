// Class: CS 5000
// Term: Spring 2021
// Name: Sydney Bishop
// Program Number: Assignment 4 Program 3
// IDE: Eclipse

public class TriangleSydney {

	public static void main(String args []) {
		
		int rows = 5;
		int k = 0;
		
		//outer loop
		for (int i = 1; i <= rows; i++, k = 0) {
			
			//inner loop
			for (int j = 1; j <= rows - i; j++) {
				System.out.print("  ");
			}
			
			while (k != 2 * i - 1) {
				System.out.print("* ");
				k++;
			}
			
			System.out.println();
		}
	}
}
