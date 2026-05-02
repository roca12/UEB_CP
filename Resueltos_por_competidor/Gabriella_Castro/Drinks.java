/*
 * Autor: Gabriella Castro
 * Problema: Drinks
 * Juez online: Codeforces
 * Veredicto: Accepted
 * URL: https://codeforces.com/problemset/problem/200/B
 */

import java.util.Scanner;

public class Drinks {
	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);

		int bebidas = sc.nextInt();
		int suma = 0;
		
		for(int i = 0; i<bebidas; i++) {
			
			int vaso = sc.nextInt();
			suma += vaso;
			
		}
		
		double respuesta = (double) suma/bebidas;
		System.out.printf("%.12f" , respuesta);
		
	}

}
