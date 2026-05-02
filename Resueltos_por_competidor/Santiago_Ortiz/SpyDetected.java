import java.util.Scanner;

public class SpyDetected {
	
	/*
	 * Autor: Darkovski7   
	 * Problema: Spy Detected!
	 * Juez Online: Codeforces
	 * Veredicto: Accepted 
	 * Url: https://codeforces.com/problemset/problem/1512/A
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();

		for (int i = 0; i < t; i++) {
			int n = sc.nextInt();
			int[] a = new int[n];

			for (int j = 0; j < n; j++) {
				a[j] = sc.nextInt();
			}
			int temp1 = a[0];
			int temp2 = a[1];
			int temp3 = a[2];
			int real = 0;
			if (temp1 == temp2) {
				real = temp1;
			} else if (temp2 == temp3) {
				real = temp2;
			} else if (temp1 == temp3) {
				real = temp1;
			}

			for (int j = 0; j < n; j++) {
				if (a[j] != real) {
					System.out.println(j + 1);
				}
			}
		}
	}

}
