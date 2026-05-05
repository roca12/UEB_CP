
/*
 * Autor: Mario Rodríguez
 * Problema: Party Monster
 * Juez online: CodeForces
 * Veredicto: Accepted
 * URL: https://codeforces.com/problemset/problem/2227/B
 */
import java.util.Scanner;

public class Party_Monster {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int c = sc.nextInt();

		while (c-- > 0) {

			int c2 = sc.nextInt();
			int cin = 0, cot = 0;
			String temp = sc.next();

			for (int i = 0; i < c2; i++) {

				if (temp.charAt(i) == '(')
					cin++;
				else
					cot++;

			}
			sc.nextLine();

			System.out.println((cin == cot) ? "YES" : "NO");

		}

		sc.close();

	}

}
