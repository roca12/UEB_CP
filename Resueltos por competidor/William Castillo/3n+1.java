import java.util.Iterator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int tot = 0;
			int max = Math.max(a, b);
			int min = Math.min(a, b);
			for (int i = min; i <= max; i++) {
				int aux = probar(i);
				tot = Math.max(aux, tot);
			}
			System.out.println(a + " " + b + " " +tot);
		}
	}

	public static int probar(long i) {
		int salida = 1;

		while (i != 1) {
			if (i % 2 == 0) {
				i = i / 2;
			} else {
				i = (i * 3) + 1;
			}
			salida++;
		}
		return salida;
	}

}
