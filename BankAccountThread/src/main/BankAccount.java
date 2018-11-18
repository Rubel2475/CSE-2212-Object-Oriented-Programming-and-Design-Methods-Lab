package main;

public class BankAccount {
	private double balance;
	public BankAccount() {
		balance=0;
	}
	public void deposit(double amount) {
		System.out.println("Depositing "+ amount);
		double newBalance = balance +amount;
		System.out.println(", new balance is  "+ newBalance);
		balance = newBalance;
	}
	public void withdraw(double amount) {
		System.out.println("Withdraw "+ amount);
		double newBalance = balance - amount;
		System.out.println(", new balance is  "+ newBalance);
		balance = newBalance;
	}
	public double getBalance() {
		return balance;
	}

}
