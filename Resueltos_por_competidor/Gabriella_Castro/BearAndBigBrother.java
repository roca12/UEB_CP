/*
 * Autor: Gabriella Castro
 * Problema: Bear and Big Brother
 * Juez online: Codeforces
 * Veredicto: Accepted
 * URL: https://codeforces.com/problemset/problem/791/A
 */

import java.util.Scanner;

public class BearAndBigBrother {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int limak = sc.nextInt();
		int bob = sc.nextInt();
		int anios = 0;
		
		while (limak <= bob) {
			
			limak *= 3;
			bob *= 2;
			anios++;
			
		}
		
		System.out.println(anios);
		
	}

}
