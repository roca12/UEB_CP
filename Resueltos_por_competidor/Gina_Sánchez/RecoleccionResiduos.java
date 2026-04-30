/*
 * Autor: Gina Sofia Sánchez Estupiñan
 * Problema: Recolección de basura
 * Juez online: omegaUp
 * Veredicto: Accepted
 * URL: https://omegaup.com/arena/CB042026I/practice/#problems/recoleccion-de-basura
 */

import java.util.Scanner;

public class RecoleccionResiduos {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int min, b, total = 0;

		min = sc.nextInt();
		b = sc.nextInt();
		int[] w = new int[b];

		for (int i = 0; i < w.length; i++) {
			w[i] = sc.nextInt();
			total += w[i];
		}

		if (total >= min) {
			System.out.println(total);
			System.out.println("SALIR");
		} else if (total < min) {
			System.out.println(total);
			System.out.println("ESPERAR");
		}

	}
}
