import java.util.Scanner;

public class ChefAndChapters {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int i = 0; i < t; i++) {
			int x = sc.nextInt(), y = sc.nextInt(), z = sc.nextInt();
			int res = x*y*z;
			System.out.println(res);
		}
	}

}
