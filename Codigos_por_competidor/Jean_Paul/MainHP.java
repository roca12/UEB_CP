import java.util.Scanner;

public class MainHP {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int t = sc.nextInt();
		int m, a, b, c;
		for (int i = 0; i < t; i++) {
			m = sc.nextInt();
			a = sc.nextInt();
			b = sc.nextInt();
			c = sc.nextInt();
			if (a > m) {
				a = m;
			}
			if (b > m) {
				b = m;
			}
			
			int sum = a + b;
			if ((sum + c) <= m * 2) {
				sum += c;
			}
			if (sum <= m * 2) {
				System.out.println(sum);
			}
			if (sum > m * 2) {
				System.out.println(m * 2);
			}
		}
	}
}
