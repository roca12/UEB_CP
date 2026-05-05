/*
 * Autor: Mario Rodríguez
 * Problema: How Much Does Daytona Cost?
 * Juez online: CodeForces
 * Veredicto: Accepted
 * URL: https://codeforces.com/contest/1878/problem/A
 */

import java.util.Scanner;

public class How_Much_Does_Daytona_Cost {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();

		for (int i = 0; i < num; i++) {
			int n = sc.nextInt();
			int k = sc.nextInt();

			boolean found = false;
			for (int j = 0; j < n; j++) {
				int numa = sc.nextInt();
				if (numa == k) {
					found = true;
				}
			}
			if (found)
				System.out.println("YES");
			else
				System.out.println("NO");

		}
		sc.close();
	}
}
