/*
* Autor: pgms1103-afk
* Problema: B. Interesting drink
* Juez Online: Codeforces
* Veredicto: Accepted
* URL: https://codeforces.com/contest/706/problem/B
* Difficulty: 1100
*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class InterestingDrink {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static int precioBebidas[];
	static long contador;
	static long dineroAGastar;

	public static void main(String[] args) throws NumberFormatException, IOException {

		int tiendas = Integer.parseInt(br.readLine());
		String datos[] = br.readLine().split(" ");
		precioBebidas = new int[tiendas];
		for (int i = 0; i < tiendas; i++) {
			precioBebidas[i] = Integer.parseInt(datos[i]);
		}
		Arrays.sort(precioBebidas);
		int diasComprarBebidas = Integer.parseInt(br.readLine());

		for (int i = 0; i < diasComprarBebidas; i++) {

			long rta = 0;
			dineroAGastar = Long.parseLong(br.readLine());
			long min = 0;
			long max = tiendas-1;
			while (min <= max) {
				long mid = (min + max) / 2;
				if (bebidasPosibles(mid)) {
					rta = mid + 1;
					min = mid + 1;
				} else {
					max = mid - 1;
				}
			}
			System.out.println(rta);

		}

	}

	static boolean bebidasPosibles(long mid) {

		if (precioBebidas[(int) mid] <= dineroAGastar) {
			return true;
		} else {
			return false;
		}
	}

}