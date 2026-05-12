/* Autor: Alejandra Carvajal
* Problema: Discovering Gold
* Juez online: LightOJ
* Veredicto: Accepted
* URL: https://lightoj.com/problem/discovering-gold
*/
import java.util.Scanner;

class Main {

    public static void main(String[] args) throws Exception {
       Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        int c = 1;
        
        while(c <= t){
            int n = sc.nextInt();
            
            int[] oro = new int[101];
            for(int o=1; o<=n; o++){
                oro[o] = sc.nextInt();
            }
            
            double[] prob = new double[101];
            prob[1] = 1.0;
            
           for (int i = 1; i < n; i++) {
                int cv = Math.min(6, n - i);
                    for (int j = 1; j <= cv; j++) {
                        prob[i + j] += prob[i] / cv;
                    }
            }
            
            double resultado = 0;
            for (int i = 1; i <= n; i++) {
                resultado += prob[i] * oro[i];
            }
            
            System.out.println("Case " + c + ": " + resultado);
            c++;
        }
    }
}
