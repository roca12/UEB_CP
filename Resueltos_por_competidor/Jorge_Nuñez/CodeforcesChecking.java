import java.util.Scanner;
/*
 * Autor: [JorgeNuñez]
 * Problema: [Codeforces Checking]
 * Juez online: [Codeforce]
 * Veredicto: Accepted
 * URL: [https://codeforces.com/problemset/problem/1791/A]
 */
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int caso = sc.nextInt();
		String letra;
		String respuesta;
		for (int i = 0; i < caso; i++) {
			letra=sc.next();
			if(letra.contains("c")||letra.contains("o")||letra.contains("d")||letra.contains("e")||letra.contains("f")||letra.contains("r")||letra.contains("s")) {
				respuesta="yes";
			}else {
				respuesta="no";
			}
			System.out.println(respuesta);
		}
		

	}
}
