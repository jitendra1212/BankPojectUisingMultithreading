package com.nt.multi;

public class TestBank {
	public static void main(String[] args) throws InterruptedException {
		BankAccount account = new BankAccount(123,"Jitndera",10000);
		BankAccount account1 = new BankAccount(122,"Jitndera",150000);
		
		
//		Thread th = new Thread();
//		new   Bankdeposite(account).start();
//		new   Bankwithdraw(account).start();
		//Bankdeposite dep = new Bankdeposite(account);
		
		//System.out.println(account);
		/*Bankdeposite dep1 = new Bankdeposite(account1);
		dep1.run();
		System.out.println(account1);*/
		System.out.println(account);
		Bankwithdraw bw= new Bankwithdraw(account);
		Bankdeposite dp = new Bankdeposite(account);
		
		
		//Bankdeposite dp = new Bankdeposite(account);
		Thread th = new Thread(bw);
	   Thread th1 = new Thread(dp);
	   th1.start();
	   Thread.sleep(3000);
		System.out.println(account);
	th.start();
	Thread.sleep(5000);
  /*  dp.run();*/
   
		System.out.println(account);
		Bankwithdraw bw1= new Bankwithdraw(account1);
		Bankdeposite dp1 = new Bankdeposite(account1);
		Thread th2 = new Thread(bw1);
		Thread th3 = new Thread(dp1);
		th2.start();
		Thread.sleep(2000);
		System.out.println(account1);
		th3.start();
		Thread.sleep(1000);
		System.out.println(account1);
	}

}
