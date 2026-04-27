import java.util.Scanner;

public class WhoIsTaller {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int i = 0; i < t; i++) {
			int x = sc.nextInt(), y = sc.nextInt();
			if (x > y) {
				System.out.println("A");
			} else {
				System.out.println("B");
			}
		}
	}

}
