package Comp2;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		for (int i = 0; i < t; i++) {
			
			int a = sc.nextInt(), b = sc.nextInt(), a1 = sc.nextInt(), b1 = sc.nextInt(), a2 = sc.nextInt(), b2 = sc.nextInt();		
			
			if (a*b == a1*b1) {
				System.out.println(1);
			} else if (a*b == a2*b2) {
				System.out.println(2);
			} else {
				System.out.println(0);
			}
			
		}

	}

}
