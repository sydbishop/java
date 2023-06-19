// Class: CS 5000
// Term: Spring 2021
// Name: Sydney Bishop
// Program Number: Assignment3 Program1
// IDE: Eclipse

import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner; 

public class RandomNumbersSydney {
	public static void main(String args[]) //program main method starts
	{
		Scanner s = new Scanner(System.in); //create scanner class object
		
		//create random variables
		double a = 25 + (int) (Math.random()*21);
		double b = (int)(Math.random()*41) - 20;
		double c = (int)(Math.random()*31) - 50;
		float d = (float)(Math.random()*22);
		
		//create decimal format class for part D
		DecimalFormat df_obj = new DecimalFormat("#.####"); 
		
		//Part A): generate integer between 25 and 45
		System.out.println("a) A random integer number between 25 and 45 (inclusive):" + "\t" + a);
		
		//Part B): generate integer between -20 and 20
		System.out.println("b) A random integer number between -20 and 20 (inclusive):" + "\t" + b);
		
		//Part C): generate integer between -50 and -20
		System.out.println("c) A random integer number between -50 and -20 (inclusive):" + "\t" + c);
		
		//Part D): generate float between 0.0 and 21.9999
		System.out.println("d) A random float between 0.0 and 21.9999 (inclusive):" + "\t\t" + df_obj.format(d));
			
	}
}
