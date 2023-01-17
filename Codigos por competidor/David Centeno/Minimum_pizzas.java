package codechef;

import java.util.Scanner;

public class Minimum_pizzas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		double a = 0;
		int b = 0;
		while (t-- > 0) {
			float n = sc.nextFloat();
			a = n / 4;
			if (a % 1 != 0) {
				b = (int) a + 1;
				System.out.println(b);
			} else {
				b = (int) a;
				System.out.println(b);
			}
		}
	}

}
