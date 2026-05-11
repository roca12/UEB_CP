/*
 * Autor: natar2005
 * Problema: Histogram
 * Juez online: LightOJ
 * Veredicto: Accepted
 * URL: https://lightoj.com/problem/histogram/
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Histogram{

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());

        for (int caso = 1; caso <= t; caso++) {
            int n = Integer.parseInt(br.readLine().trim());
            String[] dividida = br.readLine().trim().split(" ");
            int[] alturas = new int[n + 1]; 

            for (int i = 0; i < n; i++) {
                alturas[i] = Integer.parseInt(dividida[i]);
            }
            alturas[n] = 0; 

            Stack<Integer> pila = new Stack<>();
            long areaMax = 0;

            for (int i = 0; i <= n; i++) {
                while (!pila.isEmpty() && alturas[i] < alturas[pila.peek()]) {
                    int alto = pila.pop();
                    long ancho = (pila.isEmpty() ? i : i - pila.peek() - 1);
                    areaMax = Math.max(areaMax, alturas[alto] * ancho);
                }
                pila.push(i);
            }

            System.out.println("Case " + caso + ": " + areaMax);
        }
    }
}