import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	/*
	 * Autor: mariana 
	 * Problema : Las Esferas Del Dragon
	 * Juez online: omegaUp 
	 * Veredicto: Accepted
	 * URL: https://omegaup.com/arena/CB032026I/#problems/esferas-del-dragon-cb
	 */
  public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int n = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		int[] num = new int[n];
		int cont = n;
		for (int i = 0; i < n; i++) {
			num[i] = Integer.parseInt(st.nextToken());
			if (num[i] > 7 || num[i] < 1) {
				cont--;
			}
		}
		System.out.println(cont);
	}
}
