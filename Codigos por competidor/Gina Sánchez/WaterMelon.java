import java.util.Scanner;

public class WaterMelon {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (sc.hasNext()) {
			int n = 0;
			n = sc.nextInt();

			if (n % 2 != 0 || n == 2) {
				System.out.println("NO");
			} else if (n % 2 == 0) {
				System.out.println("YES");
			}

		}

	}

}
