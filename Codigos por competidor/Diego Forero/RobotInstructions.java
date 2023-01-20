package CompSolitario;

import java.util.Scanner;

public class RobotInstructions {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] instruc;
		int t = sc.nextInt();
		for (int i = 0; i < t; i++) {
			int cont = 0;
			int numinst = sc.nextInt();
			sc.nextLine();
			instruc = new String[numinst];
			for (int j = 0; j < numinst; j++) {
				String i1 = sc.nextLine();
				if (i1.contains("SAME")) {
					int op = Integer.parseInt(i1.split(" ")[2]);
					i1 = instruc[op-1];
				}
				instruc[j] = i1;
			}
			for (int j = 0; j < numinst; j++) {
				if (instruc[j].equals("LEFT")) {
					cont--;
				} else if (instruc[j].equals("RIGHT")) {
					cont++;
				}
			}
			System.out.println(cont);
		}
	}

}
