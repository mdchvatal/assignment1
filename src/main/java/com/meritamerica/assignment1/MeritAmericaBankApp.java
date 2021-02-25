package com.meritamerica.assignment1;

public class MeritAmericaBankApp { 
	public static void main(String[] args) {
		AccountHolder accountHolder1 = new AccountHolder(100, 1000);
		System.out.println(accountHolder1.toString());
		accountHolder1.checking.deposit(500); 
		accountHolder1.savings.withdraw(800);
		System.out.println(accountHolder1.checking.toString()); 
		System.out.println(accountHolder1.savings.toString());
		AccountHolder accountHolder2 = new AccountHolder(200, 500);
		accountHolder2.checking.deposit(-500);
		accountHolder2.savings.withdraw(600);
		System.out.println(accountHolder2.toString());
	}
	
}