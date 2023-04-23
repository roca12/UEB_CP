package co.edu.unbosque.controller;

import java.util.Scanner;

public class Ejercicio_8 {
	public static void main(String[] args) {
		//declarar variables
		Scanner leer = new Scanner(System.in);
		double metros, pulgadas, pies, ambos=0.0;
		
		//entrada
		
		System.out.println("Digite los metros a convertir: ");
		metros = leer.nextDouble();
		
		//operaciones
		
		pulgadas = metros * 39.37;
		pies = metros * 3.281;
		ambos = (pies%1)*12;
		
		
		//salida
		
		System.out.println(metros+"m equivalen a: "+pulgadas+"in.");
		System.out.println(pies+"ft.");
		pies = pies-(pies%1);
		System.out.println("Y "+pies+"ft. con "+ambos+"in.");
	}
}
