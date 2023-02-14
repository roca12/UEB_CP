import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int q = sc.nextInt();
		sc.nextLine();
		for (int j = 0; j < q; j++) {
			String cadena = sc.nextLine();
			TreeSet<Integer> aux = new TreeSet<>();
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