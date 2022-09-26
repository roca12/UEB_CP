

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.00");
        int filas = 0;
        int colum = 0;
        
        System.out.println("Ingrese la cantidad de filas: ");
        filas = sc.nextInt();
        sc.nextLine();
        System.out.println("Ingrese la cantidad de columnas: ");
        colum = sc.nextInt();
        sc.nextLine();
        
        double[][] matriz = new double[filas][colum];
        
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < colum; j++) {
                System.out.println("Ingrese un numero decimal: ");
                matriz[i][j] = sc.nextDouble();
                sc.nextLine();
            }
        }
        
        System.out.println("Matriz");
        
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < colum; j++) {
                System.out.print(df.format(matriz[i][j])+" ");
            }
            System.out.println("");
        }
    }
}
