/**
 * Autor: Jean Paul
 * Problema: C. Hard Problem
 * Juez online: Polygon 
 * Veredicto: WA on test 2
 * URL: https://codeforces.com/problemset/problem/2044/C
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainHP {
	static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException {
		int t = Integer.parseInt(reader.readLine());
		int m, a, b, c;
		for (int i = 0; i < t; i++) {
			String txt = reader.readLine();
			String[] txt2 = txt.split(" ");
			m = Integer.parseInt(txt2[0]);
			a = Integer.parseInt(txt2[1]);
			b = Integer.parseInt(txt2[2]);
			c = Integer.parseInt(txt2[3]);
			if (a > m) {
				a = m;
			}
			if (b > m) {
				b = m;
			}

			int sum = a + b;
			if ((sum + c) <= m * 2) {
				sum += c;
			}
			
			System.out.println(sum);
		}
	}
}
