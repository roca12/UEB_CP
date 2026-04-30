/*
 * Autor: Gabriella Castro
 * Problema: Ordenando En Cubetas
 * Juez online: OmegaUp
 * Veredicto: Accepted / Correct / Yes / Ok
 * URL: https://omegaup.com/arena/problem/Ordenando-en-cubetas/
 */

import java.util.Scanner;

public class OrdenandoEnCubetas {
    
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        int[] cubetas = new int[m + 1];
        
        for(int i = 0; i < n; i++) {
            int colorPelota = sc.nextInt();
            if (colorPelota <= m) {
                cubetas[colorPelota]++;
            }
        }
        
        for(int i = 1; i <= m; i++) {
            System.out.println(i + " : " + cubetas[i]);
        }
        
    }
}
