import java.util.Scanner;

public class ProblemAB {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int t = sc.nextInt();
				int A = sc.nextInt();
				int B = sc.nextInt();
				int C = sc.nextInt();
				int D = sc.nextInt();
				int E = sc.nextInt();
				int rtas_correctas = 0;
				if (A == t) {
					rtas_correctas++;
				}
				if (B == t) {
					rtas_correctas++;
				}
				if (C == t) {
					rtas_correctas++;
				}
				if (D == t) {
					rtas_correctas++;
				}
				if (E == t) {
					rtas_correctas++;
				}
				System.out.println(rtas_correctas);

		}

	}
}
