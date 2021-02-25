package com.meritamerica.assignment1;
import java.util.math;

class CheckingAccount {
	private double balance;
	private double interestRate;
	double futureValue = 1;
	
	CheckingAccount(double openingBalance){
		balance = openingBalance;
	}
	
	double getBalance() {
		return balance;
	}
	
	double getInterestRate() {
		return interestRate;
	}
	
	boolean withdrawl(double amount) {
		if (amount <= balance && amount > 0) {
			balance -= amount;
			return true;
		} else {
			return false;
		}
	}
	
	boolean deposit(double amount) {
		if (amount > 0) {
			balance += amount;
			return true;
		} else return false;
		
	}
	
	double futureValue(int years) {
		futureValue = balance * Math.pow((1 + interestRate), years);
		return futureValue;
	}
	
	String toString() {
		return "Checking Account Balance: $" + balance + "\n" +
				"Checking Account Interest Rate: $" + interestRate + "\n" +
				"Checking Acount Balance in 3 Years: $" + futureValue;
	}
}