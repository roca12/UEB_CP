package Comp1;
import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		for (int i = 0; i < t; i++) {
			
			int a = sc.nextInt(), b = sc.nextInt(), x = sc.nextInt(), y = sc.nextInt();
			
			if ((x * y) >= (a * b)) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
			
		}

	}

}
