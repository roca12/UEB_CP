package CodeChef;

import java.util.Scanner;

public class Triangles {

	public static void main(String[] args) {
		{
			Scanner sc = new Scanner(System.in);
			int A = sc.nextInt();
			int B = sc.nextInt();
			
			int angulos = 180;
			int resultado = angulos-(A+B);
			
			System.out.print(resultado);
		}
	}
}