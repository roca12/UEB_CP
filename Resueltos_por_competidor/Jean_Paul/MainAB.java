/**
 * Autor: Jean Paul
 * Problema: A. A+B Again?
 * Juez online: Polygon 
 * Veredicto: AC
 * URL: https://codeforces.com/problemset/problem/2218/A
 */
import java.util.Scanner;

public class MainAB {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int t = sc.nextInt();
		int n;
		int n1, n2;
		for (int i = 0; i < t; i++) {
			n = sc.nextInt();
			n1 = n/10;
			n2 = n - (n1*10);
			System.out.println(n1+n2);
		}
	}
}