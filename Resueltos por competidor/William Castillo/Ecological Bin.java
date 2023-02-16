import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		while (sc.hasNext()) {
			int b1 = sc.nextInt();
			int g1 = sc.nextInt();
			int c1 = sc.nextInt();

			int b2 = sc.nextInt();
			int g2 = sc.nextInt();
			int c2 = sc.nextInt();

			int b3 = sc.nextInt();
			int g3 = sc.nextInt();
			int c3 = sc.nextInt();

			int bgc = b2 + b3 + g1 + g3 + c1 + c2;
			int bcg = b2 + b3 + c1 + c3 + g1 + g2;
			int gbc = g2 + g3 + b1 + b3 + c1 + c2;
			int gcb = g2 + g3 + c1 + c3 + b1 + b2;
			int cgb = c2 + c3 + g1 + g3 + b1 + b2;
			int cbg = c2 + c3 + b1 + b3 + g1 + g2;

			int menorC1 = Math.min(bgc, bcg);
			int menorC2 = Math.min(gbc, gcb);
			int menorC3 = Math.min(cgb, cbg);
			int menor = Math.min(Math.min(menorC1, menorC2), menorC3);

			if (menor == bcg) {
				System.out.println("BCG " + menor);
			} else {
				if (menor == bgc) {
					System.out.println("BGC " + menor);
				} else {
					if (menor == cbg) {
						System.out.println("CBG " + menor);
					} else {
						if (menor == cgb) {
							System.out.println("CGB " + menor);
						} else {
							if (menor == gbc) {
								System.out.println("GBC " + menor);

							} else {
								if (menor == gcb) {
									System.out.println("GCB " + menor);
								}
							}
						}
					}
				}
			}
		}

	}
}
