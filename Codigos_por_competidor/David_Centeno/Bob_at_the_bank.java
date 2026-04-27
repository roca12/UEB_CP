package codechef;

import java.util.Scanner;

public class Bob_at_the_bank {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t=sc.nextInt();
		int suma, fin;
		while (t-->0) {
			int w=sc.nextInt();
			int x=sc.nextInt();
			int y=sc.nextInt();
			int z=sc.nextInt();
			suma=x-y;
			fin=suma*z;
			System.out.println(w+fin);
		}
	}

}
