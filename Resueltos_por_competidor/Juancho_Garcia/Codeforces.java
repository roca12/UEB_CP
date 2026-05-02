package ejercicios;

/*
 * Autor: Juan Andres Garcia
 * Problema: Codeforces Checking
 * Juez online: Codeforces
 * Veredicto: Accepted
 * Url: https://codeforces.com/problemset/problem/1791/A
 *  **/

import java.util.Scanner;

public class Codeforces {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();
		StringBuilder salida = new StringBuilder();
		for (int i = 1; i <= t; i++) {

			char c = sc.next().charAt(0);

			if (c == 'c' || c == 'o' || c == 'd' || c == 'e' || c == 'f' || c == 'r' || c == 's') {
				salida.append("YES\n");
			} else {
				salida.append("NO\n");
			}
		}
		
		System.out.println(salida.toString());
	}

}
