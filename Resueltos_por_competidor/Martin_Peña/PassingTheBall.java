/*
* Autor: pgms1103-afk
* Problema: Passing the Ball
* Juez Online: Codeforces
* Veredicto: Accepted
* URL: https://codeforces.com/problemset/problem/2204/A
*/

import java.util.Scanner;

public class PassingTheBall {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		int T = sc.nextInt();

		for (int i = 0; i < T; i++) {

			int j = 0;
			int n = sc.nextInt();
			boolean toco[] = new boolean[n];
			String s = sc.next();
			int repetido = 0;

			while (repetido <= n) {
				toco[j] = true;
				if (repetido == n)
					break;

				if (s.charAt(j) == 'R') {
					j++;
				} else {
					j--;
				}
				repetido++;
			}

			int contador = 0;
			for (int k = 0; k < n; k++) {
				if (toco[k]) {
					contador++;
				}
			}
			System.out.println(contador);

		}

	}

}
