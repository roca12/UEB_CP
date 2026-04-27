package codechef;

import java.util.Scanner;

public class Subscriptions {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t=sc.nextInt();
		while (t-->0) {
			float n=sc.nextFloat();
			int x=sc.nextInt();
			if (n<6) {
				System.out.println(x);
			} else {
				float a=(n/6);
				float b=Math.round(a);
				int c=(int) ((int) b*x);
				System.out.println(c);
			}  	
		}

		
	}

}
