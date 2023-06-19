// Class: CS 5000
// Term: Spring 2021
// Name: Sydney Bishop
// Program Number: Assignment1 Programming3
// IDE: Eclipse

import java.util.Scanner; //import scanner class

public class DrivingCostSydney {
	public static void main(String[] args) {
		
		//Create scanner class object
		Scanner s = new Scanner(System.in);
		
		//Create variables for user input
		double miles;
		double mpg;
		double dollars;
		
		//Prompt the user to enter three numbers
		System.out.print("Enter the distance (miles):" + "\t");
		miles = s.nextDouble();
		System.out.print("Fuel efficiency (mpg):" + "\t\t");
		mpg = s.nextDouble();
		System.out.print("Price per gallon (dollars):" + "\t");
		dollars = s.nextDouble();
		
		//Perform arithmetic operations
		double quotient = miles / mpg;
		double product = quotient * dollars;
		
		//Print result		
		System.out.println("The trip cost (dollars):" + "\t" + product);
		
	}

}
