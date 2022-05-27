import java.util.Arrays;
import java.util.Scanner;

public class Permutations {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int t, i, j, k;
		long permutacion;
		long factoriales[] = new long[21];
		factoriales[0] = factoriales[1] = 1;
		char[] str = new char[30];
		for (i = 2; i <= 20; i++) {
			factoriales[i] = factoriales[i - 1] * i;
		}
		t = sc.nextInt();
		while (t > 0) {
			String aux = sc.next();
			str = aux.toCharArray();
			int n = str.length;
			Arrays.sort(str);
			permutacion = sc.nextLong();
			permutacion++;
			int[] used = new int[21];
			for (i = 0; i < n; i++) {
				for (j = 0; j <= n; j++) {
					if (factoriales[n - i - 1] * j >= permutacion)
						break;
				}
				j--;
				permutacion -= factoriales[n - i - 1] * j;
				for (k = 0; k < n; k++) {
					if (used[k] == 0) {
						if (j == 0) {
							System.out.print(str[k]);
							used[k] = 1;
							break;
						}
						j--;
					}
				}
			}
			System.out.println();
			t--;
		}

	}

}
