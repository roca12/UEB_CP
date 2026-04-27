package co.edu.unbosque.controller;

import java.util.Scanner;

public class Ejercicio_10 {
	public static void main(String[] args) {
		//declarar variables
		Scanner leer = new Scanner(System.in);
		int total, patas, pollos, vacas=0;
		
		//entrada
		
		System.out.println("Ingrese la cantidad total de animales: ");
		total = leer.nextInt();
		do {
			System.out.println("Ingrese la cantidad de patas total(par): ");
			patas = leer.nextInt();
		}while(patas%2!=0);
		
		
		//operaciones
		
		vacas = (patas/2)-total;
		pollos = total-vacas;		
		
		//salida
		
		System.out.println("Para "+total+" animales con "+patas+" patas, hay: ");
		System.out.println(pollos+" pollos y "+vacas+" vacas en total.");
		
	}
}