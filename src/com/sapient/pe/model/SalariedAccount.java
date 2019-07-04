package com.sapient.pe.model;

public class SalariedAccount extends Account {

	private static final double MIN_BALANCE = 0;
	private static final double WITHDRAW_LIMIT = Integer.MAX_VALUE;
	private static final double DEPOSIT_LIMIT = 50000;

	
	public SalariedAccount(Person person) {
		super(person);
	}
	
	@Override
	public double withDraw(double amount) {

		if (amount <= WITHDRAW_LIMIT) {
			if (amount + MIN_BALANCE <= this.getBalance()) {
				System.out.println(amount + " - Debited from your Current Account!");
				this.setBalance(this.getBalance() - amount);
				System.out.println("Balance amount : " + this.getBalance());
				return amount;
			} else {
				System.out.println("Amount is higher than Min balance");
				return 0;
			}
		} else {
			System.out.println("Withdrawal Limit Reached! Try again Later :(");
			return 0;
		}

	}

	@Override
	public void deposit(double amount) {

		if (amount <= DEPOSIT_LIMIT) {
			this.setBalance(this.getBalance() + amount);
			System.out.println(amount + " - Credited to your Current Account !");
			System.out.println("Balance amount : " + this.getBalance());
		} else {
			System.out.println("Deposit Limit Reached! Try again Later :(");
		}

	}
}
