package codechef;

import java.util.Scanner;

public class Scalene_Triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			if (a != b && a != c && b != c && c < (a + b)) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		}
	}

}
