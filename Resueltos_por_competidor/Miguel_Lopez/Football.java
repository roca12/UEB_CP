/*
 * Autor: Miguel Lopez
 * Problema: Football
 * Juez online: Codeforces
 * Veredicto: Accepted 
 * URL: https://codeforces.com/contest/96/problem/A
 */

package Codeforces;
import java.util.Scanner;

public class Football {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String binarios = sc.next();
		int cont = 0;
			if(binarios.contains("0000000") || binarios.contains("1111111")) {
				System.out.println("YES");
			}
			else {
				System.out.println("NO");
			}
		
	}
	
}
