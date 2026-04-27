package Comp2;

import java.util.Scanner;

public class Ejercicio14 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int c = 0;

		while (sc.hasNext()) {
			int a = sc.nextInt(), l = sc.nextInt();
			int a2 = a;
			int i = 0;
			boolean cond = a > 0 && l > 0;

			while (cond) {

				while (a != 1 && a < l) {

					if (a % 2 == 0) {
						a = a / 2;
					} else if (a % 2 != 0) {
						a = 3 * a + 1;
					}
					i++;
					continue;
					
				}
				c++;
				break;
				
			}
			
			if (a < l && cond == true) {
				System.out.println("Case " + c + ": A = " + a2 + ", limit = " + l + ", number of terms = " + (i+1));
			} else if (cond == true) {
				System.out.println("Case " + c + ": A = " + a2 + ", limit = " + l + ", number of terms = " + (i));
			}
			
		}

	}

}
