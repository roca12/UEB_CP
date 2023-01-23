import java.util.Scanner;

public class ChefAndMasks {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int i = 0; i < t; i++) {
			int x = sc.nextInt(), y = sc.nextInt();
			if (x*100 < y*10) {
				System.out.println("DISPOSABLE");
			} else if (y*10 < x*100 || y*10 == x*100) {
				System.out.println("CLOTH");
			}
		}
	}

}
