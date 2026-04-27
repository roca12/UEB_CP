package codechef;

import java.util.Scanner;

public class Discount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		float d = 0;
		while (t-- > 0) {
			float x = sc.nextInt();
			d = x / 100;
			System.out.println(100 - (100 * d));
		}

	}

}
