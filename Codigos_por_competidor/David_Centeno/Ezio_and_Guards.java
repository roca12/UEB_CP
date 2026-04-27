package codechef;

import java.util.Scanner;

public class Ezio_and_Guards {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			if (x >= y) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		}
	}

}
