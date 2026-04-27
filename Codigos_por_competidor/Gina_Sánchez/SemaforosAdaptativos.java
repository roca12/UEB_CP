import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SemaforosAdaptativos {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException {

		String linea1 = br.readLine();
		String[] partes1 = linea1.split(" ");

		int n = Integer.parseInt(partes1[0]);
		long t = Long.parseLong(partes1[1]);

		int cont = 0;

		for (int i = 0; i < n; i++) {
			String lineaSemaforo = br.readLine();

			String[] datos = lineaSemaforo.split(" ");
			long g = Long.parseLong(datos[0]);
			long p = Long.parseLong(datos[1]);

			long posicionActual = t % p;

			if (posicionActual < g) {
				cont++;
			}
		}

		System.out.println(cont);
	}
}
