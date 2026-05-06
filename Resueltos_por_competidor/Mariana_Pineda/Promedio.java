import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	/*
	 * Autor: mariana 
	 * Problema : Promedio
	 * Juez online: omegaUp 
	 * Veredicto: Accepted
	 * URL: https://omegaup.com/arena/problem/Promedio-GCF/
	 */
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int n = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		int total = 0;
		double promedio = 0;
		for (int i = 0; i < n; i++) {
			total = Integer.parseInt(st.nextToken());
			promedio += total;
		}
		promedio = promedio / n;
		System.out.println(promedio);
	}
}
