package Comp1;
import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		for (int i = 0; i < t; i++) {
			
			int x = sc.nextInt(), y = sc.nextInt();
			
			if (x < y) {
				System.out.println("BIKE");
			} else if (y < x) {
				System.out.println("CAR");
			} else if (x == y) {
				System.out.println("SAME");
			}
			
		}

	}

}
