package co.edu.unbosque;

import java.util.Scanner;

public class MainSumando {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // número de casos de prueba
        for (int i = 1; i <= t; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();
            int suma = a + b + c + d;
            System.out.println(suma);
        }
        sc.close();
    }
}
