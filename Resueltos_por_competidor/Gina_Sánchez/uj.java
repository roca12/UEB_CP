/*
 * Autor: Gina Sofia Sánchez Estupiñan
 * Problema: Uncle Jack
 * Juez online: 
 * Veredicto: Accepted
 * URL: (Ejercicio CCPL Politécnico 2026)
 */

import java.math.BigInteger;
import java.util.Scanner;

public class uj {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		loop: while (sc.hasNext()) {
			BigInteger n = BigInteger.valueOf(sc.nextLong());
			int d = sc.nextInt();

			if (!n.equals(BigInteger.ZERO)) {
				BigInteger i = n.pow(d);
				System.out.println(i);
			} else if (n.equals(BigInteger.ZERO) && d == 0) {
				break loop;
			}
		}

	}

}