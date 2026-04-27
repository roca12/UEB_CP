package CompSolitario;
import java.util.Scanner;

public class Feynman {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			int n = sc.nextInt();
			if (n == 0) break;
			System.out.println(((n*(n+1)) * (2*n+1)/6));
		}
	}

}
