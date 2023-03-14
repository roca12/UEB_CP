import java.util.Scanner;

public class Contest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		long a=sc.nextLong(),b=sc.nextLong();
		long c=sc.nextLong(),d=sc.nextLong();
		double res=(double)(c*a-d*b)/(a-b);
		if(res>=0&&res<=100) {
			System.out.printf("%.6f", res);
		}
		else {
			System.out.println("impossible");
		}
	}

}
