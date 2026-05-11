import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	/*
	 * Autor: mariana 
	 * Problema : Recurriendo a la Sana Distancia
	 * Juez online: omegaUp 
	 * Veredicto: Accepted
	 * URL: https://omegaup.com/arena/problem/Recurriendo-a-la-distancia/#problems
	 */
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long n = Long.parseLong(br.readLine().trim());
		long a = 1L;
		long total = 1L;
		for (long i = n; i > 0; i--) {
			a = (a * i) & 0xFFFFFFFFL;
			total = (total + a) & 0xFFFFFFFFL;
		}
		System.out.println(total);
	}
}
