package ClasificaroriaNacional;

import java.util.Scanner;

public class ParenthesesBalance {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		sc.nextLine();
		for (int i = 0; i < t; i++) {
			String line = sc.nextLine();
			char[] aux = line.toCharArray();
			int x = 0, y = 0;
			boolean cond = true;
			for (int j = 0; j < aux.length; j++) {
				if (aux.length < 2 || aux.length%2 != 0) {
					cond = false;
					break;
				}
				if (aux[j] == '(' && x >= 0 && j+1 < aux.length && aux[j+1] != ']') {
					x++;
				} else if (aux[j] == ')' && x > 0) {
					x--;
				} else if (aux[j] == '[' && y >= 0 && j+1 < aux.length && aux[j+1] != ')') {
					y++;
				} else if (aux[j] == ']' && y > 0) {
					y--;
				} else {
					cond = false;
					break;
				}
			}
			if (cond == true && x == 0 && y == 0) System.out.println("Yes");
			else System.out.println("No");
		}
	}

}
