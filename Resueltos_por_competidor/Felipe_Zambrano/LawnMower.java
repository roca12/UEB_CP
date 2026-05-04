/**
 * Autor: Felipe Zambrano
 * Problema: A. Lawn Mower
 * Juez online: 
 * Veredicto: Accepted
 * URL: https://codeforces.com/problemset/problem/2194/A
 */
import java.util.Scanner;

public class LawnMower {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextLong();
            long w = sc.nextLong();
            if (w > n) {
                System.out.println(n);
            } else {
                long mantener = n / w; 
                System.out.println(n - mantener);
            }
        }
    }
}