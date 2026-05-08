import java.util.Scanner;

/*
 * Autor: [kjairoo]
 * Problema: [Equalizer]
 * Juez online: [Codeforce]
 * Veredicto: Accepted
 * URL: https://codeforces.com/problemset/problem/2217/A
*/

public class Equalizer {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int T = sc.nextInt();

        while (T-- > 0){

            int N = sc.nextInt();
            int K = sc.nextInt();

            int suma = 0;

            for (int i = 0; i < N; i++){
                suma += sc.nextInt();
            }

            if (suma % 2 == 1 || (N * K) % 2 == 0){
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }

        }
        
    }

}
