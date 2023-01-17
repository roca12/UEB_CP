package codechef;
import java.util.*;
public class Expiry2 {

	public static void main(String[] args) {
		float a=0;
	Scanner sc=new Scanner(System.in);
	int t=sc.nextInt();
	while (t-->0) {
		int n=sc.nextInt();
		int m=sc.nextInt();
		int k=sc.nextInt();
		float n1=n;
		float m1=m;
		float k1=k;
		a=(float) (n1/k1);
		if (a<=m) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}

	}

}