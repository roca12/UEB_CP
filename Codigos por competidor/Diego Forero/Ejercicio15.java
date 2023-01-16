package Comp2;

import java.util.Scanner;

public class Ejercicio15 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		for (int i = 1; i <= t; i++) {
			int n = sc.nextInt();
			int c2 = 0;
			for (int j = 0; j < n; j++) {
				int c = sc.nextInt();
				if (c > c2) {
					c2 = c;
				}
			}
			System.out.println("Case " + i + ": " + c2);
		}

	}

}
