import java.util.Arrays;
import java.util.Scanner;

public class Main {
	/*
	 * Autor: mariana 
	 * Problema : Soldier and Badges 
	 * Juez online: codeforces
	 * Veredicto: Accepted
	 * URL: https://codeforces.com/contest/546/problem/B
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] numeritos = new int[n];

		for (int i = 0; i < n; i++) {
			numeritos[i] = sc.nextInt();
		}

		Arrays.sort(numeritos);

		long cont = 0;
		for (int i = 0; i < n - 1; i++) {
			if (numeritos[i + 1] <= numeritos[i]) {
				int aux = numeritos[i] + 1;
				cont += aux - numeritos[i + 1];
				numeritos[i + 1] = aux;
			}
		}

		System.out.println(cont);
	}
}
