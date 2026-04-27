package codechef;

import java.util.Scanner;

public class Best_coupon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = 0;
		int t = sc.nextInt();
		while (t-- > 0) {
			int x = sc.nextInt();
			a = x / 10;
			System.out.println((a < 100) ? a : 100);
		}

	}

}
