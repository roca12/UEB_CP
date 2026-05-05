import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	/*
	 * Autor: mariana 
	 * Problema : Emparejando el Entrenamiento
	 * Juez online: omegaUp 
	 * Veredicto: Accepted
	 * URL: https://omegaup.com/arena/problem/Emparejando-el-entrenamiento/
	 */
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] numeritos = new int[4];
		numeritos[0] = Integer.parseInt(st.nextToken());
		numeritos[1] = Integer.parseInt(st.nextToken());
		numeritos[2] = Integer.parseInt(st.nextToken());
		numeritos[3] = Integer.parseInt(st.nextToken());
		Arrays.sort(numeritos);
		int a = numeritos[0] + numeritos[3];
		int b = numeritos[1] + numeritos[2];
		if ((a - b) > 0) {
			System.out.println(a - b);
		} else {
			System.out.println(b - a);
		}
	}
}
