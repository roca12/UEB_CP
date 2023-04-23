package co.edu.unbosque.controller;

import java.util.Scanner;

public class Ejercicio_22 {
	static final int costo_fijo=80, utilidad=60;
	public static void main(String[] args) {
		//declarar variables
		Scanner leer = new Scanner(System.in);
		int costo_variable, precio, unidades, ingreso, costo_total = 0;
		
		//entrada
		
		System.out.println("Digite el costo variable: ");
		costo_variable = leer.nextInt();
		System.out.println("Ahora el precio: ");
		precio = leer.nextInt();
		
		//operaciones
			
		costo_total = costo_variable + costo_fijo;
		ingreso = costo_total + utilidad;
		unidades = ingreso/precio;
			
		//salida
			
		System.out.println("Las unidades vendidas fueron "+unidades);

	}
}
