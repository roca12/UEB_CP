import java.util.Scanner;

/*
 * Autor: [kjairoo]
 * Problema: [Koshary]
 * Juez online: [Codeforce]
 * Veredicto: Accepted
 * URL: https://codeforces.com/problemset/problem/2227/A
*/

public class Koshary {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int T = sc.nextInt();

        while (T-- > 0){

            int X = sc.nextInt();
            int Y = sc.nextInt();

            if ((X % 2 == 1) && (Y % 2 == 1)){
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }
    }

}
