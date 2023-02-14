package codechef;
import java.util.Scanner;
public class Car_Trip {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t=sc.nextInt();
		int r = 0;
		while (t-->0) {
			int x=sc.nextInt();
			if (x<=300) {
				r=300*10;
				System.out.println(r);
			} else {
				r=0;
				r=r+(x*10);
				System.out.println(r);
			}
			
		}
	}

}
