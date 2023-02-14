package codechef;
import java.util.Scanner;
public class Greater_Average {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int t=sc.nextInt();
	while (t-->0) {
		float a=sc.nextFloat();
		float b=sc.nextFloat();
		float c=sc.nextFloat();
		if ((a+b)/2>c) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}

	}

}
