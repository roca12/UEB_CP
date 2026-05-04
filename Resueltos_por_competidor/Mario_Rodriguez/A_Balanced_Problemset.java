/*
 * Autor: Mario Rodríguez
 * Problema: A Balanced Problemset?
 * Juez online: CodeForces
 * Veredicto: Accepted
 * URL: https://codeforces.com/contest/1925/problem/B
 */

import java.util.Scanner;

public class A_Balanced_Problemset {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		for (int i = 0; i < num; i++) {
			int x = sc.nextInt();
			int n = sc.nextInt();
			int out = 1;

			for (int j = 1; j * j <= x; j++) {

				if (x % j == 0) {

					if (n <= x / j) {
						out = Math.max(out, j);
					}
					if (n <= j) {
						out = Math.max(out, x / j);
					}

				}
			}
			System.out.println(out);
		}
		sc.close();
	}
}
