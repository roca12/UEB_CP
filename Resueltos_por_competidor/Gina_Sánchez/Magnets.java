/*
 * Autor: Gina Sofia Sánchez Estupiñan
 * Problema: Magnets
 * Juez online: Codeforces
 * Veredicto: Accepted
 * URL: https://codeforces.com/problemset/problem/344/A
 */

import java.util.Scanner;

public class Magnets {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (sc.hasNext()) {
			int cont = 1;
			int n = sc.nextInt();
			int nT, ns, numeros;
			nT = sc.nextInt();
			
			for (int i = 0; i < n-1; i++) {
				numeros = 0;
				numeros = sc.nextInt();
				if (numeros != nT) {
					nT = numeros; 
					cont++;
				}
				
			}
			System.out.println(cont);			
			
		}

	}
}