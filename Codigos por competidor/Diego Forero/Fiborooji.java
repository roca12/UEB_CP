import java.util.ArrayList;
import java.util.Scanner;

public class Fiborooji {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt(), y = sc.nextInt();
		int x2 = x, y2 = y, aux = 0;
		ArrayList<Integer> cadena = new ArrayList<Integer>();
		cadena.add(x);
		cadena.add(y);
		while (true) {
			aux = (x2+y2)%10;
			cadena.add(aux);
			x2 = y2;
			y2 = aux;
			if (x2 == x && y2 == y) {
				break;
			}
		}
		System.out.println(cadena.size());
	}

}
