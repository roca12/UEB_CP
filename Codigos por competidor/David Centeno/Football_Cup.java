package codechef;

import java.util.Scanner;

public class Football_Cup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			if ((x > 0) && (y > 0) && (x == y)) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		}

	}

}
