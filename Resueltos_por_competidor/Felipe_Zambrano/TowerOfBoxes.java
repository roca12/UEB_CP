/**
 * Autor: Felipe Zambrano
 * Problema: A. Tower of Boxes
 * Juez online: 
 * Veredicto: Accepted
 * URL: https://codeforces.com/problemset/problem/2203/A
 */
import java.util.Scanner;

public class TowerOfBoxes {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int casos = sc.nextInt();
        while (casos-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int d = sc.nextInt();
            int capacidad = d / m + 1;
            int torres = (n + capacidad - 1) / capacidad;
            System.out.println(torres);
        }
    }

}
