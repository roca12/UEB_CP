package codechef;
import java.util.Scanner;
public class Interior_Design {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t=sc.nextInt();
		int s1, s2;
		while (t-->0) {
			int x1=sc.nextInt();
			int y1=sc.nextInt();
			int x2=sc.nextInt();
			int y2=sc.nextInt();
			s1=x1+y1;
			s2=x2+y2;
			if (s1>s2) {
				System.out.println(s1);
			} else {
				System.out.println(s2);
			}
		}
	}

}
