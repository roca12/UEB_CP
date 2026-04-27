package Comp3;

import java.util.Scanner;

public class Ejercicio26 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		int o = sc.nextInt();
		int c = sc.nextInt();
		int runs = 36 * (20 - o);
		
		if ((runs + c) > r) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}

	}

}
