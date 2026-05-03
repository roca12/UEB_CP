/*
 * Autor: DavsAlejp
 * Problema: Comparando número de galaxias
 * Juez online: omegaUp
 * Veredicto: Accepted
 * URL: https: https://omegaup.com/arena/problem/Comparando-numero-de-galaxias/
 */


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class NumeroGalaxias {
	
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException {
		
		String brx[] = br.readLine().split(" ");
		int a = Integer.parseInt(brx[0]) , b = Integer.parseInt(brx[1]),c = Integer.parseInt(brx[2]);
		
		if (a < b) {
			System.out.print("True ");
		} else {
			System.out.print("False ");
		}
		
		if (c > a) {
			System.out.print("True ");
		} else {
			System.out.print("False ");
		}
		
		if (a == b) {
			System.out.print("True ");
		} else {
			System.out.print("False ");
		}
		
		if (a != c) {
			System.out.print("True ");
		} else {
			System.out.print("False ");
		}
		
		if (c <= b) {
			System.out.print("True");
		} else {
			System.out.print("False");
		}
	}
}
