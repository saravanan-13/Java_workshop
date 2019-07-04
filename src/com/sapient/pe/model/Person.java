package com.sapient.pe.model;

public class Person {

	private int age;
	private String name;
	private double salary;
	private int vacationDays = 30;
	private Address address;
	private Account account;

	public Person(String name,int age, double salary, Address address) {
		this.age = age;
		this.name = name;
		this.salary = salary;
		this.address = address;
	}
	
	public Account getAccount() {
		return this.account;
	}
	
	public void setAccount(Account account) {
		this.account = account;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		 this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public int getVacationDays() {
		return vacationDays;
	}

	public void setVacationDays(int vacationDays) {
		this.vacationDays = vacationDays;
	}

	public void applyForLeave(int noOfDays) {
		if (this.vacationDays >= noOfDays) {
			this.vacationDays -= noOfDays;
		} else {
			System.out.println("Don't have sufficient vacation");
		}
	}
	
}
