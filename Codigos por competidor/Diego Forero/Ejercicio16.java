package Comp3;

import java.util.Scanner;

public class Ejercicio16 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		for (int i = 0; i < t; i++) {
			
			int k = sc.nextInt();
			int x = sc.nextInt();
			int res = k-x;
			System.out.println(res);
			
		}

	}

}
