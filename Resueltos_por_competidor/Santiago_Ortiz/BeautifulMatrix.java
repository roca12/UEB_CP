import java.util.Scanner;
import java.lang.Math;

public class BeautifulMatrix {

	/*
	 * Autor: Darkovski7   
	 * Problema: Beautiful Matrix
	 * Juez Online: Codeforces
	 * Veredicto: Accepted 
	 * Url: https://codeforces.com/problemset/problem/263/A
	 */
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[][] a = new int[5][5];
		int b = 0;
		int c = 0;

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				a[i][j] = sc.nextInt();
			}
		}
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (a[i][j] == 1) {
					b = Math.abs(i - 2);
					c = Math.abs(j - 2);
				}
			}
		}
		System.out.println(b + c);
	}

}
