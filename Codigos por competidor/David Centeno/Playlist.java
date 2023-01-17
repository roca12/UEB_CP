package codechef;

import java.util.Scanner;

public class Playlist {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t=sc.nextInt();
		int a=0;
		while (t-->0) {
			int n=sc.nextInt();
			int x=sc.nextInt();
			a=x*3;
			System.out.println(n/a);
		}

	}

}
