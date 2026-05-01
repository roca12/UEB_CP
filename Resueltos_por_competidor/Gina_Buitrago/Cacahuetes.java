import java.util.Scanner;
/*
	 * Autor: [Gina Buitrago]
	 * Problema: [Cacahuates]
	 * Juez online: [OmegaUp]
	 * Veredicto: Accepted
	 * URL: [https://omegaup.com/arena/CB032026I/#problems/cacahuates]
	 */
public class Cacahuates {

	public static void main(String[] args) {
		   Scanner sc = new Scanner(System.in);
	        int a;
	        a=sc.nextInt();
	        int contador=0;
	        int maximo=Integer.MIN_VALUE;

	        for (int i = 0; i < a; i++) {
	            int b=sc.nextInt();
	               if(b>maximo) {
	                   maximo=b;
	                   contador=1;
	               }
	               else if(b==maximo) {
	               contador ++;
	               }
	            }System.out.println(maximo + " "+ contador);
	    
	}

}
