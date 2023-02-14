import java.util.Scanner;

public class Lunchtime {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int i = 0; i < t; i++) {
			int x = sc.nextInt();
			if (x >= 1 && x <= 4) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
	}
}
