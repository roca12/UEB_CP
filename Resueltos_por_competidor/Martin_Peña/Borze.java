/*
* Autor: pgms1103-afk
* Problema: B - Borze
* Juez Online: Codeforces
* Veredicto: Accepted
* URL: https://codeforces.com/contest/32/problem/B
*/

import java.util.Scanner;

public class Borze {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		String borzeCode = sc.next();
		StringBuilder result = new StringBuilder();

		for (int i = 0; i < borzeCode.length(); i++) {
			char current = borzeCode.charAt(i);

			if (current == '.') {
				result.append("0");
			} else if (current == '-') {

				if (borzeCode.charAt(i + 1) == '.') {
					result.append("1");
				} else {
					result.append("2");
				}
				i++;
			}
		}

		System.out.println(result.toString());

	}
}