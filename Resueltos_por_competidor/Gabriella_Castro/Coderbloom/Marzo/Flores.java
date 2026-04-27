import java.util.Scanner;

public class Flores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int d = sc.nextInt();

        int[] cambios = new int[d + 2];

        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            cambios[a]++;
            cambios[b + 1]--;
        }

        int maxEspecies = 0;
        int especiesActuales = 0;

        for (int i = 1; i <= d; i++) {
            especiesActuales += cambios[i];
            
            if (especiesActuales > maxEspecies) {
                maxEspecies = especiesActuales;
            }
        }

        System.out.println(maxEspecies);
    }
}