import java.util.Scanner;

public class Sumando {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int c = sc.nextInt();

		for (int i = 0; i < c; i++) {

			int n1 = sc.nextInt();
			int n2 = sc.nextInt();
			int n3 = sc.nextInt();
			int n4 = sc.nextInt();

			int suma = n1 + n2 + n3 + n4;
			System.out.println(suma);
		}

	}
}
