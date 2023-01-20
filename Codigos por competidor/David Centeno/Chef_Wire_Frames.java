package codechef;

import java.util.Scanner;

public class Chef_Wire_Frames {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t=sc.nextInt();
		while (t-->0) {
			int n=sc.nextInt();
			int m=sc.nextInt();
			int x=sc.nextInt();
			int p=((n*2+m*2)*x);
			System.out.println(p);
		}

	}

}
