

import java.util.Arrays;
import java.util.Scanner;

/*
 * Autor: Juan Andres Garcia
 * Problema: Your Name
 * Juez online: Codeforces
 * Veredicto: Accepted
 * Url: https://codeforces.com/problemset/problem/2167/B
 *  **/

public class YourName {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		
		StringBuilder salida = new StringBuilder();
		for(int i = 1; i <= t; i++) {
			int n = sc.nextInt();
			sc.nextLine();
			
			String a = sc.next();
			String b = sc.next();
			
			char[] acant = a.toCharArray();
			char[] bcant = b.toCharArray();
			
			Arrays.sort(acant);
			Arrays.sort(bcant);
			
			
			if( !Arrays.equals(acant, bcant) ) {
				salida.append("NO\n");
			} else {
				salida.append("YES\n");
			}
			
		}
		System.out.println(salida.toString());
	}
}
