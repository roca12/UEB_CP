/*
 * Autor: OtherSpanish
 * Problema: Koshary 
 * Juez online: Codeforces
 * Veredicto: Accepted
 * URL: https://codeforces.com/contest/2227/problem/A
 */
import java.util.Scanner;

public class A_Koshary {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); //Lectura de datos

		int tc = sc.nextInt(); //Lee test cases

		for (int i = 0; i < tc; i++) {
			//lee x & y - el plato de koshary
			int x = sc.nextInt(); 
			int y = sc.nextInt();
			
			/*
			 * Si ambos son impares NO se puede llegar usando unicamente
			 * (a+2, b) o (a, b+2) infinitas veces y
			 * (a+1, b) o (a, b+1) una unica vez
			 * desde (0,0)
			 * 
			 * Si algun número es par entonces si es posible
			 * */

			if (x%2!=0 && y%2!=0) {
				System.out.println("NO");
			} else {
			System.out.println("YES");	
			}
			
		}
	}

}
