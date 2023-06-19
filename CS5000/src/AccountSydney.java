// Class: CS 5000
// Term: Spring 2021
// Name: Sydney Bishop
// Program Number: Assignment 6 Program 1.1
// IDE: Eclipse


import java.text.DecimalFormat;
import java.util.Calendar;
import java.util.Date;

public class AccountSydney {
	//instance variables
	private int id;
	private double balance;
	private double annualInterestRate;
	private Date dateCreated;
	
	
	//constructor for default account
	public AccountSydney() {
		this.id = 0;
		this.balance = 0;
		this.annualInterestRate = 0;
		this.dateCreated = Calendar.getInstance().getTime();
	}
	
	//constructor for account with specified ID & balance
	public AccountSydney(int id_new, double bal_new) {
		this.id = id_new;
		this.balance = bal_new;
		this.dateCreated = Calendar.getInstance().getTime();
	}
	
	//getters
	public int getID() {
		return this.id;
	}
	public double getBalance() {
		return this.balance;
		
	}
	public double getRate() {
		return this.annualInterestRate;
	}
	public Date getDate() {
		return this.dateCreated;
	}
	
	//setters
	public void setID(int id_new) {
		this.id = id_new;
	}
	public void setBalance(double bal_new) {
		this.balance = bal_new;
	}
	public void setRate(double rate_new) {
		this.annualInterestRate = rate_new;
	}
	
	//format as %
	//monthly interest rate method
	public String getMonthlyInterestRate() {
		double monthly_rate = this.annualInterestRate / 12;
		return (monthly_rate + "%");
	}
	
	//format as $
	//monthly interest method
	public String getMonthlyInterest(String monthlyInterestRate) {
		DecimalFormat df = new DecimalFormat("###.00");
		String monthly_interest = monthlyInterestRate.substring(0,monthlyInterestRate.length()-1);
		double monthly_interest_d = this.balance * Double.parseDouble(monthly_interest);
		return ("$" + df.format(monthly_interest_d));
	}
	
	//withdraw method
	public void withdraw(double amount_w) {
		this.setBalance(this.getBalance() - amount_w);
	}
	
	//deposit method
	public void deposit(double amount_d) {
		this.setBalance(this.getBalance() + amount_d);
	}
	 
	public String toString(){ 
		return ("Account ID: \t\t" + this.id + "\n" +
				"Account Balance: \t" + this.balance + "\n" +
				"Interest Rate: \t\t" + this.annualInterestRate + "\n" + 
				"Date Opened: \t\t" + this.dateCreated +
				"\n");
	}
}



