/*
* Autor: pgms1103-afk
* Problema: A. Perfect Sandwiches
* Juez Online: Codeforces
* Veredicto: Accepted
* URL: https://codeforces.com/problemset/problem/2276/A
* Difficult : 800
*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PerfectSandwiches {

	static BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		int t = Integer.parseInt(br.readLine());
		for (int i = 0; i < t; i++) {
			String datos[] = br.readLine().split(" ");
			int a = Integer.parseInt(datos[0]);
			int b = Integer.parseInt(datos[1]);
			int contador = 0;
			
			while(a>b && b > 0 && a > 0) {
				a = a-2;
				b = b - 1;
				contador++;
			}
			
			if(contador == 0) {
				System.out.println(-1);
			}else {
				System.out.println(contador);
			}
		}

	}

}
