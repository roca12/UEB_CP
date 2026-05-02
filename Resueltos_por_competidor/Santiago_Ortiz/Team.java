import java.util.Scanner;

public class Team {
	
	/*
	 * Autor: Darkovski7   
	 * Problema: Team
	 * Juez Online: Codeforces
	 * Veredicto: Accepted 
	 * Url: https://codeforces.com/problemset/problem/231/A
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int resueltos = 0;

		for (int i = 0; i < n; i++) {
			int p = sc.nextInt();
			int v = sc.nextInt();
			int t = sc.nextInt();
			
			if ((p + v + t) >= 2) {
				resueltos++;
			}
		}
		System.out.println(resueltos);
	}
}
