/*
 *  Autor: Jean Paul
 * Problema: A. Watermelon
 * Juez online: Polygon 
 * Veredicto: Accepted
 * URL: https://codeforces.com/problemset/problem/4/A
 */


import java.util.Scanner;

public class MainWM {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int w = sc.nextInt();
		if (w % 2 == 0 && w > 2) {
				System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
}
