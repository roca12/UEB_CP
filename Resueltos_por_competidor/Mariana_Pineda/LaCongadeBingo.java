import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	/*
	 * Autor: mariana 
	 * Problema : La Conga de Bingo 
	 * Juez online: omegaUp 
	 * Veredicto: Accepted 
	 * URL: https:https://omegaup.com/arena/problem/La-Conga-de-Bingo/
	 */
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int n = Integer.parseInt(br.readLine());
		int[][] corgi = new int[n][3];
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			corgi[i][0] = Integer.parseInt(st.nextToken());
			corgi[i][1] = Integer.parseInt(st.nextToken());
			corgi[i][2] = Integer.parseInt(st.nextToken());
		}
		for (int i = 0; i < n; i++) {
			int aux = i;
			for (int j = i + 1; j < n; j++) {
				if (corgi[j][0] < corgi[aux][0] || (corgi[j][0] == corgi[aux][0] && corgi[j][1] < corgi[aux][1])
						|| (corgi[j][0] == corgi[aux][0] && corgi[j][1] == corgi[aux][1]
								&& corgi[j][2] < corgi[aux][2])) {
					aux = j;
				}

			}
			int[] temp = corgi[i];
			corgi[i] = corgi[aux];
			corgi[aux] = temp;
		}

		int[] a = new int[n];
		int aux = 1;
		for (int i = 0; i < n; i++) {
			a[i] = 1;
			for (int j = 0; j < i; j++) {
				if (corgi[j][0] < corgi[i][0] && corgi[j][1] < corgi[i][1] && corgi[j][2] < corgi[i][2]) {

					if (a[j] + 1 > a[i]) {
						a[i] = a[j] + 1;
					}
				}
			}
			if (a[i] > aux)
				aux = a[i];
		}
		System.out.println(aux);
	}
}
