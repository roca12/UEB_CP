import java.util.Scanner;

//2218A

//2

/*
 * Autor: [kjairoo]
 * Problema: [The 67th Integer Problem]
 * Juez online: [Codeforce]
 * Veredicto: Accepted
 * URL: [https://codeforces.com/problemset/problem/2218/A
*/
public class sixseveninteger {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int t = sc.nextInt();

        while (t-- > 0) {

            int x = sc.nextInt();

            if (x < 67) {
                System.out.println(x + 1);
            } else {
                System.out.println(x);
            }

        }

    }

}
