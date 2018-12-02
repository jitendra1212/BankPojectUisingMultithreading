package com.nt.multi;

public class BankAccount {
	private int bankAccount;
	private String holderName;
	private double balance;
	public BankAccount(int bankAccount, String holderName, double balance) {
		
		this.bankAccount = bankAccount;
		this.holderName = holderName;
		this.balance = balance;
	}
	public double deposite(String holderName,double amt) {
		balance=balance+amt;
		return balance;
	}
	public double withdraw(String holderName,double amt) {
		balance=balance-amt;
		return balance;
	}
	   
	@Override
	public String toString() {
		return "BankAccount [bankAccount=" + bankAccount + ", holderName=" + holderName + ", balance=" + balance + "]";
	}


}
