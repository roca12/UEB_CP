/*
 *  Autor: Jean Paul
 * Problema: A. Sieve of Erato67henes
 * Juez online: Polygon 
 * Veredicto: Accepted
 * URL: https://codeforces.com/problemset/problem/2195/A
 */

import java.util.Scanner;

public class MainSieve67 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int t = sc.nextInt();
		for(int i = 0; i < t; i++) {
			int n = sc.nextInt();
			int a = 0;
			boolean si67 = false;
			for(int j = 0; j < n; j++) {
				a = sc.nextInt();
				if(a == 67) {
					si67 = true;
				}
			}
			
			if(si67) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
	}
}