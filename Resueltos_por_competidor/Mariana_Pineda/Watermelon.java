import java.util.Scanner;

public class Main {
	/*
	 * Autor: mariana 
	 * Problema : Watermelon 
	 * Juez online: OmegaUp
	 * Veredicto: Accepted 
	 * URL: https://omegaup.com/arena/problem/Watermel/
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if (n % 2 == 0 && n > 2) {
			System.out.println("SI");
		} else {
			System.out.println("NO");
		}
	}
}
