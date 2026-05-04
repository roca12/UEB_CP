import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	/*
	 * Autor: mariana 
	 * Problema : Ordenando en Cubetas 
	 * Juez online: omegaUp
	 * Veredicto: Accepted 
	 * URL:https://omegaup.com/arena/problem/Ordenando-en-cubetas/
	 */
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int[] numeritos = new int[n];
		int[] num = new int[m];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			numeritos[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(numeritos);
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (numeritos[j] == i + 1) {
					num[i]++;
				}
			}
		}
		for (int i = 0; i < num.length; i++) {
			System.out.println((i + 1) + ": " + num[i]);
		}
	}

}
