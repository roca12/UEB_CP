import java.util.Arrays;
import java.util.Scanner;

public class Main {
  /*
	 * Autor: mariana 
	 * Problema : Soldier and Badges
	 * Juez online: codeforces
	 * Veredicto: Wrong answer on test 10
	 * URL: https://codeforces.com/contest/546/problem/B
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] numeritos = new int[n];
		for (int i = 0; i < n; i++) {
			numeritos[i] = sc.nextInt();
		}
		Arrays.sort(numeritos);
		int cont = 0;
		for (int i = 0; i < numeritos.length; i++) {
			if (i < n - 1) {
				if (numeritos[i] < numeritos[i + 1]) {
					continue;
				} else {
					numeritos[i + 1]++;
					cont++;
				}
			} else {
				break;
			}
		}
		System.out.println(cont);
	}
}
