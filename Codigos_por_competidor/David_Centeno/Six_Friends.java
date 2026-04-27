package codechef;

import java.util.Scanner;

public class Six_Friends {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int x = sc.nextInt();
			int y = sc.nextInt();

			if ((x * 3) < (y * 2)) {
				System.out.println(x * 3);
			} else {
				System.out.println(y * 2);
			}
		}

	}

}
