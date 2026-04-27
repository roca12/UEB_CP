package Comp2;

import java.util.Scanner;

public class Ejercicio13 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNext()) {
			int v = sc.nextInt(), t = sc.nextInt();
			int x = (v * t * 2);
			System.out.println(x);
		}
		
	}

}
