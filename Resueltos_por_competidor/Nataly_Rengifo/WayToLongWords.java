/*
 * Autor: natar2005
 * Problema: Way To Long Words 
 * Juez online: Codeforces
 * Veredicto: Accepted
 * URL: https://codeforces.com/problemset/problem/71/A
 */
import java.util.Scanner;

public class WayToLongWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine(); 

        for (int i = 0; i < n; i++) {
            String palabra = sc.nextLine();
            
            if (palabra.length() > 10) {
                
                int longPrimUlt = palabra.length() - 2; 
                String abrev = "" + palabra.charAt(0) + longPrimUlt + palabra.charAt(palabra.length() - 1);
                System.out.println(abrev);
            } else {
                
                System.out.println(palabra);
            }
        }

    }
}