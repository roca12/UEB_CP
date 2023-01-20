package domjudgev2;
import java.util.Scanner;
public class MainX {
//Feynman
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = 0, a=0;
		do {
			t=sc.nextInt();
			a=t;
			if (t!=0) {
				System.out.println((a*(a+1)*((2*a)+1)/6));
			} else {
				break;
			}
		} while (t!=0);

	}

}
