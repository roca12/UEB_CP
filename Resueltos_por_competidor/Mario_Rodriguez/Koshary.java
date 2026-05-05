/*
 * Autor: Mario Rodríguez
 * Problema: Koshary
 * Juez online: CodeForces
 * Veredicto: Accepted
 * URL: https://codeforces.com/problemset/problem/2227/A
 */

import java.util.Scanner;

public class Koshary {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int c = sc.nextInt();
		while (c-- > 0) {

			int a = sc.nextInt(), b = sc.nextInt();

			System.out.println((a % 2 == 0 || b % 2 == 0) ? "YES" : "NO");

		}

		sc.close();
	}

}
