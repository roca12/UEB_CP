package co.edu.unbosque.controller;

import java.util.Scanner;

public class Ejercicio_16 {
	public static void main(String[] args) {
		//declarar variables
		Scanner leer = new Scanner(System.in);
		int edad_a, edad_r = 0;
		
		//entrada
		
		System.out.println("Ingrese la edad de Andrea: ");
		edad_a=leer.nextInt();
			
		//operaciones
			
		edad_r=(2*edad_a)/3;
			
		//salida
			
		System.out.println("La edad de Rodrigo es "+edad_r);
			

	}
}
