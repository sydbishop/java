// Class: CS 5000
// Term: Spring 2021
// Name: Sydney Bishop
// Program Number: Assignment 4 Program 4
// IDE: Eclipse

import java.util.Scanner;

public class PasswordSydney {

	public static void main(String args[]) {
		
		Scanner input = new Scanner(System.in);
		
		//create variables
		String password = "";
		String retry = "Y";
		
		//while loop for retries
		while (retry.equalsIgnoreCase("Y")) {
		
			//prompt user to enter password
			System.out.println("Enter a password: ");
			password = input.next();
			CheckPassword(password);
		
			//prompt retry
			System.out.print("Retry? (Y/N):" + "\t\t");
			retry = input.next();
		
		}
		
		System.out.println("Program Terminated");
		
	}
	
	public static void CheckPassword(String password) {
		
		//call method for check 1
		boolean rule_1 = CheckRule1(password);
		//call method for check 2
		boolean rule_2 = CheckRule2(password);
		//call method for check 3
		boolean rule_3 = CheckRule3(password);
		//call method for check 4
		boolean rule_4 = CheckRule4(password);
		//call method for check 5
		boolean rule_5 = CheckRule5(password);

		//valid pw
		if (rule_1 && rule_2 && rule_3 && rule_4 && rule_5) {
			System.out.println("Entered Password: " + "\t" + password);
			System.out.println("Judgement: " + "\t\t" + "Valid Password");
		}
		
		//invalid pw
		else {
			System.out.println("Entered Password: " + "\t" + password);
			System.out.println("Judgement: " + "\t\t" + "Invalid Password");
		}
		
	}
	
	//pw must include at least 9 characters
	public static boolean CheckRule1(String password) {
		if (password.length() >= 9) {
			return true;
		}
		else {
			return false;
		}
	}
	
	//pw must contain only letters & digits
	public static boolean CheckRule2(String password) {
		int len = password.length();
		for (int i = 0; i < len; i++) {
			if ((Character.isLetterOrDigit(password.charAt(i)) == false)) {
				return false;
			}
		}
		return true;
	}
	
	//pw must include at least 3 digits
	public static boolean CheckRule3(String password) {
		int len = password.length();
		int count = 0;
		for (int i = 0; i < len; i++) {
			if (Character.isDigit(password.charAt(i)) == true){
				count++;
			}
		}
		if (count >= 3) {
			return true;
		}
		return false;
	}
	
	//pw must include at least 3 lowercase letters
	public static boolean CheckRule4(String password) {
		int len = password.length();
		int count = 0;
		for (int i = 0; i < len; i++) {
			if (Character.isLowerCase(password.charAt(i)) == true){
				count++;
			}
		}
		if (count >= 3) {
			return true;
		}
		return false;
	}
		
	//pw must include at least 3 uppercase letters
	public static boolean CheckRule5(String password) {
		int len = password.length();
		int count = 0;
		for (int i = 0; i < len; i++) {
			if (Character.isUpperCase(password.charAt(i)) == true){
				count++;
			}
		}
		if (count >= 3) {
			return true;
		}
		return false;
	}
}
