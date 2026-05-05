
/*
 * Autor: Mario Rodríguez
 * Problema: A Number Between Two Others
 * Juez online: CodeForces
 * Veredicto: Accepted
 * URL: https://codeforces.com/problemset/problem/2225/A
 */

import java.util.Scanner;

public class A_Number_Between_Two_Others {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int c = sc.nextInt();

		while (c-- > 0) {
			long x = sc.nextLong(), y = sc.nextLong();

			System.out.println((y > 2 * x) ? "YES" : "NO");

		}

		sc.close();

	}

}
