package ejercicios;


/*
 * Autor: Juan Andres Garcia
 * Problema: Lucky Division
 * Juez online: Codeforces
 * Veredicto: Accepted
 * Url: https://codeforces.com/problemset/problem/122/A
 *  **/
import java.util.Scanner;

public class LuckyNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int[] luckyNumbers = { 4, 7, 44, 47, 74, 77, 444, 447, 474, 477, 744, 747, 774, 777 };

		boolean esSuerte = false;

		for (int lucky : luckyNumbers) {
			if (number % lucky == 0) {
				esSuerte = true;
				break;
			}
		}
		
		if (esSuerte) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
	}
}