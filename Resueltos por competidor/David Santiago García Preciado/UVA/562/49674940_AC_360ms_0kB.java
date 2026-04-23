import java.util.Scanner;

public class Main{

	static int[] dividedCoins = new int[25000+1];
	static int[] maincoins = new int[100+1];

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for (int n = sc.nextInt(); n > 0; n--) {
			int m = sc.nextInt();
			int sum = 0;
			for (int i = 1; i <= m; i++) {
				maincoins[i] = sc.nextInt();
				sum += maincoins[i];
			}
			System.out.println(sum - 2 * lookForOptimization(m, sum / 2));
		}
		sc.close();
	}

	public static int lookForOptimization(int N, int W) {
		for (int i = 0; i <= (W); i++) {
			dividedCoins[i] = 0;
		}
		for (int i = 1; i <= N; i++) {
			for (int j = W; j > 0; j--) {
				if (maincoins[i] <= j)
					dividedCoins[j] = Math.max(dividedCoins[j], maincoins[i] + dividedCoins[j - maincoins[i]]);
			}
		}
		return dividedCoins[W];
	}
}
