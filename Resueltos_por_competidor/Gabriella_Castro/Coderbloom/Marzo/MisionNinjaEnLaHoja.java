import java.util.Scanner;

public class MisionNinjaEnLaHoja {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] R = new int[3];
        for (int i = 0; i < 3; i++) R[i] = sc.nextInt();

        int[] D = new int[3];
        for (int i = 0; i < 3; i++) D[i] = sc.nextInt();

        int maxRyo = 0;

        int[][] permutaciones = {
            {0, 1, 2}, {0, 2, 1}, {1, 0, 2},
            {1, 2, 0}, {2, 0, 1}, {2, 1, 0}
        };

        for (int[] p : permutaciones) {
            int ryoActual = 0;
            for (int i = 0; i < 3; i++) {
                ryoActual += calcularRyo(R[i], D[p[i]]);
            }
            if (ryoActual > maxRyo) {
                maxRyo = ryoActual;
            }
        }

        System.out.println(maxRyo);
    }

    public static int calcularRyo(int rango, int dificultad) {
        if (rango == 1 && dificultad <= 2) {
            return rango * dificultad;
        } else if (rango == 2 && dificultad <= 3) {
            return rango * dificultad;
        } else if (rango == 3) {
            return rango * dificultad;
        } else {
            return 0;
        }
    }
}