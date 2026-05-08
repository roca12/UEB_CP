/*
 * Autor: Gabriella Castro
 * Problema: Football
 * Juez online: Codeforces
 * Veredicto: Accepted
 * URL: https://codeforces.com/contest/96/problem/A
 */

import java.util.Scanner;

public class Football {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String jugadores = sc.next();

		if (jugadores.contains("0000000") || jugadores.contains("1111111")) {
			
			System.out.println("YES");
			
		} else {
			
			System.out.println("NO");
		}
	}
}
