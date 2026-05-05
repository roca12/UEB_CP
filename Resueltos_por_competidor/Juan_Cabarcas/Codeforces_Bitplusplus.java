package GPC;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * Autor: Juan Cabarcas 
 * Problema: 282A. Bit++
 * Juez online: codeforces 
 * Veredicto: Accepted
 * URL: https://codeforces.com/problemset/problem/282/A
 */

public class Codeforces_Bitplusplus {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		int x = 0;

		for (int i = 0; i < n; i++) {
			String s = br.readLine();

			if (s.equals("X--") || s.equals("--X")) {
				x--;
			}
			if (s.equals("X++") || s.equals("++X")) {
				x++;
			}
		}
		System.out.println(x);

	}

}
