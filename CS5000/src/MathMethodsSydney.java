// Class: CS 5000
// Term: Spring 2021
// Name: Sydney Bishop
// Program Number: Assignment3 Program3
// IDE: Eclipse

import java.util.Scanner; 

public class MathMethodsSydney {
	public static void main(String args[]) //program main method starts
	{
		Scanner input = new Scanner(System.in); //create scanner class object
		
		//create variables for user input
		int a;
		float b;
		float c;
		float x;
		float y;
		int e; 
		
		//part A
		//prompt user to enter negative number
		System.out.print("Enter a negative integer number: " + "\t\t\t");
		a = input.nextInt();
		
		//determine its absolute value
		System.out.println("The absolute value of " + a + " is: " + "\t\t\t\t" + Math.abs(a));
	
		//part B
		//prompt user to enter float representing an angle
		System.out.print("Enter a floating-point number representing an angle: " + "\t");
		b = input.nextFloat();
		
		//determine cosine
		System.out.println("The cosine of this angle is: " + "\t\t\t\t" + Math.cos(b));
		
		//determine sine
		System.out.println("The sine of this angle is: " + "\t\t\t\t" + Math.sin(b));
		
		//determine tangent
		System.out.println("The tangent of this angle is: " + "\t\t\t\t" + Math.tan(b));
		
		//part C
		//prompt user to enter float
		System.out.print("Enter a floating-point number: " + "\t\t\t\t");
		c = input.nextFloat();
		
		//determine floor value
		System.out.println("The floor value of " + c + " is: " + "\t\t\t\t" + Math.floor(c));
		
		//determine ceiling value
		System.out.println("The ceiling value of " + c + " is: " + "\t\t\t\t" + Math.ceil(c));
		
		//part D
		//prompt user to enter float for variables X and Y
		System.out.print("Enter a floating-point number as X: " + "\t\t\t");
		x = input.nextFloat();
		System.out.print("Enter a floating-point number as Y: " + "\t\t\t");
		y = input.nextFloat();
		
		//determine X raised to power of Y
		System.out.println("The value of X^Y is: " + "\t\t\t\t\t" + Math.pow(x,y));
		
		//part E
		//prompt user to enter integer
		System.out.print("Enter an integer number: " + "\t\t\t\t");
		e = input.nextInt();
		
		//determine square root
		System.out.println("The square root of " + e + " is: " + "\t\t\t\t" + Math.sqrt(e));
		
	}
}
