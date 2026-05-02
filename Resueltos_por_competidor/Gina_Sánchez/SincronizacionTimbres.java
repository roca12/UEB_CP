/*
 * Autor: Gina Sofia Sánchez Estupiñan
 * Problema: Sincronización de timbres
 * Juez online: omegaUp
 * Veredicto: Accepted
 * URL: https://omegaup.com/arena/CB042026I/practice/#problems/sincronizacion-de-timbres
 */

import java.util.Scanner;

public class SincronizacionTimbres {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println(lcm(a, b));

	}
	
	public static int gcd(int a, int b) {
		return b == 0 ? a: gcd(b, a%b);
	}
	
	public static int lcm(int a, int b) {
		return a*(b/gcd(a,b));
				
	}

}