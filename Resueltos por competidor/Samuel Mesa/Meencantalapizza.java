
import java.util.Iterator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int h = sc.nextInt();
		sc.nextLine();
		for (int q = 0; q < h; q++) {
			String cadena = sc.nextLine();
			int tot = 0;
			int m = 0;
			int a = 0;
			int r = 0;
			int g = 0;
			int i = 0;
			int t = 0;
			for (int k = 0; k < cadena.length(); k++) {
				if (cadena.charAt(k) == 'M') {
					m++;
				} else if (cadena.charAt(k) == 'A') {
					a++;
				} else if (cadena.charAt(k) == 'R') {
					r++;
				} else if (cadena.charAt(k) == 'G') {
					g++;
				} else if (cadena.charAt(k) == 'I') {
					i++;
				} else if (cadena.charAt(k) == 'T') {
					t++;
				}
			}

			while (true) {
				if (m >= 1 && a >= 3 && r >= 2 && g >= 1 && i >= 1 && t >= 1) {
					tot++;
					m = m - 1;
					a = a - 3;
					r = r - 2;
					g = g - 1;
					i = i - 1;
					t = t - 1;
				} else {
					break;
				}
			}
			
			System.out.println(tot);

		}
	}
}