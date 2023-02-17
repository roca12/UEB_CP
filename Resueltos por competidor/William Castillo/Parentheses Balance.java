import java.text.DecimalFormat;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int casos = sc.nextInt();
		sc.nextLine();
		for (int i = 0; i < casos; i++) {
			String linea = sc.nextLine();
			while (linea.contains("()") || linea.contains("[]")) {
				linea = linea.replace("()", "");
				linea = linea.replace("[]", "");
			}

			if (linea.length() != 0) {
				System.out.println("No");
			} else {
				System.out.println("Yes");
			}
		}
	}
}
