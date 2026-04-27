import java.util.Scanner;
import java.util.TreeMap;

public class ListOfConquests {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int casos = sc.nextInt();
		sc.nextLine();
		TreeMap<String, Integer> mapa = new TreeMap<>();
		for (int i = 0; i < casos; i++) {
			String palabra = sc.nextLine();
			String[] pais = palabra.split(" ");
			if (mapa.containsKey(pais[0])) {
				int aux = mapa.get(pais[0]);
				mapa.put(pais[0], aux + 1);
			} else {
				mapa.put(pais[0], 1);
			}
		}
		for (String a : mapa.keySet()) {
			if (mapa.get(a) >= 1) {
				System.out.println(a + " " + mapa.get(a));
			}
		}
	}

}
