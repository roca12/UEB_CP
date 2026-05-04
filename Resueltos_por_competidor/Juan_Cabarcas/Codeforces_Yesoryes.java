package GPC;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * Autor: Juan Cabarcas 
 * Problema: 1703A. YES OR YES
 * Juez online: codeforces 
 * Veredicto: Accepted
 * URL: https://codeforces.com/problemset/problem/1703/A
 */

public class Codeforces_Yesoryes {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		for (int i = 0; i < n; i++) {
			String s = br.readLine().toLowerCase();
			if (s.equals("yes")) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
	} 
}
