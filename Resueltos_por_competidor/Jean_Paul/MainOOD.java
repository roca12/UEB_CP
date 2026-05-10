/*
 *  Autor: Jean Paul
 * Problema: A. Only One Digit
 * Juez online: Polygon 
 * Veredicto: Accepted
 * URL: https://codeforces.com/problemset/problem/2126/A
 */

import java.util.Arrays;
import java.util.Scanner;

public class MainOOD {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		int t = sc.nextInt();
		for(int i = 0; i < t; i++) {
			int a = sc.nextInt();
			char ai[] = new char[String.valueOf(a).length()];
			for(int j = 0; j < ai.length; j++) {
				ai[j] = String.valueOf(a).charAt(j);
			}
			Arrays.sort(ai);
			System.out.println(ai[0]);
		}
	}
}