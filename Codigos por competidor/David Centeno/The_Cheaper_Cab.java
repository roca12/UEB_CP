package codechef;

import java.util.Scanner;

public class The_Cheaper_Cab {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t=sc.nextInt();
		while (t-->0) {
			int x=sc.nextInt();
			int y=sc.nextInt();
			if (x==y) {
				System.out.println("Any");
			} else {
				if (x<y) {
					System.out.println("First");
			} else {
				System.out.println("Second");
			}
		}

	}
	}
}

