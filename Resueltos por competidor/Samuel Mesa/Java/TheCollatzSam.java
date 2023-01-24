
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int caso = 0;
		while (true) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int aux = a;
			int cont = 0;
			if (a < 0 || b < 0) {
				break;
			} else {
				caso++;
				while (true) {
					if (aux < 0 || aux > b) {
						break;
					}
					if (aux == 1) {
						cont++;
						break;
					}
					if (aux % 2 == 0) {
						aux = aux / 2;
						cont++;
					} else {
						aux = (aux * 3) + 1;
						cont++;
					}
				}
				System.out.println("Case " + caso + ": A = " + a + ", limit = " + b + ", number of terms = " + cont);
			}
		}
	}
}