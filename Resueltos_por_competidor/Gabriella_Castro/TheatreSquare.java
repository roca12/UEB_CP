/*
 * Autor: Gabriella Castro
 * Problema: Theatre Square
 * Juez online: Codeforces
 * Veredicto: Accepted
 * URL: https://codeforces.com/problemset/problem/1/A
 */

import java.util.Scanner;

public class TheatreSquare {
	
    public static void main(String[] args) {
    	
    	
        Scanner sc = new Scanner(System.in);
        
        long n = sc.nextLong();
        
        long m = sc.nextLong();
        
        long a = sc.nextLong();
        
        long losasLargo = (n + a - 1) / a;
        long losasAncho = (m + a - 1) / a;
        
        System.out.println(losasLargo * losasAncho);
    }
}
