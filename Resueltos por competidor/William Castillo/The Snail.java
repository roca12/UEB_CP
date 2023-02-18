import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		while (sc.hasNext()) {
			int h = sc.nextInt();
			if (h == 0) {
				break;
			} else {
				int u = sc.nextInt();
				int d = sc.nextInt();
				int f = sc.nextInt();

				boolean cmamo = false;

				int aux = 1;
				float pos = 0;

				float u2 = (float) u;
				float res = (f * u2) / 100;

				while (true) {

					if (u2 > 0) {
						pos += u2;
					}
					if (pos > h) {
						break;
					}
					pos -= d;
					u2 = u2 - res;

					if (pos < 0) {
						cmamo = true;
						break;
					}

					aux++;
				}

				if (cmamo == true) {
					System.out.println("failure on day " + aux);
				} else {
					System.out.println("success on day " + aux);
				}

			}

		}

	}
}
