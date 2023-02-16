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

			int round = sc.nextInt();

			if (round == -1) {
				break;
			}

			sc.nextLine();
			String e = sc.nextLine();
			String d = sc.nextLine();

			HashSet<String> palabra = new HashSet<>();
			HashSet<String> dichas = new HashSet<>();
			HashSet<String> errores = new HashSet<>();

			boolean ganar = false;
			boolean perder = false;

			int aux = 0;

			for (int i = 0; i < e.length(); i++) {
				palabra.add(e.charAt(i) + "");
			}

			for (int i = 0; i < d.length(); i++) {

				if (palabra.contains(d.charAt(i) + "")) {
					dichas.add(d.charAt(i) + "");
				} else {
					if (!errores.contains(d.charAt(i) + "")) {
						errores.add(d.charAt(i)+ "");
						aux++;
					}
				}

				if (palabra.size() == dichas.size()) {
					ganar = true;
					break;
				}

				if (aux == 7) {
					perder = true;
					break;
				}
			}


			if (ganar == true) {
				System.out.println("Round " + round + "\n" + "You win.");
			} else if (perder == true) {
				System.out.println("Round " + round + "\n" + "You lose.");
			} else {
				System.out.println("Round " + round + "\n" + "You chickened out.");
			}
		}

	}
}
