package codechef;

import java.util.Scanner;

public class Xd {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int temperatura;
		int casos;
		casos=sc.nextInt();
		for (int i = 0; i <= casos; i++) {
			temperatura=sc.nextInt();
			if (temperatura>98) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		}
		}
}
