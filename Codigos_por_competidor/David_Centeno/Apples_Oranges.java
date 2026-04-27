package codechef;
import java.util.Scanner;
public class Apples_Oranges {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x=sc.nextInt();
		int a=sc.nextInt();
		int b=sc.nextInt();
		int suma=a+b;
		if (x<=suma) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}

}
