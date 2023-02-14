import java.util.Scanner;

public class URL {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int t= sc.nextInt();
		for (int i = 1; i <= t; i++) {
			String b="";
			String a=sc.next();
				b=a.replaceAll("http:", "https:");
				System.out.println("Case "+i+": "+b);
		}
	}
}
