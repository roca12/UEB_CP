package codechef;

import java.util.Scanner;

public class Pass_The_Exam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			if ((a >= 10) && (b >= 10) && (c >= 10) && (a + b + c >= 100)) {
				System.out.println("Pass");
			} else {
				System.out.println("Fail");
			}
		}

	}

}
