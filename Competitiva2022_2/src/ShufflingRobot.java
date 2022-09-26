import java.util.Arrays;
import java.util.Scanner;

public class ShufflingRobot {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cards = sc.nextInt();
		int[] mazo = new int[53];
		while (cards != 0) {
			int[] compare = fill();
			for (int i = 0; i < cards; i++) {
				mazo[i] = sc.nextInt();
			}
			if (Arrays.equals(mazo, compare)) {
				System.out.println(0);
			} else {
				int[] copy = fill();
				int cont = 0;
				while (!Arrays.equals(mazo, compare)) {
					for (int i = 0; i < cards; i++) {
						copy[i] = compare[mazo[i] - 1];
					}
					compare = copy;
					cont++;
				}
				System.out.println(cont);
			}
			cards = sc.nextInt();
		}
	}

	static public int[] fill() {
		int[] mazo = new int[53];
		for (int i = 0; i < mazo.length; i++) {
			mazo[i] = i + 1;
		}
		return mazo;
	}

}
