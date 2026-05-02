/*
 * Autor: Gina Sofia Sánchez Estupiñan
 * Problema: Boy or Girl
 * Juez online: Codeforces
 * Veredicto: Accepted
 * URL: https://codeforces.com/problemset/problem/236/A
 */

import java.util.Scanner;

public class BoyOrGirl {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (sc.hasNext()) {
			String p = "";
			String pf = "";
			p = sc.nextLine();

			for (int i = 0; i < p.length(); i++) {
				char c = p.charAt(i);
				String pc = "";
				pc += c;
				if (!pf.contains(pc)) {
					pf += pc;
				}
			}

			if (pf.length() % 2 == 0) {
				System.out.println("CHAT WITH HER!");
			} else {
				System.out.println("IGNORE HIM!");
			}
		}
	}

}
