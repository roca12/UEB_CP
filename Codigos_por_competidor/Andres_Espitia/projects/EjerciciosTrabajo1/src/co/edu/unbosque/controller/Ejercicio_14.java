package co.edu.unbosque.controller;

import java.util.Scanner;

public class Ejercicio_14{
	public static void main(String[] args) {
		//declarar variables
		Scanner leer = new Scanner(System.in);
		int padre, hijo = 0;
		int anios=0;
		
		//entrada
		
		do {
			System.out.println("Ingrese la edad del padre: ");
			padre = leer.nextInt();
			System.out.println("Ingrese la edad del hijo: ");
			hijo = leer.nextInt();
		}while(padre<hijo);
		
		//operaciones
		
		for(anios=0; padre/hijo!=3 || padre%hijo!=0; anios++) {
			padre++;
			hijo++;
		}
		
		//salida
		
		System.out.println("Para que la edad del padre sea 3 veces la del hijo deben pasar "+anios+" años.");
		
	}
}
