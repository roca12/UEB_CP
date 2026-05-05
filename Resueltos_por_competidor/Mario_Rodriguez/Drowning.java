import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;


/*
 * Autor: Mario Rodríguez
 * Problema: Drowning
 * Juez online: CodeForces
 * Veredicto: Accepted
 * URL: https://codeforces.com/problemset/problem/2227/G
 */

public class Drowning {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int caso = Integer.parseInt(st.nextToken());

		while (caso-- > 0) {

			st = new StringTokenizer(br.readLine());
			int tamanio = Integer.parseInt(st.nextToken()) + 1;

			long[] arraysito = new long[tamanio];
			st = new StringTokenizer(br.readLine());

			for (int i = 1; i < tamanio; i++) {
				arraysito[i] = Long.parseLong(st.nextToken());
			}

			int parPos = 0, imparPos = 0;
			int par = ((tamanio - 1) / 2) + 1;
			int impar = (tamanio / 2);

			long[] parsito = new long[par];
			long[] imparsito = new long[impar];

			parsito[parPos++] = 0;
			long actual = 0;

			for (int i = 1; i < tamanio; i++) {

				if (i % 2 == 1) {
					actual += arraysito[i];
					imparsito[imparPos++] = actual;
				} else {
					actual -= arraysito[i];
					parsito[parPos++] = actual;
				}

			}

			Arrays.sort(parsito);
			Arrays.sort(imparsito);

			long fin = 0;
			int tempo = 0;

			for (int i = 0; i < par; i++) {

				while (tempo < impar && imparsito[tempo] <= parsito[i]) {
					tempo++;
				}

				fin += (impar - tempo);
			}
			System.out.println(fin);

		}
		br.close();
	}

}
