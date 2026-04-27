package Clasificatorio;

import java.util.Scanner;

public class IdentifyingTea {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int t = sc.nextInt();
			int cont = 0;
			int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt(), d = sc.nextInt(), e = sc.nextInt();
			if (a == t) cont++;
			if (b == t) cont++;
			if (c == t) cont++;
			if (d == t) cont++;
			if (e == t) cont++;
			System.out.println(cont);
		}
	}

}
