import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	/*
	 * Autor: mariana 
	 * Problema : El problema de la mochila(discreta)
	 * Juez online: omegaUp 
	 * Veredicto: 70%
	 * URL: https://omegaup.com/arena/problem/El-problema-de-la-mochila-d/
	 */
	static int max(int a, int b) {
		return (a > b) ? a : b;
	}

	static int knapsack(int a, int wt[], int val[], int n) {
		int i, w;
		int k[][] = new int[n + 1][a + 1];
		for (i = 0; i <= n; i++) {
			for (w = 0; w <= a; w++) {
				if (i == 0 || w == 0) {
					k[i][w] = 0;
				} else if (wt[i - 1] <= w) {
					k[i][w] = max(val[i - 1] + k[i - 1][w - wt[i - 1]], k[i - 1][w]);
				} else {
					k[i][w] = k[i - 1][w];
				}
			}
		}
		return k[n][a];
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int n = Integer.parseInt(br.readLine());
		int c = Integer.parseInt(br.readLine());
		int[] valores = new int[n];
		int[] pesos = new int[n];
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			pesos[i] = Integer.parseInt(st.nextToken());
			valores[i] = Integer.parseInt(st.nextToken());
		}
		System.out.println(knapsack(c, pesos, valores, n));
	}
}
