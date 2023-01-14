package sam.competitiva;

import java.util.Scanner;

public class identifyingtea {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int cont = 0;
			int t = sc.nextInt();
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			int d = sc.nextInt();
			int e = sc.nextInt();
			if (t == a) {
				cont++;
			}
			if (t == b) {
				cont++;
			}
			if (t == c) {
				cont++;
			}
			if (t == d) {
				cont++;
			}
			if (t == e) {
				cont++;
			}
			System.out.println(cont);
			cont = 0;
		}
	}

}
