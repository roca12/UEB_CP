package co.edu.unbosque.controller;

import java.util.Scanner;

public class Ejercicio_6 {
	public static void main(String[] args) {
		//declarar variables
		Scanner leer = new Scanner(System.in);
		int horas, minutos=0;
		double segundos, costo=0.0;
		
		//entrada
		
		System.out.println("Ingrese las horas requeridas para el proceso: ");
		horas = leer.nextInt();
		System.out.println("Ahora los minutos: ");
		minutos = leer.nextInt();
		System.out.println("Y por último los segundos: ");
		segundos = leer.nextDouble();
		
		//operaciones
		
		costo = (segundos*3.25)+(minutos*60*3.25)+(horas*3600*3.25);
		
		//salida
		System.out.println("El costo de un proceso de: "+horas+":"+minutos+":"+segundos+". Es de "+costo+"$.");
	}
}