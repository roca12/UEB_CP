import java.util.Scanner;

//1
/*
 * Autor: [kjairoo]
 * Problema: [Watermelon]
 * Juez online: [Codeforce]
 * Veredicto: Accepted
 * URL: [https://codeforces.com/problemset/problem/4/A]
*/
public class watermelon {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int w = sc.nextInt();

        if (w > 2 && w % 2 == 0){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }

}
