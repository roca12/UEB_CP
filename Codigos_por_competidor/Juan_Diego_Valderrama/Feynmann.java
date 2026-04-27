import java.util.Scanner;

public class Feynmann {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		while (true) {
			int n = sc.nextInt();
			int t = 0;
			if (n == 0) {
				break;
			} 
			for (int i = 0; i <= n; i++) {
				t += Math.pow(i, 2);
			}
			System.out.println(t);
		}
	}
}
