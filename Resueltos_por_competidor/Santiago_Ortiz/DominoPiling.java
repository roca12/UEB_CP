import java.util.Scanner;

public class DominoPiling {

	/*
	 * Autor: Darkovski7   
	 * Problema: Domino Piling
	 * Juez Online: Codeforces
	 * Veredicto: Accepted 
	 * Url: https://codeforces.com/problemset/problem/50/A
	 */
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int m = sc.nextInt();
		int n = sc.nextInt();

		int c = m * n;
		int res = c / 2;
		System.out.println(res);

	}

}
