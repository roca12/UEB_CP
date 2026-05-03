/*
 *  Autor: Jean Paul
 * Problema: A. The 67th Integer Problem
 * Juez online: Polygon 
 * Veredicto: AC
 * URL: https://codeforces.com/problemset/problem/1999/A
 */
import java.util.Scanner;

public class Main67 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int t = sc.nextInt();
		int x;
		for (int i = 0; i < t; i++) {
			x = sc.nextInt();
			
			if(x < 67) {
				System.out.println(x+1);
				
			}else {
				System.out.println(67);
			}
			
		}

	}
	

}