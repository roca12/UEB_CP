import java.util.Scanner;
/*
 * Autor: [Gina Buitrago]
 * Problema: [ Contando Velitas - v2]
 * Juez online: [OmegaUp]
 * Veredicto: Accepted
 * URL: [https://omegaup.com/arena/problem/Contando-velitas/]
 */
public class ContandoVelitasV2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n= sc.nextInt();
		int dia1= 3;
		int total=0;
		
		for (int i = 0; i < n; i++) {
		 total+= dia1;
		   dia1+=2;
		}
		System.out.println(total);
		
	}
}
