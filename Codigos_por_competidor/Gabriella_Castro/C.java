package co.edu.unbosque.main;

import java.util.Scanner;

public class C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); 

        for (int i = 0; i < T; i++) {
            int k1 = sc.nextInt();
            int k2 = sc.nextInt();
            int k3 = sc.nextInt();

            if (k1 == k2) {
                System.out.println(k3);
            } else if (k1 == k3) {
                System.out.println(k2);
            } else {
                System.out.println(k1);
            }
        }

        sc.close();
    }
}