import java.util.Scanner;

public class Chocolate {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int result;
		while (sc.hasNext()) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			result = (a * b) - 1;
			System.out.println(result);
		}
	}
}