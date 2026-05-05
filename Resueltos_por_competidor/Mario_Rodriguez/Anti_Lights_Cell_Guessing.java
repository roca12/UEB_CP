/*
 * Autor: Mario Rodríguez
 * Problema: Anti Light's Cell Guessing
 * Juez online: CodeForces
 * Veredicto: Accepted
 * URL: https://codeforces.com/contest/1610/problem/A
 */

import java.util.Scanner;

public class Anti_Lights_Cell_Guessing {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();

		for (int i = 0; i < num; i++) {
			int n = sc.nextInt();
			int m = sc.nextInt();

			if (n == 1 && m == 1) {
				System.out.println(0);
			} else if (n == 1 || m == 1) {
				System.out.println(1);
			} else {
				System.out.println(2);
			}
		}
		sc.close();
	}
}
