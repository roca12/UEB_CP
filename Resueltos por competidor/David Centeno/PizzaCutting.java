package domjudgev2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while (true) {
			long t = sc.nextLong();
			if (t < 0) {
				break;
			} else {
				System.out.println((t * (t + 1) / 2) + 1);
			}
		}
	}

}
