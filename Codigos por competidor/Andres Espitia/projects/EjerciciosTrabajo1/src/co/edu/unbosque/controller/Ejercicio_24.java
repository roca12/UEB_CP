package co.edu.unbosque.controller;

import java.util.Scanner;

public class Ejercicio_24 {
	public static void main(String[] args) {
		//declarar variables
		Scanner leer = new Scanner(System.in);
		int diferencia_edad, juan, perro = 0;
		
		//entrada
		
		System.out.println("Ingrese la diferencia de edad entre Juan y el perro: ");
		diferencia_edad = leer.nextInt();
		
		//operaciones
			
		juan = ((3*diferencia_edad)/2)-4;
		perro = juan-diferencia_edad;
			
		//salida
			
		System.out.println("La edad de Juan es "+juan+" años");
		System.out.println("La edad del perro es "+perro+" años");

	}
}
