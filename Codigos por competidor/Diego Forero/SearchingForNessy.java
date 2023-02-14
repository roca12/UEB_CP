package CompDom;

import java.util.Scanner;

public class SearchingForNessy {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int i = 0; i < t; i++) {
			int m = sc.nextInt();
			int n = sc.nextInt();
			int res = (m/3) * (n/3);
			System.out.println(res);
		}
	}

}
