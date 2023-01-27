import java.util.ArrayList;
import java.util.Scanner;

public class Feynman {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> listar = new ArrayList<Integer>();
		int a = -1;
		int result;
		while (sc.hasNext() && a != 0) {
			a = sc.nextInt();
			result = (a * (a + 1) * ((2 * a) + 1)) / 6;
			if (a != 0) {
				listar.add(result);
			}
			if (a == 0) {
				for (Integer list : listar) {
					System.out.println(list.toString());
				}
			}
		}
	}
}