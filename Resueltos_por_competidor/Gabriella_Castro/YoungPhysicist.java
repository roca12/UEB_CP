/*
 * Autor: Gabriella Castro
 * Problema: Young Physicist
 * Juez online: Codeforces
 * Veredicto: Accepted
 * URL: https://codeforces.com/problemset/problem/69/A
 */


import java.util.Scanner;

public class YoungPhysicist {
  
    public static void main(String[] args) {
      
        Scanner sc = new Scanner(System.in);
        
        if (sc.hasNextInt()) {
            int n = sc.nextInt();
            
            int totalX = 0;
            int totalY = 0;
            int totalZ = 0;
            
            for (int i = 0; i < n; i++) {
                totalX += sc.nextInt();
                totalY += sc.nextInt();
                totalZ += sc.nextInt();
            }
            
            if (totalX == 0 && totalY == 0 && totalZ == 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
