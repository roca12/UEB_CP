package co.edu.unbosque.model;

public class BankAccount {
	private int balance = 100;
	
	public void withdraw(int money) {
		balance -= money;
	}
	
	public void consign(int money) {
		balance += money;
	}

	public int getBalance() {
		return balance;
	}
	
}
