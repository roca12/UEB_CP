import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	/*
	 * Autor: mariana 
	 * Problema : Flores
	 * Juez online: omegaUp 
	 * Veredicto: Accepted
	 * URL: https://omegaup.com/arena/CB032026I/practice/#problems/flores
	 */
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int d = Integer.parseInt(st.nextToken());

		int[] c = new int[d + 2];

		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());

			c[a] += 1;
			if (b + 1 <= d) {
				c[b + 1] -= 1;
			}
		}

		int max = 0;
		int actual = 0;

		for (int dia = 1; dia <= d; dia++) {
			actual += c[dia];
			max = Math.max(max, actual);
		}

		System.out.println(max);
	}

}
