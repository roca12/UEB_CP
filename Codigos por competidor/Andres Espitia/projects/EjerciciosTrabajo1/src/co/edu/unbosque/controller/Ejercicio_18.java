package co.edu.unbosque.controller;

import java.util.Scanner;

public class Ejercicio_18 {
	public static void main(String[] args) {
		//declarar variables
		Scanner leer = new Scanner(System.in);
		int recogidos, iniciales = 0;
		
		//entrada
		
		System.out.println("Ingrese los huevos que recogio el granjero: ");
		recogidos = leer.nextInt();
			
		//operaciones
			
		iniciales = (40*recogidos)/21;
			
		//salida
			
		System.out.println("La cantidad inicial de huevos que llevaba al inicio era "+iniciales);
			

	}
}
