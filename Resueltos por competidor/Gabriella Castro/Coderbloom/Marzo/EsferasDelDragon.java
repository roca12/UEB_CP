/*
Descripción
Bulma ha encontrado varias esferas en su radar, pero el dispositivo detecta cualquier objeto esférico. Las esferas del dragón auténticas son únicas porque siempre tienen entre 1 y 7 estrellas. Cualquier esfera con 0 estrellas o más de 7 es una imitación.

Entrada
En la primera línea un entero N que representa la cantidad de esferas que Bulma encontró. En el siguiente renglón, N números enteros separados por espacio, que representan el número de estrellas de cada objeto encontrado.

Salida
Un entero que representa la cantidad total de esferas que son auténticas (aquellas que tienen entre 1 y 7 estrellas, inclusive).
*/

import java.util.Scanner;

public class EsferasDelDragon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int N = scanner.nextInt();
        int contadorAutenticas = 0;
        
        for (int i = 0; i < N; i++) {
            int estrellas = scanner.nextInt();
            if (estrellas >= 1 && estrellas <= 7) {
                contadorAutenticas++;
            }
        }
        
        System.out.println(contadorAutenticas);
    }
}
