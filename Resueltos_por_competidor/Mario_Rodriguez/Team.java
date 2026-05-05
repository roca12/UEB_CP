/*
 * Autor: Mario Rodríguez
 * Problema: Team
 * Juez online: CodeForces
 * Veredicto: Accepted
 * URL: https://codeforces.com/contest/231/problem/A
 */

import java.util.Scanner;

public class Team {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int count = 0;
		for (int i = 0; i < num; i++) {
			int p = sc.nextInt();
			int v = sc.nextInt();
			int t = sc.nextInt();
			if (p + v + t > 1) {
				count += 1;
			}
		}
		sc.close();
		System.out.println(count);
	}
}
