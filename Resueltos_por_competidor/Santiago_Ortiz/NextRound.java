import java.util.Scanner;

public class NextRound {

	/*
	 * Autor: Darkovski7   
	 * Problema: NextRound
	 * Juez Online: Codeforces
	 * Veredicto: Accepted 
	 * Url: https://codeforces.com/problemset/problem/158/A
	 */
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] puntos = new int[n];
		int contadorpasan = 0;

		for (int i = 0; i < n; i++) {
			puntos[i] = sc.nextInt();
		}

		int corte = puntos[k - 1];

		for (int i = 0; i < n; i++) {
			if (puntos[i] >= corte && puntos[i] > 0) {
				contadorpasan++;
			}
		}
		System.out.println(contadorpasan);
	}

}
