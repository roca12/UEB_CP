import java.util.Scanner;

public class BlowingFuses {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, m, c, actualcase = 1;
		n = sc.nextInt();
		m = sc.nextInt();
		c = sc.nextInt();

		boolean broken = false;
		while (n != 0 && m != 0 && c != 0) {
			int maxpw = 0;
			int sum = 0;
			boolean[] electrodomesticos = new boolean[n];
			int[] potencias = new int[n];
			for (int i = 0; i < potencias.length; i++) {
				potencias[i] = sc.nextInt();
			}
			for (int i = 0; i < m; i++) {
				int actual = sc.nextInt();
				actual--;
				if (!electrodomesticos[actual]) {
					electrodomesticos[actual] = !electrodomesticos[actual];
					sum += potencias[actual];
					if (sum > maxpw) {
						maxpw = sum;
					}
				} else {
					electrodomesticos[actual] = !electrodomesticos[actual];
					sum -= potencias[actual];
					if (sum > maxpw) {
						maxpw = sum;
					}
				}

				if (sum > c) {
					broken = true;
				}

			}
			System.out.println("Sequence " + actualcase);
			if (broken) {
				System.out.println("Fuse was blown.");
			} else {
				System.out.println("Fuse was not blown.");
				System.out.println("Maximal power consumption was " + maxpw + " amperes.");
			}
			System.out.println();
			actualcase++;
			n = sc.nextInt();
			m = sc.nextInt();
			c = sc.nextInt();
			broken = false;
		}

	}
}
