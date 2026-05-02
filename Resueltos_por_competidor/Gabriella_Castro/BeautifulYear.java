/*
 * Autor: Gabriella Castro
 * Problema: Beautiful Year
 * Juez online: Codeforces
 * Veredicto: Accepted
 * URL: https://codeforces.com/problemset/problem/271/A
 */

import java.util.Scanner;

public class BeautifulYear {
    public static void main(String[] args) {
    	
        Scanner sc = new Scanner(System.in);
        
        int anio = sc.nextInt();
        
        while (true) {
            anio++;
            
            int a = anio / 1000;          
            int b = (anio / 100) % 10;    
            int c = (anio / 10) % 10;     
            int d = anio % 10;            
            
            if (a != b && a != c && a != d && b != c && b != d && c != d) {
                System.out.println(anio);
                break;
            }
        }
        
    }
}
