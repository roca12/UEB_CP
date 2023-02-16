package co.edu.unbosque.view;

import java.util.Scanner;

public class Consola {

	private Scanner lector;

	public Consola() {
		lector = new Scanner(System.in);
	}

	public int leerEntero() {
		int temp = lector.nextInt();
		return temp;
	}

	public long leerLong() {
		long temp = lector.nextLong();
		return temp;
	}

	public float leerFlotante() {
		float temp = lector.nextFloat();
		return temp;
	}

	public double leerDouble() {
		double temp = lector.nextDouble();
		return temp;
	}

	public String leerLineaEntera() {
		String temp = lector.nextLine();
		return temp;
	}

	public String leerCadena() {
		String temp = lector.next();
		return temp;
	}

	public void quemarLinea() {
		lector.nextLine();
	}

	public char leerCaracter() {
		char temp = leerCadena().charAt(0);
		return temp;
	}

	public boolean leerBoolean() {
		boolean temp = Boolean.valueOf(leerCadena());
		return temp;
	}

	public void imprimirConSalto(String text) {
		System.out.println(text);
	}

	public void imprimirSinSalto(String text) {
		System.out.print(text);
	}

	public void imprimirSalto() {
		System.out.println();
	}
	
}
