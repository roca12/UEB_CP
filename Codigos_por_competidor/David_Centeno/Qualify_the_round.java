package codechef;

import java.util.Scanner;

public class Qualify_the_round {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int d = 0;
		while (t-- > 0) {
			int x = sc.nextInt();
			int a = sc.nextInt();
			int b = sc.nextInt();
			d = a + (b * 2);
			if (d >= x) {
				System.out.println("Qualify");
			} else {
				System.out.println("NotQualify");
			}
		}
	}

}
