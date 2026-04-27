package CompSolitario;

import java.util.Scanner;

public class Brush {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int i = 0; i < t; i++) {
			sc.nextLine();
			int n = sc.nextInt();
			int sum = 0;
			for (int j = 0; j < n; j++) {
				int num = sc.nextInt();
				sum += num;
				if (num < 0) {
					sum = 0;
					break;
				}
			}
			System.out.println("Case " + (i+1) + ": " + sum);
		}
	}

}
