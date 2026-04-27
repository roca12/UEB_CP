package codechef;

import java.util.Scanner;

public class Good_program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		double a = 0;
		while (t-- > 0) {
			float n = sc.nextInt();
			a = n / 4;
			if (a % 1 != 0) {
				System.out.println("Not Good");
			} else {
				System.out.println("Good");
			}
		}
	}

}
