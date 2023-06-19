// Class: CS 5000
// Term: Spring 2021
// Name: Sydney Bishop
// Program Number: Assignment2 Program2
// IDE: Eclipse

import java.util.Scanner;

public class PhoneBillSydney {
	
	public static void main(String[] args) {
		
		//Create scanner class object
		Scanner s = new Scanner(System.in);
		
		//Create variables for user input
		int accountNumber = 0;
		int serviceType = 0;
		int minutes = 0;
		double cost = 0;
		int dayMinutes = 0;
		int nightMinutes = 0;
		
		//create static variables
		final double regularFee = 15;
		final double premiumFee = 25;
		final double regularRate = 0.25;
		final double premiumDayRate = 0.08;
		final double premiumNightRate = 0.03;
		final double regularFreeMin = 60;
		final double premiumDayFreeMin = 75;
		final double premiumNightFreeMin = 100;
		
		//Prompt user input
		System.out.println("Account Number:" + "\t");
			accountNumber = s.nextInt();
			
		System.out.println("Service Type (Regular or Premium):" + "\t");
			String input = s.next();
			
			if (input.equals("Regular")) {
				serviceType = 0;
			}
			
			else {
				serviceType = 1;
			}	
			
		if (serviceType == 1) {
			System.out.println("Daytime minutes:" + "\t");
				dayMinutes = s.nextInt();
			System.out.println("Nighttime minutes:" + "\t");
				nightMinutes = s.nextInt();
		}
		
		else {
			System.out.println("Total minutes:" + "\t");
				minutes = s.nextInt();
		}

		//Perform arithmetic operations
		if(serviceType == 0) { //Regular pricing
			cost = (regularRate * (minutes - regularFreeMin)) + regularFee;
			if (cost < 15) {
				cost = 15;
			}
		}
		else { //Premium pricing
			cost = (premiumDayRate * (dayMinutes - premiumDayFreeMin)) + (premiumNightRate * (nightMinutes - premiumNightFreeMin)) + premiumFee;
			if (cost < 25) {
				cost = 25;
			}
		}
			
		//Print result		
		System.out.println("Account Number" + "\t\t" + accountNumber);
		System.out.println("Service Type" + "\t\t" + input);
		
		if (serviceType == 1) {
			System.out.println("Daytime minutes:" + "\t" + dayMinutes);
			System.out.println("Nighttime minutes:" + "\t" + nightMinutes);
		}
		
		else {
			System.out.println("Total minutes:" + "\t\t" + minutes);
		}
		
		System.out.println("Amount Due (dollars):" + "\t" + cost);

		}
	
	}
