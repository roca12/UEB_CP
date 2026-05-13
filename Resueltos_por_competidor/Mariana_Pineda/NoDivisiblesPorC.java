import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	/*
	 * Autor: mariana 
	 * Problema : No Divisibles por C
	 * Juez online: omegaUp 
	 * Veredicto: Accepted
	 * URL: https://omegaup.com/arena/problem/No-divisibles-por-C/#problems
	 */
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int t = Integer.parseInt(br.readLine());
		while (t-- > 0) {
			st = new StringTokenizer(br.readLine());
			long a = Long.parseLong(st.nextToken());
			long b = Long.parseLong(st.nextToken());
			long c = Long.parseLong(st.nextToken());
			long res = 0;
			if (b < a) {
				long aux = a;
				a = b;
				b = aux;
			}
			res = (b * (b + 1)) / 2;
			if (a == 1) {
				if (c <= b) {
					long d = b / c;
					for (long i = 0; i <= d; i++) {
						res -= i * c;
					}
				}
			} else {
				res -= ((a - 1) * (a)) / 2;
				if (c <= b) {
					long d = b / c;
					long e = (a - 1) / c + 1;
					for (long i = e; i <= d; i++) {
						res -= i * c;
					}
				}
			}
			System.out.println(res);

		}
	}
}
