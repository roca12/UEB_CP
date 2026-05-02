/*
 * Autor: OtherSpanish
 * Problema: Fibonacci Freeze 495
 * Juez online: UVA
 * Veredicto: Accepted
 * https://onlinejudge.org/index.php?option=com_onlinejudge&Itemid=8&category=24&page=show_problem&problem=436
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Fibonacci {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // Lectura rápida de datos

        // Precalcular todos los fibonacci hasta 5000
        // Se usa BigInteger porque F(5000) tiene mas de 1000 digitos, supera el limite de long
        BigInteger[] fib = new BigInteger[5001];
        fib[0] = BigInteger.ZERO; // Caso base F(0) = 0
        fib[1] = BigInteger.ONE;  // Caso base F(1) = 1
        for (int i = 2; i <= 5000; i++) {
            fib[i] = fib[i - 1].add(fib[i - 2]); // F(i) = F(i-1) + F(i-2)
        }

        String linea;
        while ((linea = br.readLine()) != null) { // Se lee hasta fin de archivo
            linea = linea.trim();
            if (linea.isEmpty()) continue; // Se ignoran lineas vacias

            int n = Integer.parseInt(linea); // Se lee el indice pedido
            System.out.println("The Fibonacci number for " + n + " is " + fib[n]); // Print resultado
        }
    }
}
