package GPC;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Codeforces_Watermelon {
	
	/*
	 *  Autor: Juan Cabarcas
	 * Problema: A. Watermelon
	 * Juez online: Polygon 
	 * Veredicto: N/A (el juez del ejercicio no aparece con la verificacion)
	 * URL: https://codeforces.com/problemset/problem/4/A
	 */

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		if (n % 2 == 0) {
			System.out.println("Yes");
		} else if (n % 2 == 1) { 
			System.out.println("No");
		}

	}

}