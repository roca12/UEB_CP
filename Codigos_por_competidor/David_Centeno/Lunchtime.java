package codechef;
import java.util.Scanner;
public class Lunchtime {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-->0) {
			int h=sc.nextInt();
			if (h>=1 && h<=4) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		}

	}

}
