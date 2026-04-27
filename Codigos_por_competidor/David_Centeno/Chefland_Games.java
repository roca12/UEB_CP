package codechef;
import java.util.Scanner;
public class Chefland_Games {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t=sc.nextInt();
		while (t-->0) {
			int r1=sc.nextInt();
			int r2=sc.nextInt();
			int r3=sc.nextInt();
			int r4=sc.nextInt();
			if (r1==0 && r2==0 && r3==0 && r4==0 ) {
				System.out.println("IN");
			} else {
				System.out.println("OUT");
			}
		}

	}

}
