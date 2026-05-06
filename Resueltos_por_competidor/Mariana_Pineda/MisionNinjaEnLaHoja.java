import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	/*
	 * Autor: mariana 
	 * Problema : Mision Ninja En La Hoja
	 * Juez online: omegaUp 
	 * Veredicto: Accepted
	 * URL: https://omegaup.com/arena/CB032026I/#problems/Mision-Ninja-en-la-Hoja
	 */
	static int pago(int rango, int dificultad) {
		if (rango == 1 && dificultad <= 2)
			return rango * dificultad;
		if (rango == 2 && dificultad <= 3)
			return rango * dificultad;
		if (rango == 3)
			return rango * dificultad;
		return 0;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		st = new StringTokenizer(br.readLine());
		int[] r = new int[3];
		int[] d = new int[3];
		int[][] perm = { { 0, 1, 2 }, { 0, 2, 1 }, { 1, 0, 2 }, { 1, 2, 0 }, { 2, 0, 1 }, { 2, 1, 0 } };
		int max = 0;
		r[0] = Integer.parseInt(st.nextToken());
		r[1] = Integer.parseInt(st.nextToken());
		r[2] = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		d[0] = Integer.parseInt(st.nextToken());
		d[1] = Integer.parseInt(st.nextToken());
		d[2] = Integer.parseInt(st.nextToken());
		for (int i = 0; i < 6; i++) {
			int suma = 0;
			for (int j = 0; j < 3; j++) {
				suma += pago(r[j], d[perm[i][j]]);
			}
			max = Math.max(max, suma);
		}

		System.out.println(max);
	}
}
