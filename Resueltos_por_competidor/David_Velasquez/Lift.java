/*
 * Autor: DavsAlejo
 * Problema: Lift
 * Juez online: LigthOJ
 * Veredicto: Accepted
 * https://lightoj.com/problem/lift
 */

import java.util.Scanner;

public class Main {
	static Scanner src = new Scanner(System.in);

	public static void main(String[] args) {
		
		int T = src.nextInt();
	    String salida = "";

		for (int i = 1; i <= T; i++) {

			int piso = src.nextInt();
			int pisoDeAscensor = src.nextInt();

			int total = Math.abs(pisoDeAscensor-piso) * 4 + (piso*4) + 19 ;
			
			salida += "Case " + i + ":" + " " + total+"\n";
			
			
		}
		
		System.out.print(salida);
		

	}

}
