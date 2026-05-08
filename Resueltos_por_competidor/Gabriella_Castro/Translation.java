/*
 * Autor: Gabriella Castro
 * Problema: Translation
 * Juez online: Codeforces
 * Veredicto: Accepted
 * URL: https://codeforces.com/problemset/problem/41/A
 */

import java.util.Scanner;

public class Translation {
  
    public static void main(String[] args) {
      
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        String t = sc.next();

        StringBuilder sb = new StringBuilder(s);
        String sInvertida = sb.reverse().toString();

        if (sInvertida.equals(t)) {
        	
            System.out.println("YES");
            
        } else {
        	
            System.out.println("NO");
        }
        
    }
}
