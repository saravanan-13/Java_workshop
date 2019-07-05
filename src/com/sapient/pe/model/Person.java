package com.sapient.pe.model;

import java.util.Objects;

public class Person implements Comparable<Person> {

	private int id;
	private int age;
	private String name;
	private double salary;
	private int vacationDays = 30;
	private Address address;
	private Account account;
	private static int personId = 1;

	public Person(String name,int age, double salary, Address address) {
		this.id = personId;
		this.age = age;
		this.name = name;
		this.salary = salary;
		this.address = address;
		personId ++;
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
	
	public String toString() {
		return "Name : "+ name + "\nAge : " + age + "\nSalary : " + salary +"\n"+address; 
				
	}
	
	public boolean equals(Object o) {

		if(o == null) {
			return false;
		}
		if(o.getClass() != Person.class) {
			return false;
		}
		Person other = (Person) o;
		return Objects.equals(this.id, other.id) && Objects.equals(this.name, other.name);
		
	}
	
	public int hashCode() {
		return Objects.hash(this.id, this.name, this.salary);
	}
	
	@Override
	public int compareTo(Person person) {
		return Integer.valueOf(this.id).compareTo(person.id);
	}
	
}
