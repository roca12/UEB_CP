import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	/*
	 * Autor: mariana 
	 * Problema : Cacahuates
	 * Juez online: omegaUp 
	 * Veredicto: Accepted
	 * URL: https://omegaup.com/arena/CB032026I/#problems/cacahuates
	 */
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int n = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		int[] num = new int[n];
		int cont = 0;
		int aux = 0;
		for (int i = 0; i < n; i++) {
			num[i] = Integer.parseInt(st.nextToken());
			if (cont < num[i]) {
				cont = num[i];
			}
		}
		for (int i = 0; i < n; i++) {
			if (num[i] == cont) {
				aux++;
			}
		}
		System.out.print(cont + " ");
		System.out.println(aux);
	}
}
