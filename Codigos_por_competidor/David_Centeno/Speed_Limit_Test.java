package codechef;
import java.util.Scanner;
public class Speed_Limit_Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t=sc.nextInt();
		float v1 = 0, v2 = 0;
		while (t-->0) {
			float a=sc.nextFloat();
			float x=sc.nextFloat();
			float b=sc.nextFloat();
			float y=sc.nextFloat();
			v1=a/x;
			v2=b/y;
			if (v1==v2) {
				System.out.println("Equal");
			} else {
				if (v1>v2) {
					System.out.println("Alice");
			} else {
				System.out.println("Bob");
			}
		}
	}
	}
}

