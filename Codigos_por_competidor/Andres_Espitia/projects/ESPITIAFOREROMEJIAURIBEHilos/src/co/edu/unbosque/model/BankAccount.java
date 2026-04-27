package co.edu.unbosque.model;

public class BankAccount {
	private int balance;
	
	public BankAccount() {
		balance = (int) (Math.random() * (500000 - 100000) + 100000);
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	
}
