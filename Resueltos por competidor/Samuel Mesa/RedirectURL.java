
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String aux = "https";
		int t = sc.nextInt();

		for (int i = 0; i < t; i++) {
			String s =sc.next();
			String aux1=s.substring(s.indexOf(':'));
			
			System.out.println("Case "+(i+1)+": "+aux+aux1);
		}
	}
}