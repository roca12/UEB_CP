import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int q = sc.nextInt();
		for (int i = 0; i < q; i++) {
			sc.nextLine();
			TreeMap<String, Integer> map = new TreeMap<String, Integer>();
			int t = sc.nextInt();
			sc.nextLine();
			for (int l = 0; l < t; l++) {
				String numero = sc.nextLine();
				numero = numero.replaceAll("-", "");
				String aux = "";
				for (int j = 0; j < numero.length(); j++) {
					if (numero.charAt(j) == 'A' || numero.charAt(j) == 'B' || numero.charAt(j) == 'C') {
						aux = aux + "2";
					} else if (numero.charAt(j) == 'D' || numero.charAt(j) == 'E' || numero.charAt(j) == 'F') {
						aux = aux + "3";
					} else if (numero.charAt(j) == 'G' || numero.charAt(j) == 'H' || numero.charAt(j) == 'I') {
						aux = aux + "4";
					} else if (numero.charAt(j) == 'J' || numero.charAt(j) == 'K' || numero.charAt(j) == 'L') {
						aux = aux + "5";
					} else if (numero.charAt(j) == 'M' || numero.charAt(j) == 'N' || numero.charAt(j) == 'O') {
						aux = aux + "6";
					} else if (numero.charAt(j) == 'P' || numero.charAt(j) == 'R' || numero.charAt(j) == 'S') {
						aux = aux + "7";
					} else if (numero.charAt(j) == 'T' || numero.charAt(j) == 'U' || numero.charAt(j) == 'V') {
						aux = aux + "8";
					} else if (numero.charAt(j) == 'W' || numero.charAt(j) == 'X' || numero.charAt(j) == 'Y') {
						aux = aux + "9";
					} else {
						aux = aux + numero.charAt(j);
					}
				}
				if (aux.equals("")) {
					String inicio = numero.substring(0, 3);
					String termina = numero.substring(3, 7);
					String completo = inicio + "-" + termina;
					if (map.containsKey(completo)) {
						int num = map.get(completo);
						map.put(completo, num + 1);
					} else {
						map.put(completo, 1);
					}
				} else {
					String inicio = aux.substring(0, 3);
					String termina = aux.substring(3, 7);
					String completo = inicio + "-" + termina;
					if (map.containsKey(completo)) {
						int num = map.get(completo);
						map.put(completo, num + 1);
					} else {
						map.put(completo, 1);
					}
				}
			}

			boolean condicion = false;
			
			for (String dato : map.keySet()) {
				if (map.get(dato) != 1) {
					condicion = true;
					System.out.println(dato + " " + map.get(dato));
					System.out.println();
				}
			}
			
			if (condicion == false) {
				System.out.println("No duplicates.");
			}
			
		}

	}
}
