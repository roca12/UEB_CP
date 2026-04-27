package Comp2;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		for (int j = 0; j < t; j++) {
			int n = sc.nextInt(), k = sc.nextInt();
			String res = "";
			
			for (int i = 0; i < n; i++) {
				int a = sc.nextInt();
				if (a <= k) {
					k = k - a;
					res = res + "1";
				} else if (a > k) {
					res = res + "0";
				}
			}
			System.out.println(res);
		}

	}

}
