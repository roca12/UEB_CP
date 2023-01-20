package codechef;

import java.util.Scanner;

public class Hot_Or_Cold {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int c = sc.nextInt();
			if (c > 20) {
				System.out.println("Hot");
			} else {
				System.out.println("Cold");
			}
		}

	}

}
