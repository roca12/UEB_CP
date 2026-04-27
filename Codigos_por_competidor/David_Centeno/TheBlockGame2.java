package codechef;

import java.util.Scanner;w

public class TheBlockGame2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t=sc.nextInt();
		while (t-->0) {
			int r, inv=0;
			int n=sc.nextInt();
			int a=n;
			while( n > 0 ) {
		         r = n % 10;
		         inv = inv * 10 + r;
		         n /= 10;
		      }
			
				if (inv==a) {
					System.out.println("Yes");
				} else {
					System.out.println("No");
				}	
		}
	}
}
