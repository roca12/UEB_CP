import java.util.Scanner;

/*
 * Autor: [kjairoo]
 * Problema: [Right Maximum]
 * Juez online: [Codeforce]
 * Veredicto: Accepted
 * URL: https://codeforces.com/problemset/problem/2204/B
*/

public class RightMaximum {


    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {


        int T = sc.nextInt();

        while (T-- > 0){

            int N = sc.nextInt();
            int operaciones = 0;
            int mayor = 0;

            for (int i = 0; i < N; i++){
                int X = sc.nextInt();


                if (X >= mayor){
                    mayor = X;
                    operaciones++;
                }

            }
        System.out.println(operaciones);
    }
}

}

