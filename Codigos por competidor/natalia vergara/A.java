import java.util.Scanner;

public class A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int casos = sc.nextInt();
		sc.nextLine();

		for (int i = 0; i < casos; i++) {
			String a = sc.nextLine();
			String b = sc.nextLine();
			char[] aa = a.toCharArray();
			char[] bb = b.toCharArray();
			int cont = 0;
			int cont2 = 0;

			if (a.contains(b)) {
				cont2 = 0;
				int k = 0;
				for (int j1 = 0; j1 < aa.length; j1++) {
					if (iguales(aa[j1], bb[k]) == 1) {
						cont2++;
						if (k < 2) {
							k++;
						} else {
							k = 0;
						}
					} else {
						k = 0;
						cont2 = 0;
					}
					if (cont2 == b.length()) {
						cont++;
						cont2 = 0;
					}

				}
			}
			System.out.println("Case " + (i + 1) + ": " + cont);

		}

	}

	static public int iguales(char a, char b) {
		if (a == b) {
			return 1;
		} else {
			return 0;
		}
	}
}
