package com.nt.multi;

public class Bankdeposite implements Runnable{
	private BankAccount acc;
	Bankdeposite(BankAccount acc){
		this.acc=acc;
		
	}

	public void run() {
		acc.deposite("Jitendra",2000);
	
	}

}
