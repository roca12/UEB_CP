package codechef;

import java.util.Scanner;

public class The_Mango_Truck {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t=sc.nextInt();
		int p=0;
		while (t-->0) {
			int x=sc.nextInt();
			int y=sc.nextInt();
			int z=sc.nextInt();
			p=z-y;
			System.out.println(p/x);
			
		}
	}

}
