package codechef;

import java.util.Scanner;

public class Bucket_Water_Flow {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t=sc.nextInt();
		int maxi=0;
		while (t-->0) {
			int ini=sc.nextInt();
			int max=sc.nextInt();
			int lh=sc.nextInt();
			int h=sc.nextInt();
			maxi=(lh*h)+ini;
			if (max==maxi) {
				System.out.println("Filled");
			} else {
				if (max>maxi) {
					System.out.println("Unfilled");
			} else {
				System.out.println("Overflow");
			}
		}
	}

	}

}
