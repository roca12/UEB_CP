package CompDom;

import java.util.Scanner;

public class BigChocolate {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int m = sc.nextInt(), n = sc.nextInt();
			int res = (m*n) - 1;
			System.out.println(res);
		}
	}
}
