import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leer = new Scanner(System.in);
		int A = leer.nextInt();
		int B = leer.nextInt();
		int C = leer.nextInt();

		int min = A;
		if (B < min) {
			min = B;
		}
		if (C < min) {
			min = C;
		}
		int max = A;
		if (B > max) {
			max = B;
		}
		if (C > max) {
			max = C;
		}

		System.out.println(max - min);
		
	}
}
