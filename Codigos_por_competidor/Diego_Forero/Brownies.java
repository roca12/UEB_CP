import java.util.Scanner;

public class Brownies {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int i = 1; i <= t; i++) {
			int s = sc.nextInt(), b = sc.nextInt();
			System.out.println("Practice #"+i+": "+s+" "+b);
			int m = sc.nextInt();
			int aux = b;
			while (m-- > 0) {
				int f = sc.nextInt();
				while (f >= aux) aux*=2;
				aux = aux-f;
				System.out.println(f+" "+aux);
			}
		}
	}

}
