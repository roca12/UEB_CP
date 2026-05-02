/*
 * Autor: Gina Sofia Sánchez Estupiñan
 * Problema: Way Too Long Words
 * Juez online: Codeforces
 * Veredicto: Accepted
 * URL: https://codeforces.com/problemset/problem/71/A
 */

import java.util.Scanner;

public class WayTooLongWords {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();
		int l = 0;
		sc.nextLine();
		for (int i = 0; i < t; i++) {
			String p = "";
			p = sc.nextLine();
			l = p.length();

			if (l > 10) {
				System.out.println(p.charAt(0) + "" + (p.length() - 2) + "" + p.charAt(p.length() - 1));
			} else {
				System.out.println(p);
			}
		}

	}
}
