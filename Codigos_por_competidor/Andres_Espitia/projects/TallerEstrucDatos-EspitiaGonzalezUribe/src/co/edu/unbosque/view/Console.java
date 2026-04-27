package co.edu.unbosque.view;

import java.util.Scanner;

public class Console {

	private Scanner sc;
	private boolean lastInteger;
	
	public Console() {
		sc = new Scanner(System.in);
		lastInteger = false;
	}

	public int nextInt() {
		int aux = sc.nextInt();
		lastInteger = true;
		
		return aux;
	}
	
	public String nextLine() {
		String aux;
		if (lastInteger) {
			sc.nextLine();
			aux = sc.nextLine();			
		}
		else {
			aux = sc.nextLine();
		}
		lastInteger = false;
		return aux;
	}
	
	public void printMessageLn(String cadena) {
		System.out.println(cadena);
	}

	public void printMessage(String cadena) {
		System.out.print(cadena);
	}
	

}