// Class: CS 5000
// Term: Spring 2021
// Name: Sydney Bishop
// Program Number: Assignment3 Program2
// IDE: Eclipse

import java.util.Scanner;

public class StringMethodsSydney {
	public static void main(String args[]) //program main method starts
	{
		Scanner input = new Scanner(System.in); //create scanner class object
		
		//establish string_1 and string_2 from user input
		System.out.println("Enter two words separated by spaces: ");
		String s1 = input.next();
		String s2 = input.next();
		
		//part A: determine the length of string_1
		System.out.println("a) Length of String 1: " + "\t" + s1.length() + " characters");
		
		//part B: determine the length of string_2
		System.out.println("b) Length of String 2: " + "\t" + s2.length() + " characters");
		
		//part C: concatenation of string_1 and string_2
		System.out.println("c) Concatenation: " + "\t" + s1 + " " + s2);
		
		//part D: are the strings equal?
		if (s1.equals(s2)) {
			System.out.println("d) Equal strings?: " + "\t" + "Equal");
		}
		else {
			System.out.println("d) Equal strings?: " + "\t" + "Not equal");
		}
		
		//part E: uppercase string_1
		System.out.println("e) Uppercase String 1: " + "\t" + s1.toUpperCase());
		
		//part F: lowercase string_2
		System.out.println("f) Lowercase String 2: " + "\t" + s2.toLowerCase());
		
		//part G: extract one valid substring from string_1
		System.out.println("g) Valid substring: " + "\t" + s1.substring((s1.length()-2), s1.length()));
		
	}
		
}
