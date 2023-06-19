// Class: CS 5000
// Term: Spring 2021
// Name: Sydney Bishop
// Program Number: Assignment 6 Program 1.2
// IDE: Eclipse

import java.text.DecimalFormat;
import java.util.Scanner;

public class TestAccountSydney {
	public static void main (String[]args) {
		//variable for retry prompt
		String retry = "Y";
		
		//create first object
		AccountSydney myObject = new AccountSydney();
		myObject.setID(123456);
		myObject.setBalance(10000);
		myObject.setRate(.025);
		myObject.withdraw(3500);
		myObject.deposit(500);
		
		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("###.00");
		System.out.println("Account Balance:\t\t$" + df.format(myObject.getBalance()));
		System.out.println("Earned Monthly Interest:\t" + myObject.getMonthlyInterest(myObject.getMonthlyInterestRate()));
		System.out.println("Date:\t\t\t\t" + myObject.getDate());
		
		//System.out.print(myObject);
		
		//while loop for retries
		while (retry.equalsIgnoreCase("Y")) {
					
			
			//second account object
			AccountSydney myAccount = new AccountSydney();
			System.out.print("Enter myAccount ID:\t\t");
			if(input.hasNextInt()) {
				myAccount.setID(input.nextInt());
			}
			else {
				System.out.println("Please enter an integer for Account ID");
				break;
			}
			System.out.print("Enter myAccount Balance:\t");
			if(input.hasNextDouble()) {
				myAccount.setBalance(input.nextDouble());
			}
			else {
				System.out.println("Please enter a double for Account Balance");
				break;
			}
			System.out.print("Enter myAccount Interest Rate:\t");
			if(input.hasNextDouble()) {
				myAccount.setRate(input.nextDouble());
			}
			else {
				System.out.println("Please enter a double for Account Interest Rate");
				break;
			}
			
			//third account object
			AccountSydney yourAccount = new AccountSydney();
			System.out.print("Enter yourAccount ID:\t\t");
			if(input.hasNextInt()) {
				yourAccount.setBalance(input.nextInt());
			}
			else {
				System.out.println("Please enter an integer for Account ID");
				break;
			}
			System.out.print("Enter yourAccount Balance:\t");
			if(input.hasNextDouble()) {
				yourAccount.setBalance(input.nextDouble());
			}
			else {
				System.out.println("Please enter a double for Account Balance");
				break;
			}
			System.out.print("Enter yourAccount Interest Rate:");
			if(input.hasNextDouble()) {
				yourAccount.setRate(input.nextDouble());
			}
			else {
				System.out.println("Please enter a double for Account Interest Rate");
				break;
			}
			
			//getID
			System.out.println("Test getID method on myAccount: " + myAccount.getID());
			System.out.println(myAccount);
			
			//getBalance
			System.out.println("Test getBalance method on myAccount: " + myAccount.getBalance());
			System.out.println(myAccount);
			
			//getRate
			System.out.println("Test getRate method on myAccount: " + myAccount.getRate());
			System.out.println(myAccount);
			
			//getDate
			System.out.println("Test getDate method on myAccount: " + myAccount.getDate());
			System.out.println(myAccount);
			
			//getMonthlyInterestRate
			System.out.println("Test getMonthlyInterestRate method on myAccount: " + myAccount.getMonthlyInterestRate());
			System.out.println(myAccount);
			
			//getMonthlyInterest
			System.out.println("Test getMonthlyInterest method on myAccount: " + myAccount.getMonthlyInterest(myAccount.getMonthlyInterestRate()));
			System.out.println(myAccount);
			
			//setID
			System.out.println("Test setID method; change myAccount ID to myObject's ID \n"); 
			myAccount.setID(myObject.getID());
			System.out.println(myAccount);
			
			//setBalance
			System.out.println("Test setBalance method; change myAccount Balance to myObject's Balance \n"); 
			myAccount.setBalance(myObject.getBalance());
			System.out.println(myAccount);
			
			//setRate
			System.out.println("Test setRate method; change myAccount Interest Rate to myObject's Interest Rate \n"); 
			myAccount.setRate(myObject.getRate());
			System.out.println(myAccount);
			
			//withdraw
			System.out.println("Test withdraw method on myAccount; take out $1 ");
			myAccount.withdraw(1);
			System.out.println(myAccount);
			
			//deposit
			System.out.println("Test deposit method on yourAccount; give $1 ");
			yourAccount.deposit(1);
			System.out.println(yourAccount);
			
			//toString
			System.out.println("Test toString method on yourAccount:");
			System.out.println(yourAccount.toString());
			
			//prompt retry
			System.out.println("Retry? Y / N :");
			retry = input.next();
		}
	System.out.println("Program Terminated");//while
	input.close();//close scanner
	}

}
