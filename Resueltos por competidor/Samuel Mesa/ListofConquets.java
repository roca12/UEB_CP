package sam.competitiva;

import java.util.Scanner;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		TreeMap<String, Integer> orga = new TreeMap<String, Integer>();

		int a = sc.nextInt();
		sc.nextLine();
		for (int i = 0; i < a; i++) {
			String aux = sc.nextLine();
			String pais = aux.substring(0, aux.indexOf(" "));
			if (orga.containsKey(pais)) {
				int num = orga.get(pais);
				orga.put(pais, num + 1);
			} else {
				orga.put(pais, 1);
			}
		}
		for (String dato : orga.keySet()) {
			System.out.println(dato + " " + orga.get(dato));
		}
	}

}
