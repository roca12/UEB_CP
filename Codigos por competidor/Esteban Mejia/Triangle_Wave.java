package pCompetiDOM;

import java.util.Scanner;

public class Triangle_Wave {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int cases = sc.nextInt();

        for (int a = 0; a < cases; a++) {

            System.out.println();
            int amplitud = sc.nextInt();
            int frecuencia = sc.nextInt();

            for (int i = 0; i < frecuencia; i++) {

                for (int j = 0; j <= amplitud; j++) {
                    for (int k = 0; k < j; k++) {
                        System.out.print(j);
                    }
                    System.out.println();
                }

                for (int j = amplitud - 1; j > 0; j--) {
                    for (int k = 0; k < j; k++) {
                        System.out.print(j);
                    }
                    System.out.println();
                }

            }
        }
    }
}




