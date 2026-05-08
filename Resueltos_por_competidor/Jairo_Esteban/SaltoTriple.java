import java.util.Scanner;
//CCPL v
/*
 * Autor: [kjairoo]
 * Problema: [Salto Triple A]
 * Juez online: [Kattis]
 * Veredicto: Accepted
*/
public class Main2 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		int n = sc.nextInt();

		int[] d = new int[n];

		for (int i = 0; i < n; i++) {

			d[i] = sc.nextInt();
		}

		int dato1 = d[0] / 3;

		int dato2 = d[1] - 2 * dato1;

		int dato3 = d[n - 1] / 3;

		System.out.println(dato1 + " " + dato2 + " " + dato3);

	}

}
