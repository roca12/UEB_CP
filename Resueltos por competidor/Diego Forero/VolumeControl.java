import java.util.Scanner;

public class VolumeControl {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int i = 0; i < t; i++) {
			int x = sc.nextInt(), y = sc.nextInt();
			if (x > y || x == y) {
				System.out.println(x-y);
			} else if (y > x) {
				System.out.println(y-x);
			}
		}
	}

}
