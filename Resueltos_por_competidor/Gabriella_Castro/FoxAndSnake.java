/*
 * Autor: Gabriella Castro
 * Problema: Fox and Snake
 * Juez online: Codeforces
 * Veredicto: Accepted
 * URL: https://codeforces.com/problemset/problem/510/A
 */

import java.util.Scanner;

public class FoxAndSnake {
	
    public static void main(String[] args) {
    	
        Scanner sc = new Scanner(System.in);
        
        if (sc.hasNextInt()) {
        	
            int n = sc.nextInt();
            int m = sc.nextInt();
            
            for (int i = 1; i <= n; i++) {
            	
                if (i % 2 != 0) {
                	
                    for (int j = 0; j < m; j++) {
                    	
                        System.out.print("#");
                    }
                } else {
                	
                    if (i % 4 == 0) {
                    	
                        System.out.print("#");
                        
                        for (int j = 0; j < m - 1; j++) {
                        	
                            System.out.print(".");
                        }
                    } else {
                    	
                        for (int j = 0; j < m - 1; j++) {
                        	
                            System.out.print(".");
                        }
                        
                        System.out.print("#");
                    }
                }
                System.out.println();
            }
        }
    }
}
