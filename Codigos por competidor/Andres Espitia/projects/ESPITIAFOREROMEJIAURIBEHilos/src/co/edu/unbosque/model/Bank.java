package co.edu.unbosque.model;

public class Bank {
	public static Atm[] atms;
	
	public Bank(int n) {
		atms = new Atm[n];
		for (int i = 0; i < atms.length; i++) {
			atms[i] = new Atm();
		}
	}

	public static Atm[] getAtms() {
		return atms;
	}

	public static void setAtms(Atm[] atms) {
		Bank.atms = atms;
	}
	
	
}
