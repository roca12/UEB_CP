package co.edu.unbosque.main;

import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int[] freq = new int[m + 2]; 

        for (int i = 0; i < n; i++) {
            freq[a[i]]++;
        }

        for (int i = m; i >= 1; i--) {
            freq[i] += freq[i + 1];
        }

        for (int i = 1; i <= m; i++) {
            System.out.print(freq[i]);
            if (i < m) {
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}
