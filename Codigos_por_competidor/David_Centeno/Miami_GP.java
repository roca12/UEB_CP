package codechef;

import java.util.Scanner;

public class Miami_GP {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t=sc.nextInt();
		float comp=0;
		while (t-->0) {
			int x=sc.nextInt();
			int y=sc.nextInt();
			comp=(float) (x*1.07);
			if (y<=comp) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		}

	}

}
