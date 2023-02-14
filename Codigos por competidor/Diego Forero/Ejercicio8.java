package Comp1;
import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		for (int i = 0; i < t; i++) {
			
			int x = sc.nextInt(), y = sc.nextInt();
			int res = x/y;
			
			System.out.println(res);
			
		}

	}

}
