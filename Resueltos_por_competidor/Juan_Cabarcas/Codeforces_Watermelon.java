package GPC;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Codeforces_Watermelon {

	/*
	 * Autor: Juan Cabarcas 
	 * Problema: 4A. Watermelon 
	 * Juez online: codeforces 
	 * Veredicto: Accepted
	 * URL: https://codeforces.com/problemset/problem/4/A
	 */

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		if (n > 2 && n % 2 == 0) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

	}

}