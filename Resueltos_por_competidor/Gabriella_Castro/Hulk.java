/*
 * Autor: Gabriella Castro
 * Problema: Hulk
 * Juez online: Codeforces
 * Veredicto: Accepted / Correct / Yes / Ok
 * URL: https://codeforces.com/problemset/problem/705/A
 */

import java.util.Scanner;

public class Hulk {
    public static void main(String[] args) {
      
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        String resultado = "";
        String odio = "I hate";
        String amor = "I love";

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                resultado += odio;
            } else {
                resultado += amor;
            }

            if (i == n - 1) {
                resultado += " it";
            } else {
                resultado += " that ";
            }
        }

        System.out.println(resultado);
    }
}
