import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		while (n != 0 && m != 0) {
			int[] caballeros = new int[m];
			int[] cabezas = new int[n];
			int[] copia = new int[n];

			int pago = 0;
			for (int i = 0; i < cabezas.length; i++) {
				cabezas[i] = sc.nextInt();
				copia[i] = 0;
			}
			for (int i = 0; i < caballeros.length; i++) {
				caballeros[i] = sc.nextInt();
			}

			Arrays.sort(caballeros);
			Arrays.sort(cabezas);
			int ix = 0, jx = 0;
			while (ix < caballeros.length && jx < cabezas.length) {
				if (caballeros[ix] >= cabezas[jx]) {
					pago += caballeros[ix];
					cabezas[jx] = 0;
					caballeros[ix]=Integer.MIN_VALUE;
					ix=0;
					jx++;
				} else {
					ix++;
				}
			}
			if (Arrays.equals(cabezas, copia)) {
				System.out.println(pago);
			} else {
				System.out.println("Loowater is doomed!");
			}

			n = sc.nextInt();
			m = sc.nextInt();
		}
	}
}