package CompDom;

import java.util.Scanner;
import java.util.TreeMap;

public class TelephoneNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		sc.nextLine();
		for (int i = 0; i < t; i++) {
			TreeMap<String, Integer> map = new TreeMap<String, Integer>();
			int t2 = sc.nextInt();
			sc.nextLine();
			for (int j = 0; j < t2; j++) {
				String aux = revisar(sc.nextLine());
				if (map.containsKey(aux)) {
					int num = map.get(aux);
					map.put(aux, num+1);
				} else {
					map.put(aux, 1);
				}
			}
			boolean cond = false;
			for (String s : map.keySet()) {
				if (map.get(s) > 1) {	
					cond = true;
					System.out.println(s + " " + map.get(s));
				}
			}
			if (!cond) System.out.println("No duplicates.");
			System.out.println();
		}
	}
	
	public static String revisar(String in) {
		in = in.replaceAll("-", "");
		String out = "";
		for (int i = 0; i < in.length(); i++) {
			if (i == 3) {
				out = out + "-";
			}
			if (in.charAt(i) == 'A' || in.charAt(i) == 'B' || in.charAt(i) == 'C') {
				out = out + "2";
			} else if (in.charAt(i) == 'D' || in.charAt(i) == 'E' || in.charAt(i) == 'F') {
				out = out + "3";
			} else if (in.charAt(i) == 'G' || in.charAt(i) == 'H' || in.charAt(i) == 'I') {
				out = out + "4";
			} else if (in.charAt(i) == 'J' || in.charAt(i) == 'K' || in.charAt(i) == 'L') {
				out = out + "5";
			} else if (in.charAt(i) == 'M' || in.charAt(i) == 'N' || in.charAt(i) == 'O') {
				out = out + "6";
			} else if (in.charAt(i) == 'P' || in.charAt(i) == 'R' || in.charAt(i) == 'S') {
				out = out + "7";
			} else if (in.charAt(i) == 'T' || in.charAt(i) == 'U' || in.charAt(i) == 'V') {
				out = out + "8";
			} else if (in.charAt(i) == 'W' || in.charAt(i) == 'X' || in.charAt(i) == 'Y') {
				out = out + "9";
			} else {
				out = out + in.charAt(i);
			}
		}
		return out;
	}

}
