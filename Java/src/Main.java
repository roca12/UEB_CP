import java.util.HashMap;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.TreeMap;

class Main {

	public static void main(String[] args) {
		TreeMap<String, Double> diccionario = new TreeMap<String, Double>();
		Random r = new Random();
		for (int i = 0; i < 8; i++) {
			int num = 0;
			while (true) {
				num = r.nextInt(100);
				if (num < 40) {
					continue;
				} else {
					break;
				}
			}
			diccionario.put((char) num + "", r.nextGaussian());
		}

		diccionario.forEach((clave, valorasociado) -> {
			System.out.println(clave + "->" + valorasociado);
		});
		for (String o : diccionario.keySet()) {
			System.out.println(o+"->"+diccionario.get(o));
		}
	}
}
