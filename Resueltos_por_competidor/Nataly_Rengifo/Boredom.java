
/*
 * Autor: natar2005
 * Problema: Boredom 
 * Juez online: Codeforces
 * Veredicto: Accepted
 * URL: https://codeforces.com/contest/455/problem/A
 */
import java.util.Scanner;

public class Boredom {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		// definimos el tamaño el arreglo hasta donde pueden ir los numeros
		int[] frecRepetidos = new int[100001];

		// Sabemos cuantas veces sale un numero en nuestra secuencia
		for (int i = 0; i < n; i++) {
			int nTemp = sc.nextInt();
			frecRepetidos[nTemp]++;
		}

		// Con este dp hallamos la máxima puntuación que podemos tener con numeros del
		// 1-i
		long[] dp = new long[100001];
		// Caso base, ya que si tenemo solo el
		// uno disponible, lo qu ehariamos seria multiplicarlo por las veces que esta
		// repetido en la secuencia
		dp[1] = frecRepetidos[1];

		for (int i = 2; i <= 100000; i++) {
			// en el resto denumeros dispoibles evaluamos si
			// lo eliminamos: ocurre esto dp[i-2] + i * frecRepetidos[i] para ganar, ya que
			// cada vez que elegmos un un número i, ganamos i * frecRepetidos[i],pero,
			// cuando lo
			// elegimos todos los números i-1 y i+1 se eliminan, entonces se
			// pueden elegir numeros como i-2 y menores a este, por esto la mejor puntuación
			// que podemos sumar de números anteriores es hasta i-2
			// lo ignoramos, no ganariamos puntos por i, por ende no eliminamos ningún num y
			// la puntuacion max hasta i es igual a la max hasta i-1
			//Y el objetivo de todo es hallar el maximo entre estos dos casos
			dp[i] = Math.max(dp[i - 1], dp[i - 2] + (long) i * frecRepetidos[i]);
		}

		System.out.println(dp[100000]);

	}
}