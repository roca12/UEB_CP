package codechef;

import java.util.Scanner;

public class Chef_And_Masks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			int a = x * 100;
			int b = y * 10;

			if (a == b) {
				System.out.println("Cloth");
			} else {
				if (b > a) {
					System.out.println("Disposable");
				} else {
					System.out.println("Cloth");
				}
			}
		}
	}

}
