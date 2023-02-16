import java.util.Scanner;

public class Margarita {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int casos = sc.nextInt();
		sc.nextLine();
		for (int i = 0; i < casos; i++) {
			String letras = sc.nextLine();
			int contm = 0;
			int conta = 0;
			int contr = 0;
			int contg = 0;
			int conti = 0;
			int contt = 0;
			int pizza = 0;
			
			for (int j = 0; j < letras.length(); j++) {
				if (letras.charAt(j) == 'M') {
					contm++;
				} else if (letras.charAt(j) == 'A') {
					conta++;
				} else if (letras.charAt(j) == 'R') {
					contr++;
				} else if (letras.charAt(j) == 'G') {
					contg++;
				} else if (letras.charAt(j) == 'I') {
					conti++;
				} else if (letras.charAt(j) == 'T') {
					contt++;
				}
			}
			
			while (true) {
				if (contm >= 1 && conta >= 3 && contr >= 2 && contg >= 1 && contt >= 1 && conti >= 1 ) {
					pizza++;
					contm = contm - 1;
					conta = conta - 3;
					contr = contr - 2;
					contg = contg - 1;
					conti = conti - 1;
					contt = contt - 1;
				} else {
					break;
				}
			}
			
			System.out.println(pizza);
		}
	}
}
