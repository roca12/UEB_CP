package co.edu.unbosque.controller;

import java.util.Scanner;

public class Ejercicio_12 {
	public static void main(String[] args) {
		//declarar variables
		Scanner leer = new Scanner(System.in);
		double aceleracion, tiempo, velocidad, distancia =0.0;
		
		//entrada
		do {
			System.out.println("Ingrese la aceleración del vehiculo: ");
			aceleracion = leer.nextDouble();
		}while(aceleracion<=0);
		do {
			System.out.println("Ingrese el tiempo en segundos: ");
			tiempo = leer.nextDouble();
		}while(tiempo<=0);
		
		//operaciones
		
		velocidad = aceleracion*tiempo;
		distancia = velocidad*tiempo;
		
		//salida
		
		System.out.println("El auto que aceleró constantemente a "+aceleracion+" m/s2 durante "+tiempo+" segundos, alcanzó una velocidad de "+velocidad+"m/s, recorriendo una distancia de "+distancia+"m.");
		
	}
}
