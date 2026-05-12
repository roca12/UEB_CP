/*
 * Autor: natar2005
 * Problema: Bytelandian Gold Coins
 * Juez online: SPOJ
 * Veredicto: Accepted
 * URL: https://www.spoj.com/problems/COINS/
 */
import java.io.*;

public class BytelandianGoldCoins {

	// Defino el tamaño máximo de la memorizacion, para que no tenga que calcular
	// los valores otra vez

	static final int MAXMEMO = 1000000;

	// MNuestra memorizacion donde se guardan los valores pequeños ya calculados
	static long[] memorizacion = new long[MAXMEMO + 1];

	// Aplicamos programacion dinamica porque las monedas al dividirlas sus
	// divisiones se pueden seguir dividiendo (no es solo una vez)
	static long dp(long n) {

		// Caso base
		if (n == 0) {
			return 0;
		}

		// ver si el resultado ya lo tenemos en la memorizacion para no volverlo a
		// calcular
		if (n <= MAXMEMO && memorizacion[(int) n] != 0) {
			return memorizacion[(int) n];
		}
		// Cuando la moneda que obtenemos del cambio es la misma que la del inicio
		long IgualBytecoin = n;

		// Hacemos la ecuacion del cambio n/2, n/3 y n/4, pero se aplica dp a cada
		// division porque se pueden subdividir
		long cambioDolar = dp(n / 2) + dp(n / 3) + dp(n / 4);

		// Maximo entre dejar la misma moneda o la division
		long maxCambio = Math.max(IgualBytecoin, cambioDolar);

		// Mandamos el resultado para memorizacion
		if (n <= MAXMEMO) {
			memorizacion[(int) n] = maxCambio;
		}
		return maxCambio;
	}

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String input;

		while ((input = br.readLine()) != null) {

			long n = Long.parseLong(input);

			System.out.println(dp(n));
		}
	}
}