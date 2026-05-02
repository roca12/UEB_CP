import java.util.Scanner;
 /*
	 * Autor: Carlos Eduardo Cobaleda Moreno
	 * Problema: A. sum 1742A
	 * Juez online: CodeForces
	 * Veredicto: Accepted
	 * URL: https://codeforces.com/contest/1742/problem/A
	 */
public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		for (int i = 0; i < t; i++) {
			
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			
			if (a + b == c) {
				System.out.println("Yes");
			} else if(a + c == b) {
				System.out.println("Yes");
			} else if(b + c == a) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
			
			
		}
		
		
	}

}
