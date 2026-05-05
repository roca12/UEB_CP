package GPC;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * Autor: Juan Cabarcas 
 * Problema: 231A. Team
 * Juez online: codeforces 
 * Veredicto: Accepted
 * URL: https://codeforces.com/problemset/problem/231/A
 */


public class Codeforces_Team {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		int cont = 0;

		for (int i = 0; i < n; i++) {
			String s = br.readLine();
			if (s.equals("1 1 0") || s.equals("1 1 1") || s.equals("0 1 1") || s.equals("1 0 1")) {
				cont++;
			}
		}
		System.out.println(cont);
	}

}
