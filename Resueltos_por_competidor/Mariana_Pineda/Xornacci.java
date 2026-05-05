import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main{
	/*
	 * Autor: mariana 
	 * Problema : Xornacci 
	 * Juez online: OmegaUp 
	 * Veredicto: Accepted
	 * URL: https://omegaup.com/arena/problem/Xornacci-cpp/
	 */
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);
		StringTokenizer st;
		int t = Integer.parseInt(br.readLine());
		while (t-- > 0) {
			st = new StringTokenizer(br.readLine());
			long a = Long.parseLong(st.nextToken());
			long b = Long.parseLong(st.nextToken());
			long n = Long.parseLong(st.nextToken());
			if (n % 3 == 0) {
				out.println(a);
			} else if (n % 3 == 1) {
				out.println(b);
			} else {
				out.println(a ^ b);
			}
		}
		out.flush();
	}
}
