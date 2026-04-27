package co.edu.unbosque.controller;

import co.edu.unbosque.model.ShareAccount;

public class AplMain {
	public static void main(String[] args) {
		ShareAccount sa = new ShareAccount();
		Thread one = new Thread(sa);
		Thread two = new Thread(sa);
		one.setName("Stefania");
		two.setName("Andres");
		one.start();
		two.start();
	}
}
