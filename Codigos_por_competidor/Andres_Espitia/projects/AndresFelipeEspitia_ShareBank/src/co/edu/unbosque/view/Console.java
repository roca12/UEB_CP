package co.edu.unbosque.view;

import java.util.Scanner;

public class Console {
	private Scanner sc;
	
	public Console() {
		sc = new Scanner(System.in);
	}
	
	public int readInt() {
		int n = sc.nextInt();
		sc.nextLine();
		return n;
	}
	
	public String readString() {
		return sc.nextLine();
	}
	
	public void printSomething(String message) {
		System.out.println(message);
	}
	
}
