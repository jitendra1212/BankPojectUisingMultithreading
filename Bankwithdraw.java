package com.nt.multi;

public class Bankwithdraw implements Runnable {
	private BankAccount acc;
	Bankwithdraw(BankAccount acc){
		this.acc=acc;
		
	}
public void run() {
	acc.withdraw("Jitendra",2000);

}

}
