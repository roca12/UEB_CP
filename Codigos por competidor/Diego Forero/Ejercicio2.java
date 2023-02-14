package Comp1;
import java.util.Scanner;

public class Ejercicio2 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		for (int i = 0; i < t; i++) {
			
			int n = sc.nextInt();
			
			if (n % 4 == 0) {
				System.out.println("Good");
			} else {
				System.out.println("Not Good");
			}
			
		}
		
	}
	
}
