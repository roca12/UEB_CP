import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Evolution {
	public static void main(String[] args) {
		FastReader sc = new FastReader();
		int t = sc.nextInt();
		for (; t > 0; t--) {
			String a = sc.next();
			String b = sc.next();
			int a1 = 0;
			int b2 = 0;
			for (int i = 0; i < a.length(); i++) {
				char c = a.charAt(i);
				if (c == 'B') {
					a1++;
				}
			}
			for (int i = 0; i < b.length(); i++) {
				char c = b.charAt(i);
				if (c == 'B') {
					b2++;
				}
			}
			a = a.replace("B", "");
			b = b.replace("B", "");
			if ((a1 % 2) == (b2 % 2)) {
				while (a.contains("AA") || b.contains("AA") || a.contains("CC") || b.contains("CC")) {
					a = a.replace("AA", "");
					b = b.replace("AA", "");
					a = a.replace("CC", "");
					b = b.replace("CC", "");
				}
				if (a.equals(b)) {
					System.out.println("YES");
				} else {
					System.out.println("NO");
				}
			} else {
				System.out.println("NO");
			}
		}
	}

	static class FastReader {

		BufferedReader br;
		StringTokenizer st;

		public FastReader() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}

		String next() {
			while (st == null || !st.hasMoreElements()) {
				try {
					st = new StringTokenizer(br.readLine());
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
				str = br.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}
			return str;
		}
	}
}
