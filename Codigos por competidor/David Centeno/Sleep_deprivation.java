package codechef;

import java.util.Scanner;

public class Sleep_deprivation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		while (t-- > 0) {
			int x = sc.nextInt();
			if (x >= 7) {
				System.out.println("No");
			} else {
				System.out.println("Yes");
			}
		}

	}

}
