/*
 * Autor: Gina Sofia Sánchez Estupiñan
 * Problema: A - The 67th Integer Problem
 * Juez online: Codeforces
 * Veredicto: Accepted
 * URL: https://codeforces.com/contest/2218/problem/A
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int t = Integer.parseInt(br.readLine());
		int n;

		for (int i = 0; i < t; i++) {
			n = 0;
			n = Integer.parseInt(br.readLine());
			if (n < 67) {
				System.out.println((n + 1));
			} else {
				System.out.println("67");
			}

		}

	}
}