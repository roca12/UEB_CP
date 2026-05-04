import java.util.Arrays;
import java.util.Scanner;

public class Main {
  /*
	 * Autor: mariana 
	 * Problema : Counting Sort
	 * Juez online: omegaUp
	 * Veredicto: 66.67%
	 * URL:https://omegaup.com/arena/problem/Counting-Sort/
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] numeritos = new int[n];
		for (int i = 0; i < numeritos.length; i++) {
			numeritos[i] = sc.nextInt();
		}

		Arrays.sort(numeritos);

		for (int i = 0; i < numeritos.length; i++) {
			System.out.print(numeritos[i] + " ");
		}
		System.out.println();
    int aux = 0;
		for (int i = 0; i < numeritos.length; i++) {
      aux = 0;
			for (int j = 0; j < i; j++) {
				if (numeritos[i] > numeritos[j]) {
					aux++;
				}
			}
			System.out.print(aux + " ");
		}
		System.out.println();
	}
}
