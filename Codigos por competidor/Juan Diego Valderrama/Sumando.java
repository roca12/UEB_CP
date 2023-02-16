import java.util.Scanner;

public class Sumando {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int cases = sc.nextInt();
		int sum = 0;
		for (int i = 0; i < cases; i++) {
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();
			int num3 = sc.nextInt();
			int num4 = sc.nextInt();
			sum = num1 + num2 + num3 + num4;
			System.out.println(sum);
		}
	}
}
