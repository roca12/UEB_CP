package codechef;

import java.util.Scanner;

public class Chef_Gym {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t=sc.nextInt();
		while (t-->0) {
			int gp=sc.nextInt();
			int tr=sc.nextInt();
			int pre=sc.nextInt();
			
			if (pre>=(gp+tr)) {
				System.out.println("2");
			} else {
				if ((gp+tr)>pre && gp<=pre) {
					System.out.println("1");
			} else {
				
					System.out.println("0");
				
		}

	}
		}

	}

}
