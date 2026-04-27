import java.util.Scanner;

public class MainPizzaCutting {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		long n;
		n=sc.nextLong();
		while(n>=0) {
			System.out.println(n*(n+1)/2+1);
			n=sc.nextLong();
		}
	}

}
