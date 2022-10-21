import java.util.HashSet;
import java.util.Scanner;

public class Boundary {

	static int w, l;
	static HashSet<Integer> ans = new HashSet<>();

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t;
		t = sc.nextInt();
		while (t > 0) {
			w = sc.nextInt();
			l = sc.nextInt();
			ans.clear();
			add(gcd(w - 1, l - 1));
			add(gcd(l, w - 2));
			add(gcd(l - 2, w));
			if (l % 2 != w % 2)
				ans.add(2);
			System.out.printf("%d ", (int) ans.size());
			for (Integer x : ans)
				System.out.printf("%d ", x);
			System.out.println();
			t--;
		}

	}

	public static int gcd(int a, int b) {
		return b == 0 ? a : gcd(b, a % b);
	}

	static void add(int g) {
		for (int i = 1; i * i <= g; i++) {
			if (g % i != 0)
				continue;
			ans.add(i);
			ans.add(g / i);
		}
	}

}
