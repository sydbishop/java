// Class: CS 5000
// Term: Spring 2021
// Name: Sydney Bishop
// Program Number: Assignment1 Programming1
// IDE: Eclipse

import java.util.Scanner; //import scanner class

public class HelloSydney 
{
	
	public static void main(String args[]) //program main method starts
	{
		Scanner s = new Scanner(System.in);
			System.out.print("Please enter your name: "); //print the instruction
			
			String name = s.nextLine(); //read user input (one line as a string)
			
			System.out.println("Hello " + name + "!"); //print out your message
	}

}
