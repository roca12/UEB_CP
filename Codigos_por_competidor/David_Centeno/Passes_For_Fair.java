package codechef;

import java.util.Scanner;

public class Passes_For_Fair {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int k = sc.nextInt();
			if (k > n) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		}

	}

}
