/*
* Autor: DavsAlejo
* Problema: A. Sleuth
* Juez Online: Codeforces
* Veredicto: Accepted
* URL: https://codeforces.com/contest/49/problem/A
*/

import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner (System.in);
	public static void main(String[] args) {
		
		String mensaje = sc.nextLine();
		String mensajeLimpio = mensaje.replaceAll("[\\P{L}]+$", "").toLowerCase();
		if(mensajeLimpio.endsWith("a") || mensajeLimpio.endsWith("e") ||  
				mensajeLimpio.endsWith("i") || mensajeLimpio.endsWith("o") || 
				mensajeLimpio.endsWith("u") || mensajeLimpio.endsWith("y")) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}

	}

}
