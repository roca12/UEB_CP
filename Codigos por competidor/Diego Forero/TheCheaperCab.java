import java.util.Scanner;

public class TheCheaperCab {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int i = 0; i < t; i++) {
			int x = sc.nextInt(), y = sc.nextInt();
			if (x < y) {
				System.out.println("FIRST");
			} else if (y < x) {
				System.out.println("SECOND");
			} else {
				System.out.println("ANY");
			}
		}
	}

}
