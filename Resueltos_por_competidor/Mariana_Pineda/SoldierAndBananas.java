import java.util.Scanner;

public class Main {
	/*
	 * Autor: mariana 
	 * Problema : Soldier and Bananas 
	 * Juez online: codeforces
	 * Veredicto: Accepted 
	 * URL: hhttps://codeforces.com/contest/546/problem/A
	 */
		
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		int n = sc.nextInt();
		int w = sc.nextInt();
		int total = 0;
		total = k * ((w * (w + 1)) / 2);
		if (total - n < 0) {
			System.out.println(0);
		} else {
			System.out.println(total - n);
		}
	}
}
