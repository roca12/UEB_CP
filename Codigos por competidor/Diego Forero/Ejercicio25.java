package Comp3;

import java.util.Scanner;

public class Ejercicio25 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		for (int i = 0; i < t; i++) {
			int n = sc.nextInt();
			if (n%10 != 0) {
				System.out.println((n/10) + 1);
			} else {
				System.out.println(n/10);
			}
			
		}
		
	}

}
