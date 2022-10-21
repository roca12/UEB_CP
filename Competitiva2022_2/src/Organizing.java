import java.util.Arrays;
import java.util.Scanner;

public class Organizing {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();
		for (int i = 0; i < t; i++) {

			boolean[] found = new boolean[10];
			boolean[] compare = { true, true, true, true, true, true, true, true, true, true };
			int[] bellezas = new int[10];
			int belleza = 0;
			int cant_problemas = sc.nextInt();
			for (int j = 0; j < cant_problemas; j++) {
				int belleza_actual = sc.nextInt();
				int diff = sc.nextInt();
				if (found[diff - 1] == false) {
					found[diff - 1] = true;
					belleza += belleza_actual;
					bellezas[diff - 1] = belleza_actual;
				} else {
					if (bellezas[diff - 1] < belleza_actual) {
						belleza += belleza_actual;
						belleza-=bellezas[diff - 1];
						bellezas[diff - 1] = belleza_actual;
					}
				}
			}

			if (Arrays.equals(found, compare)) {
				System.out.println(belleza);
			} else {
				System.out.println("MOREPROBLEMS");
			}

		}
	}
}