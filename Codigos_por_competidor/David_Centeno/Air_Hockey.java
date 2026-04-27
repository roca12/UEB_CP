package codechef;
import java.util.Scanner;
public class Air_Hockey {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t=sc.nextInt();
		int m = 7;
		int resta = 0;
		while (t-->0) {
			int a=sc.nextInt();
			int b=sc.nextInt();
			if (a>b) {
				resta=m-a;
				System.out.println(resta);
			} else {
				resta=m-b;
				System.out.println(resta);
			}
		}
	}

}
