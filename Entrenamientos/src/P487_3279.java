import java.util.Scanner;
import java.util.TreeMap;

public class P487_3279 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int casos = sc.nextInt();
		sc.nextLine();// quemar
		for (int i = 0; i < casos; i++) {
			TreeMap<String, Integer> mapa = new TreeMap<>();
			sc.nextLine();// espacio en blanco
			int cant_num = sc.nextInt();
			sc.nextLine();// quema
			for (int j = 0; j < cant_num; j++) {
				String num_actual = sc.nextLine();
				num_actual = num_actual.replaceAll("[^A-Z0-9]", "");
				String cambio = "";
				for (int k = 0; k < num_actual.length(); k++) {
					if (k == 3) {
						cambio += "-";
					}
					cambio += convert(num_actual.charAt(k) + "");
				}

				// System.out.println(cambio);
				if (mapa.containsKey(cambio)) {
					int aux = mapa.get(cambio);
					mapa.put(cambio, aux + 1);
				} else {
					mapa.put(cambio, 1);
				}

			}
			boolean noreptidos=false;
			for (String s : mapa.keySet()) {
				if (mapa.get(s) > 1) {
					System.out.println(s + " " + mapa.get(s));
					noreptidos=true;
				}
			}
			if (!noreptidos) {
				System.out.println("No duplicates.");
			}
			System.out.println();
			
		}

	}

	public static String convert(String letra) {
		switch (letra) {
		case "A":
		case "B":
		case "C":
			return "2";
		case "D":
		case "E":
		case "F":
			return "3";
		case "G":
		case "H":
		case "I":
			return "4";
		case "J":
		case "K":
		case "L":
			return "5";
		case "M":
		case "N":
		case "O":
			return "6";
		case "P":
		case "R":
		case "S":
			return "7";
		case "T":
		case "U":
		case "V":
			return "8";
		case "W":
		case "X":
		case "Y":
			return "9";

		default:
			return letra;
		}
	}

}
