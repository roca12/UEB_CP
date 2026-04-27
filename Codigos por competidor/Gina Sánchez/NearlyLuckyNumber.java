import java.util.Scanner;

public class NearlyLuckyNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (sc.hasNext()) {
			String p = "";
			String pf = "";
			p = sc.nextLine();

			for (int i = 0; i < p.length(); i++) {
				char c = p.charAt(i);
				String pc = "";
				pc += c;
				if (pc.contains("4") || pc.contains("7")) {
					pf += pc;
				}
			}

			if (pf.length() == 4 || pf.length() == 7) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
	}

}
