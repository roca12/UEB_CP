import java.util.Scanner;

public class Hello_Name {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int t=sc.nextInt();
		for (int i = 0; i < t; i++) {
			String a=sc.next();
			System.out.println("Hello "+a+"!");
		}
	}
}
