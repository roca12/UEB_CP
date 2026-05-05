import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
  /*
	 * Autor: mariana 
	 * Problema : Calculadora de Salario
	 * Juez online: omegaUp 
	 * Veredicto: Accepted
	 * URL: https://omegaup.com/arena/problem/Calculadora-de-salario-UAMA-PE/
	 */
	static double sueldoPrimerasHoras(double x, double y) {
		return x * y;
	}

	static double segundoSueldo(double x, double y) {
		return x * (y * 1.5);
	}

	static double horasExtra(double x, double y) {
		return x * (y * 2);
	}

	static double calcularSalario(double x, double y) {
		if (x <= 40) {
			return sueldoPrimerasHoras(x, y);
		} else if (x <= 50) {
			return sueldoPrimerasHoras(40, y) + segundoSueldo(x - 40, y);
		} else {
			return sueldoPrimerasHoras(40, y) + segundoSueldo(10, y) + horasExtra(x - 50, y);
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		double x = Double.parseDouble(st.nextToken());
		double y = Double.parseDouble(st.nextToken());
		double total = calcularSalario(x, y);

		if (total == (long) total) {
			System.out.println((long) total);
		} else {
			System.out.println(total);
		}
	}
}
