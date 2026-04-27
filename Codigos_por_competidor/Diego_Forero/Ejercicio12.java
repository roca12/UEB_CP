package Comp2;

import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		for (int i = 0; i < t; i++) {
			
			int n = sc.nextInt(), p = sc.nextInt(), x = sc.nextInt(), y = sc.nextInt();
			int res = 0;
			
			for (int j = 0; j < n; j++) {
				int a = sc.nextInt();
				if (j < p) {
					if (a == 1) {
						res = res + y;
					} else if (a == 0) {
						res = res + x;
					}
				}
			}
			System.out.println(res);
			
		}

	}

}
