/*
 * Autor: Gabriella Castro
 * Problema: Soldier and Bananas
 * Juez online: Codeforces
 * Veredicto: Accepted
 * URL: https://codeforces.com/problemset/problem/546/A
 */

import java.util.Scanner;

public class SoldierAndBananas {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		long k = sc.nextLong();
		long n = sc.nextLong();
		long w = sc.nextLong();

		long costoTotal = k * (w * (w + 1) / 2);

		long prestado = costoTotal - n;

		if (prestado > 0) {
			System.out.println(prestado);
		} else {
			System.out.println(0);
		}
	}

}
