package co.edu.unbosque.controller;

import java.util.Scanner;

public class Ejercicio_2 {
	public static void main(String[] args) {
		//declarar variables
		Scanner leer = new Scanner(System.in);
		double dinero, tasa, interes= 0;
		tasa= 0.27;
		
		//entrada
		System.out.println("Por favor, digite la cantidad de dinero prestado");
		dinero = leer.nextDouble();
		
		//operaciones
		interes=(dinero*tasa)/12;
		
		//salida
		System.out.println("Para su dinero prestado: "+dinero+"$, el interés mensual es de: "+interes+"$");
	}
}
