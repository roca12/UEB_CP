package codechef;

import java.util.Scanner;

public class Chef_Chocolates {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t=sc.nextInt();
		int a=0;
		while (t-->0) {
			int c=sc.nextInt();
			int x=sc.nextInt();
			int y=sc.nextInt();
			a=c-x;
			System.out.println(a*y);
		}

	}

}
