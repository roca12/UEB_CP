import java.util.Scanner;

/*
	 * Autor: [Gina Buitrago]
	 * Problema: [ Esferas del Dragon]
	 * Juez online: [OmegaUp]
	 * Veredicto: Accepted
	 * URL: [https://omegaup.com/arena/CB032026I/#problems/esferas-del-dragon-cb]
	 */
public class EsferasDelDragon {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a;
        a=sc.nextInt();
        int contador=0;

        for (int i = 0; i < a; i++) {
            int b=sc.nextInt();
                if(b>=1 && b<=7) {
                    contador++;
            }
        }    System.out.println(contador);



    }

}
