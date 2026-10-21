/*
* Autor: pgms1103-afk
* Problema: A. Monocarp's Contest
* Juez Online: Codeforces
* Veredicto: Accepted
* URL: https://codeforces.com/problemset/problem/2260/A
* Difficult : 800
*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MonocarpsContest {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws NumberFormatException, IOException {

		int t = Integer.parseInt(br.readLine());
		for (int i = 0; i < t; i++) {
			String datos[] = br.readLine().split(" ");
			int n = Integer.parseInt(datos[0]);
			String datos2[] = br.readLine().split(" ");
			int array[] = new int[n];
			int contador0 = 0;
			for (int j = 0; j < n; j++) {
				array[j] = Integer.parseInt(datos2[j]);
				if (array[j] == 0) {
					contador0++;
				}
			}
			int primeraPosicion = array[0];
			int ultimaPosicion = array[n - 1];

			if (contador0 >= 2) {
				if (primeraPosicion == 0 && ultimaPosicion == 0) {
					System.out.println(0);
				} else if (primeraPosicion == 1 && ultimaPosicion == 1) {
					System.out.println(2);
				} else {
					System.out.println(1);
				}
			} else {
				System.out.println(-1);
			}
		}
	}

}