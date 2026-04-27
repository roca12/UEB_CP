import java.util.Scanner;

public class Divisores {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int i = 0; i < t; i++) {
			int a = sc.nextInt(), b = sc.nextInt();
			a = a-1;
			int auxa, auxb;
			if (a % 3 != 0) {
				auxa = (a / 3) + 1;
			} else {
				auxa = a / 3;
			}
			
			if (b % 3 != 0) {
				auxb = (b / 3) + 1;
			} else {
				auxb = b / 3;
			}
			
			auxa = a - auxa;
			auxb = b - auxb;
			
			System.out.println("Case "+(i+1)+": "+(auxb-auxa));
		}
	}

}
