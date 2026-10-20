/*
 * Autor: Juan Andres Garcia
 * Problema: 200B
 * Juez online: Codeforces
 * Veredicto: Accepted
 * Url: https://codeforces.com/problemset/problem/200/B
 *  **/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Drinks {
	static class FastReader {
		BufferedReader br;
		StringTokenizer st;

		public FastReader() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}

		String next() {
			while (st == null || !st.hasMoreElements()) {
				try {
					String line = br.readLine();
					if (line == null)
						return null;
					st = new StringTokenizer(line);
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			return st.nextToken();
		}

		int nextInt() {
			return Integer.parseInt(next());
		}

		long nextLong() {
			return Long.parseLong(next());
		}

		double nextDouble() {
			return Double.parseDouble(next());
		}

		String nextLine() {
			String str = "";
			try {
				if (st != null && st.hasMoreTokens()) {
					str = st.nextToken("\n");
				} else {
					str = br.readLine();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
			return str;
		}
	}
	
	public static void main(String[] args) {
		
		FastReader in = new FastReader();
		
		int x = in.nextInt();
		int suma = 0;
		
		
		for(int i = 0; i < x; i++) {
			
			int p = in.nextInt();
			
			suma += p; 
		}
		
		
		System.out.println((double) suma / x);
		
		
	}

}
