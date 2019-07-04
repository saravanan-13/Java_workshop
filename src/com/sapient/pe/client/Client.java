package com.sapient.pe.client;

import java.util.Scanner;

import com.sapient.pe.model.Account;
import com.sapient.pe.model.Address;
import com.sapient.pe.model.CurrentAccount;
import com.sapient.pe.model.Person;
import com.sapient.pe.model.SalariedAccount;
import com.sapient.pe.model.SavingsAccount;

public class Client {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// Personal Information
		System.out.println("Enter your Name :");
		String name = sc.nextLine();

		System.out.println("Enter your age :");
		int age = sc.nextInt();

		System.out.println("Enter your salary :");
		double salary = sc.nextDouble();
		sc.nextLine();

		System.out.println("Please Give your address details \n");

		// Address Details
		System.out.println("Enter your street :");
		String street = sc.nextLine();

		System.out.println("Enter your area :");
		String area = sc.nextLine();

		System.out.println("Enter your city :");
		String city = sc.nextLine();

		System.out.println("Enter your zipcode :");
		String zipcode = sc.nextLine();

		Address address = new Address(street, area, city, zipcode);

		Person person1 = new Person(name, age, salary, address);

		System.out.println("\nYour personal details are saved successfully!\n");

		// Account Creation
		System.out.println("Do you want to create a account with us : \n 1.YES \n 2.NO");

		if (sc.nextInt() == 1) {

			boolean accountType_loop_check = true;

			while (accountType_loop_check) {

				// Switch Between different types of account
				System.out.println("\nWhat type of account you want to create : \n 1.Savings Account "
						+ "\n 2.Current Account \n 3.Salaried Account \n 4. None Of The Above");

				int accountType = sc.nextInt();
				sc.nextLine();
				switch (accountType) {
				case 1: {
					System.out.println("\nSAVINGS ACCOUNT REQUIREMENTS : \n" + "Minimum Account Balance : 10000\n"
							+ "Deposit Limit : 50000\n" + "WithDraw Limit : 25000\n"
							+ "10000 will be debited from your salary to your bank account!");
					System.out.println("\nWant to proceed with account creation ? \n 1.YES \n 2.NO");
					if (sc.nextInt() == 1) {

						// Checking if salary is sufficient for account creation
						if (person1.getSalary() >= 10000) {
							Account savingsAccount = new SavingsAccount(person1);
							accountType_loop_check = false;
							//Calling function which different bank options
							bank_options(savingsAccount);
						} else {
							System.out.println("Your salary is less than min balance ! Try again later!");
						}

					}
				}
					break;
				case 2: {
					System.out.println("\nCURRENT ACCOUNT REQUIREMENTS : \n" + "Minimum Account Balance : 25000\n"
							+ "Deposit Limit : NO LIMIT\n" + "WithDraw Limit : NO LIMIT\n"
							+ "25000 will be debited from your salary to your bank account!");
					System.out.println("\nWant to proceed with account creation ? \n 1.YES \n 2.NO");
					if (sc.nextInt() == 1) {
						
						// Checking if salary is sufficient for account creation
						if (person1.getSalary() >= 25000) {
							Account currentAccount = new CurrentAccount(person1);
							accountType_loop_check = false;
							//Calling function which different bank options
							bank_options(currentAccount);
						} else {
							System.out.println("Your salary is less than min balance ! Try again later!");
						}

					}
				}
					break;
				case 3: {
					System.out.println("\nSALARIED ACCOUNT REQUIREMENTS :  \n" + "Minimum Account Balance : 0\n"
							+ "Deposit Limit : 50000\n" + "WithDraw Limit : NO LIMIT\n");
					System.out.println("\nWant to proceed with account creation ? \n 1.YES \n 2.NO");
					if (sc.nextInt() == 1) {
						Account salariedAccount = new SalariedAccount(person1);
						accountType_loop_check = false;
						//Calling function which different bank options
						bank_options(salariedAccount);

					}
				}
					break;
				case 4: {
					accountType_loop_check = false;
				}
					break;
				default:
					System.out.println("Choose correct option from the list!\n");
					break;
				}
			}

		} else {
			System.out.println("You are missing out a great oppurtunity :( BYE!");
		}

		// System.out.println("Name : " + account.getPerson().getName());
		// System.out.println("Address :
		// "+account.getPerson().getAddress().displayAddress());
		// System.out.println("Salary : "+person1.getSalary());
		// account.deposit(person1.getSalary());
		// person1.getAccount().withDraw(20000);
		// System.out.println("Balance in account :
		// "+person1.getAccount().checkBalance());
		// System.out.println("Balance : "+person1.getAccount().checkBalance());

		// Employee cooper = new Employee(46, "cooper", 70_000);
		// System.out.println("Initial vacation available :"+sheldon.getVacationDays());
		// sheldon.applyForLeave(15);
		// System.out.println("Final vacation available :"+sheldon.getVacationDays());
		// sheldon.applyForLeave(25);
		//
		// System.out.println(sheldon.getAccountNumber());
		// System.out.println(cooper.getAccountNumber());

		// System.out.println(sheldon.checkBalance());
		// double amount = sheldon.withDraw(20000);
		// System.out.println("Amount credited : " + amount);
		// sheldon.deposit(15000);

		sc.close();
	}

	public static void bank_options(Account account) {
		System.out.println("Your Savings Account created successfully ! ");
		System.out.println("Account Number : " + account.getAccountNumber());

		Scanner sc = new Scanner(System.in);

		boolean loop_check = true;
		while (loop_check) {
			System.out.println("\nChoose one option : \n 1.Check account balance \n "
					+ "2.Deposit Money \n 3.WithDraw Money \n 4.Exit");
			int option = sc.nextInt();

			switch (option) {
			case 1:
				System.out.println("Your balance amount : " + account.getBalance());
				break;
			case 2: {
				System.out.println("Enter the Amount you want to deposit : ");
				account.deposit(sc.nextInt());
			}
				break;
			case 3: {
				System.out.println("Enter the Amount you want to withdraw : ");
				account.withDraw(sc.nextInt());
			}
				break;
			case 4: {
				System.out.println("Thanks for visiting us :)\n");
				loop_check = false;
			}
				break;
			default:
				System.out.println("Choose correct option from the list!\n");
				break;
			}

		}
		sc.close();
	}
}