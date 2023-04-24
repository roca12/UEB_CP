package co.edu.unbosque.view;

import java.util.Scanner;

public class Console {
	private Scanner sc;
	
	public Console() {
		sc = new Scanner(System.in);
	}
	
	public String readString() {
		return sc.nextLine();
	}
	
	public int parse(String s) {
		try {
			return Integer.parseInt(s);
		} catch (Exception e) {
			return 0;
		}
	}
	
	public void printMessage(String message) {
		System.out.println(message);
	}
}
