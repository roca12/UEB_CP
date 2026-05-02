/*
 * Autor: OtherSpanish
 * Problema: It All Went Sideways 
 * Juez online: Codeforces
 * Veredicto: Accepted
 * https://codeforces.com/contest/2227/problem/E
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class E_ItAllWentSideways {
    public static void main(String[] args) throws IOException {

        // lectura rapida de datos
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // construir respuesta
        StringBuilder sb = new StringBuilder();
        // cantidad de test cases
        int t = Integer.parseInt(br.readLine());

        for (int k = 0; k < t; k++) {
            // tamaño del array
            int n = Integer.parseInt(br.readLine());
            // dividir input en tokens
            StringTokenizer st = new StringTokenizer(br.readLine());

            // arreglo principal
            long[] arr = new long[n];
            // suma total de elementos
            long tot = 0;
            // llenar arreglo y sumar
            for (int i = 0; i < n; i++) {
                arr[i] = Long.parseLong(st.nextToken());
                tot += arr[i];
            }

            // minimo de cada sufijo
            long[] minSufix = new long[n];
            // el ultimo elemento es su propio minimo
            minSufix[n - 1] = arr[n - 1];
            // llenar de derecha a izquierda
            for (int i = n - 2; i >= 0; i--) {
                // menor entre el actual y el minimo del siguiente
                minSufix[i] = Math.min(arr[i], minSufix[i + 1]);
            }

            // suma acumulada de los minimos de sufijo
            // representa cuantos cubos NO se mueven
            long[] sumSufix = new long[n + 1];
            // llenar de derecha a izquierda
            for (int i = n - 1; i >= 0; i--) {
                // acumular minimo actual mas suma del siguiente
                sumSufix[i] = sumSufix[i + 1] + minSufix[i];
            }

            // sin operacion: movidos = total - los que no se mueven
            long ans = tot - sumSufix[0];

            // cuantas posiciones consecutivas a la izquierda es minimo cada elemento
            long[] alc = new long[n];
            // pila para calcular ese alcance
            Deque<Integer> pila = new ArrayDeque<>();
            // recorrer de izquierda a derecha
            for (int i = 0; i < n; i++) {
                // sacar elementos mayores o iguales al actual
                while (!pila.isEmpty() && arr[pila.peek()] >= arr[i]) {
                    pila.pop();
                }
                // limite izquierdo: inicio si pila vacia, si no justo despues del tope
                int limiteIzq = pila.isEmpty() ? 0 : pila.peek() + 1;
                // alcance desde el limite hasta la posicion actual
                alc[i] = i - limiteIzq + 1;
                // guardar posicion actual
                pila.push(i);
            }

            // probar reducir cada posicion y quedarse con el mejor resultado
            for (int i = 0; i < n; i++) {
                // no se puede reducir si ya es cero xddd
                if (arr[i] == 0)
                    continue;

                // nuevo valor de cubos que no se mueven tras la reducción
                long newSumSufix;

                // si es el minimo del sufijo, reducirlo libera tantas posiciones como su alcance
                if (arr[i] == minSufix[i]) {
                    newSumSufix = sumSufix[0] - alc[i];
                } else {
                    // si no es el minimo del sufijo, no cambia nada
                    newSumSufix = sumSufix[0];
                }

                // total menos uno por el cubo eliminado, menos los que no se mueven
                long candid = (tot - 1) - newSumSufix;
                // actualizar si es mejor
                ans = Math.max(ans, candid);
            }

            // el hijueputa presentation me tiene absolutamente mamado
            sb.append(ans).append("\n");
        }

        // imprimir todo 
        System.out.print(sb);
    }
}
