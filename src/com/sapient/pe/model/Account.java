package com.sapient.pe.model;

public abstract class Account {

	private long accountNo;
	private double balance = 0;
	private static long accountNumber = 1000;
	private Person person;
	
	public Account(Person person) {
		this.person = person;
		this.accountNo = accountNumber;
		this.person.setAccount(this);
		accountNumber++;
	}

	public Person getPerson() {
		return this.person;
	}

	public long getAccountNumber() {
		return this.accountNo;
	}

	public double getBalance() {
		return this.balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public abstract double withDraw(double amount);

	public abstract void deposit(double amount);

}
