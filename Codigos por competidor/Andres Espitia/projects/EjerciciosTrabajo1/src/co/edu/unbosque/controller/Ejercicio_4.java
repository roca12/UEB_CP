package co.edu.unbosque.controller;

import java.util.Scanner;

public class Ejercicio_4 {
	public static void main(String[] args) {
		//declarar variables
		Scanner leer = new Scanner(System.in);
		double pesos, cambio= 0;
		int dolar =2950, euro=3450, tipo_cambio=0;
		
		//entrada
		System.out.println("Elija si quiere pasar:");
		System.out.println("1) De pesos a Dolares");
		System.out.println("2) De pesos a Euros");
		System.out.println("*Digite unicamente el número: 1-2");
		tipo_cambio = leer.nextInt();
		
		System.out.println("Digite la cantidad de pesos a convertir: ");
		pesos = leer.nextDouble();
		
		//operaciones
		if(tipo_cambio==1) {
			cambio=pesos/dolar;
		}
		else{
			cambio=pesos/euro;
		}
		
		//salida
		System.out.println("Según su eleccion, el valor pasa de "+pesos+"$ a "+cambio+"$.");
	}
}
