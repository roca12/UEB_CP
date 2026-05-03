/**
	 * Autor: Jean Paul
	 * Problema: A. Square?
	 * Juez online: Polygon 
	 * Veredicto: Accepted
	 * URL: https://codeforces.com/problemset/problem/2167/A
	 */
import java.util.Scanner;

public class MainSquare {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int t = sc.nextInt();
		int a, b, c, d;
		for(int i = 0; i < t; i++) {
			a = sc.nextInt();
			b = sc.nextInt();
			c = sc.nextInt();
			d = sc.nextInt();
			if(a == b && b == c && c == d) {
				System.out.println("YES");
			}
			
			else {
				System.out.println("NO");
			}
		}
	}
}
