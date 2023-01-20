package CompSolitario;

import java.util.ArrayList;
import java.util.Scanner;

public class PalindromicFactors {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int i = 0; i < t; i++) {
			int a = sc.nextInt();
			int p = 0;
			ArrayList<Integer> divisores = new ArrayList<Integer>();
			divisores.add(1);
			int raiz = (int) (Math.sqrt(a));
			for (int j = 2; j <= raiz; j++) {
				if (a%j == 0) {
					int res = a/j;
					divisores.add(j);
					divisores.add(res);
				}
			}
			divisores.add(a);
			for (Integer integer : divisores) {
				int aux = integer;
				int r, inv = 0;
				while( aux > 0 ) {
			         r = aux % 10;
			         inv = inv * 10 + r;
			         aux /= 10;
			      }
				if (integer == inv) {
					p++;
				}
			}
			System.out.println("Case #" + (i+1) + ": " + p);
		}
	}

}
