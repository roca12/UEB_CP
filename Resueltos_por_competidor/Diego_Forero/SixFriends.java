import java.util.Scanner;

public class SixFriends {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int i = 0; i < t; i++) {
			int x = sc.nextInt(), y = sc.nextInt();
			if (x*3 < y*2 || x*3 == y*2) {
				System.out.println(x*3);
			} else if (y*2 < x*3) {
				System.out.println(y*2);
			}
		}
	}

}
