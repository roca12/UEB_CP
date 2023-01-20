package codechef;

import java.util.Scanner;

public class Rating_Improvement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t=sc.nextInt();
		while (t-->0) {
			int x=sc.nextInt();
			int y=sc.nextInt();
			int r=x-y;
			
			if (Math.abs(r)<=200) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		}

	}

}
