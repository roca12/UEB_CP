package GPC;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/*
 * Autor: Juan Cabarcas 
 * Problema: 71A. Way too long words 
 * Juez online: codeforces 
 * Veredicto: A
 * URL: https://codeforces.com/problemset/problem/4/A
 */

public class Codeforces_Waytoolongwords {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		for (int i = 0; i < n; i++) {
			String wol = br.readLine();

			if (wol.length() > 10) {
				int m = wol.length() - 2;
				char s = wol.charAt(0);
				char e = wol.charAt(wol.length() - 1);

				System.out.println("" + s + m + e);
			} else {
				System.out.println(wol);
			}

		}
	}
}