import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	/*
	 * Autor: mariana 
	 * Problema : Red Ball
	 * Juez online: omegaUp 
	 * Veredicto: Accepted
	 * URL: https://omegaup.com/arena/problem/Red-Ball-cpp/#problems
	 */
	public static void main(String[] args) throws Exception {

		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();

		int n = sc.nextInt();

		while (n-- > 0) {

			long a = sc.nextLong();

			ArrayList<Long> b = new ArrayList<>();

			long c = 1;

			while (a > 0) {

				long d = a % 10;

				if (d != 0) {
					b.add(d * c);
				}

				c *= 10;
				a /= 10;
			}

			sb.append(b.size()).append("\n");

			for (int i = b.size() - 1; i >= 0; i--) {

				sb.append(b.get(i));

				if (i != 0) {
					sb.append(" ");
				}
			}

			sb.append("\n");
		}

		System.out.print(sb);
	}
}
