import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	/*
	 * Autor: mariana 
	 * Problema : Minimo Comun Multiplo de Varios Enteros
	 * Juez online: omegaUp 
	 * Veredicto: Accepted
	 * URL: https://omegaup.com/arena/problem/Minimo-comun-multiplo-de-varios-/
	 */
	public static int gcd(int a, int b) {
		return b == 0 ? a : gcd(b, a % b);
	}

	public static int mcm(int a, int b) {
		return a * (b / gcd(a, b));
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int n = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		for (int i = 1; i < n; i++) {
			int b = Integer.parseInt(st.nextToken());
			a = mcm(a, b);

		}
		System.out.println(a);
	}
}
