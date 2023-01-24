import java.util.Iterator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			int num = sc.nextInt();
			int cont = 0;
			if (num == 0) {
				break;
			}
			for (int i = 1; i <= num; i++) {
				cont += Math.pow(i, 2);
			}

			System.out.println(cont);
		}
	}
}
