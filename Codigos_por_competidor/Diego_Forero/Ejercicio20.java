package Comp3;

import java.util.Scanner;

public class Ejercicio20 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		for (int i = 0; i < t; i++) {
			int c = sc.nextInt();
			int x = sc.nextInt();
			int y = sc.nextInt();
			int cf = c - x;
			int rup = cf*y;
			System.out.println(rup);
			
		}

	}

}
