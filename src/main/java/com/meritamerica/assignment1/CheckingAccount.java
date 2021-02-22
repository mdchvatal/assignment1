package com.meritamerica.assignment1;

class CheckingAccount {
	private double balance;
	private double interestRate;
	
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
	
	
}