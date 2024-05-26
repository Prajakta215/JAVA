package com.day02.ps06;

public class BankAccount {
	private int accNo;
	private String custName;
	private String accType;
	private float balance;
	
	public BankAccount(int accNo,String custName,String accType,float balance) throws NegativeAmountException , LowBalanceException{
		this.accNo = accNo;
		this.custName = custName;
		this.accType = accType;
		if(balance < 0) {
			throw new NegativeAmountException("Negative Amount");
		}
		if(accType.equals("saving") && balance < 1000) {
			throw new LowBalanceException("LowBalance");
		}
		if(accType.equals("Current") && balance < 5000) {
			throw new LowBalanceException("LowBalance");
		}
		this.balance = balance;
	}
	
	public void deposit(float amt) throws NegativeAmountException{
		if(amt < 0) {
			throw new NegativeAmountException("Negative Amount");
		}
		balance += amt;
	}
	
	public float getBalance() throws LowBalanceException{
		if(balance < 1000 && accType.equals("Saving")) {
			throw new LowBalanceException("LowBalance");
		}
		if(balance < 500 && accType.equals("Current")) {
			throw new LowBalanceException("LowBalance");
		}
		return balance;
		
	}
	
	public static void main(String[] args) {
		try {
			BankAccount acc1 = new BankAccount(123, "John", "Saving", 900);
			acc1.deposit(100);
			System.out.println("Balance after deposit: " + acc1.getBalance());		
		}catch(LowBalanceException e) {
			System.out.println(e.getMessage());
		}catch(NegativeAmountException e) {
			System.out.println(e.getMessage());
		}
		
		try {
			BankAccount acc2 = new BankAccount(123, "John", "Saving", -900);
		}catch(LowBalanceException e) {
			System.out.println(e.getMessage());
		}catch(NegativeAmountException e) {
			System.out.println(e.getMessage());
		}
	}
}
