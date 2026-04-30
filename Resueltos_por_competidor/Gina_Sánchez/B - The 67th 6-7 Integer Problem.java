/*
 * Autor: Gina Sofia Sánchez Estupiñan
 * Problema: B - The 67th 6-7 Integer Problem
 * Juez online: Codeforces
 * Veredicto: Accepted
 * URL: https://codeforces.com/contest/2218/problem/B
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            String[] nStr = br.readLine().trim().split("\\s+");
            int[] nums = new int[7];
            int sumNegados = 0;

            for (int j = 0; j < 7; j++) {
                nums[j] = Integer.parseInt(nStr[j]);
                sumNegados -= nums[j];
            }

            int mejor = Integer.MIN_VALUE;
            for (int j = 0; j < 7; j++) {
                int candidato = sumNegados + 2 * nums[j];
                mejor = Math.max(mejor, candidato);
            }

            System.out.println(mejor);
        }
    }
}