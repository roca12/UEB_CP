/*
 * Autor: Mario Rodríguez
 * Problema: Petya and Strings
 * Juez online: CodeForces
 * Veredicto: Accepted
 * URL: https://codeforces.com/contest/112/problem/A
 */

import java.util.Scanner;

public class Petya_and_Strings {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String one = sc.nextLine();
		String two = sc.nextLine();

		one = one.toLowerCase();
		two = two.toLowerCase();

		for (int i = 0; i < one.length(); i++) {
			char chr1 = one.charAt(i);
			char chr2 = two.charAt(i);

			if (chr1 < chr2) {
				System.out.println(-1);
				sc.close();
				return;
			} else if (chr1 > chr2) {
				System.out.println(1);
				sc.close();
				return;
			}
		}

		System.out.println(0);
		sc.close();
	}
}
