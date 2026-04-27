package CompDom;

import java.util.Scanner;

public class SaludoDom {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		sc.nextLine();
		for (int i = 0; i < t; i++) {
			String name = sc.nextLine();
			System.out.println("Hello "+name+"!");
		}
	}

}
