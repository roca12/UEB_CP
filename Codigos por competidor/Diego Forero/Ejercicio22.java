package Comp3;

import java.util.Scanner;

public class Ejercicio22 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		for (int i = 0; i < t; i++) {
			int n = sc.nextInt();
			int count = 0;
			for (int j = 0; j < n; j++) {
				int a = sc.nextInt();
				if (a >= 10 && a <= 60) {
					count++;
				}
			}
			System.out.println(count);
		}

	}

}
