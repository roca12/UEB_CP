/**
 * Autor: Felipe Zambrano
 * Problema: Friendly Numbers
 * Juez online: 
 * Veredicto: Runtime Error
 * URL: https://codeforces.com/problemset/problem/2197/A
 */
import java.util.Scanner;

public class FriendlyNumbers {
	public static int sumaDigitos(int n) {
		int s = 0;
		while (n>0) {
			s+=n%10;
			n/=10;
		}
		return s;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int casos = sc.nextInt();
		while (casos-->0) {
			int x = sc.nextInt();
			
			for (int y = x + 1; y <= x + 90; y++) {
				if (y - sumaDigitos(y) == x)
					casos++;
			}
			System.out.println(casos);
		}
	}
}
