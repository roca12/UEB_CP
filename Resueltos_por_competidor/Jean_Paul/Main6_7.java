/*
 *  Autor: Jean Paul
 * Problema: B. The 67th 6-7 Integer Problem
 * Juez online: Polygon 
 * Veredicto: AC
 * URL: https://codeforces.com/problemset/problem/2218/B
 */
import java.util.Arrays;
import java.util.Scanner;

public class Main6_7 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int t = sc.nextInt();
		for (int j = 0; j < t; j++) {

			int sixseven[] = new int[7];
			for (int i = 0; i < sixseven.length; i++) {
				sixseven[i] = sc.nextInt();
			}

			Arrays.sort(sixseven);
			int sum = 0;
			for (int i = 0; i < sixseven.length; i++) {
				if (i != 6)
					sum = sum -sixseven[i];
				else {
					sum += sixseven[i];
				}
			}

			System.out.println(sum);
		}
	}
	
}