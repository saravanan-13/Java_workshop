package com.sapient.pe.model;

import java.util.Objects;

public abstract class Account implements Comparable<Account>{

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

	@Override
	public int hashCode() {
		return Objects.hash(this.accountNo, this.person.getName(), this.person.getAddress());
	}

	@Override
	public boolean equals(Object o) {
		if(o == null) {
			return false;
		}
		if(o.getClass() != Person.class) {
			return false;
		}
		Account other = (Account) o;
		return Objects.equals(this.accountNo, other.accountNo);
	}
	
	
	@Override
	public String toString() {
		return "Account Number : "+ accountNo + "\nAccount Name : "+person.getName() + "\n Balance : "+getBalance()+"\n";
	}
	

	public abstract double withDraw(double amount);

	public abstract void deposit(double amount);

}
