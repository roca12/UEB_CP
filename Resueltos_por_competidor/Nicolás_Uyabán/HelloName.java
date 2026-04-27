import java.util.Scanner;

public class HelloName {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		sc.nextLine();

		for (int i = 0; i < n; i++) {
			String aux = sc.nextLine();
			System.out.println("Hello " + aux + "!");
		}

	}
}
