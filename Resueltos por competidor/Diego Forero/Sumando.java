package CompDom;

import java.util.Scanner;

public class Sumando {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int res = 0;
		for (int i = 0; i < t; i++) {
			int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt(), d = sc.nextInt();
			res = a + b + c + d;
			System.out.println(res);
		}
	}
}
