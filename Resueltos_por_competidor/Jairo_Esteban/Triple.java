import java.util.Scanner;

/*
 * Autor: [kjairoo]
 * Problema: [Triple]
 * Juez online: [Codeforce]
 * Veredicto: Accepted
 * URL: https://codeforces.com/problemset/problem/1669/B
*/
public class Triple {

    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        int  t  = sc.nextInt();

        while (t-- > 0){

            int n = sc.nextInt();
            int[] aparece = new int[n + 1];
            int respuesta = -1;

            for (int i  = 0; i < n; i++){
                int x = sc.nextInt();
                aparece[x]++;

                if(aparece[x] >= 3){
                    respuesta = x;

                }
            }

            System.out.println(respuesta);

        }
        
    }

}
