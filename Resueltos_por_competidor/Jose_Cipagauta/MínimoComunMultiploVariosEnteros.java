import java.util.Scanner;

/*
* Autor: JMCip
* Problema: Mínimo común múltiplo de varios enteros
* Juez Online: Omegaup
* Veredicto: Accepted
* URL: https://omegaup.com/arena/problem/Minimo-comun-multiplo-de-varios-/
*/

public class MínimoComunMultiploVariosEnteros {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		int tam = sc.nextInt();
		int[] n = new int[tam];

		for (int i = 0; i < n.length; i++) {
			n[i] = sc.nextInt();
		}

		int resultado = n[0];

		for (int i = 1; i < tam; i++) {
			int a = resultado;
		    int b = n[i];
		    
			while (b != 0) {
				int residuo = a % b;
		        a = b;
		        b = residuo;
			}	
			resultado = (resultado * n[i]) / a;
		}
		System.out.println(resultado);
	}
}
