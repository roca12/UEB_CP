import java.util.Scanner;
import java.util.TreeMap;

public class P487_3279 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	
		int t = sc.nextInt();
		sc.nextLine();
		for (int i = 0; i < t; i++) {
			TreeMap<String, Integer> map = new TreeMap<>();
			sc.nextLine();
			int nums = sc.nextInt();
			sc.nextLine();
			for (int j = 0; j < nums; j++) {
				String numA = sc.nextLine();
				numA = numA.replaceAll("[^A-Z0-9]", "");
				String conv = "";
				for (int k = 0; k < numA.length(); k++) {
					if (k == 3) {
						conv += "-";
					}
					conv += convert(numA.charAt(k) + "");
				}
				if (map.containsKey(conv)) {
					int aux = map.get(conv);
					map.put(conv, aux + 1);
				} else {
					map.put(conv, 1);
				}

			}
			boolean nrep=false;
			for (String s : map.keySet()) {
				if (map.get(s) > 1) {
					System.out.println(s + " " + map.get(s));
					nrep=true;
				}
			}
			if (!nrep) {
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