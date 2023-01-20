import java.util.Iterator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int casos = sc.nextInt();

		for (int i = 0; i < casos; i++) {
			System.out.println();
			int punta = sc.nextInt();
			int repeti = sc.nextInt();
			int aux = punta;
			for (int j = 0; j < repeti; j++) {

				for (int h = 1; h <= punta; h++) {
					for (int k = 1; k <= h; k++) {
						System.out.print(h);
					}
					System.out.println();
				}

				for (int m = 1; m <= punta; m++) {
					aux--;
					for (int k = punta - 1; k >= m; k--) {
						System.out.print(aux);
					}
					System.out.println();
				}
				aux = punta;

			}
		}

	}

}