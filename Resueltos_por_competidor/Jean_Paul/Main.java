import java.util.Random;
import java.util.Scanner;

public class Main {
	static int num;
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		int t = sc.nextInt();
		int n;
		for(int i = 0; i < t; i++) {
			n = sc.nextInt();
			a(n);
		}
	}
	
	static void a(int n) {
		String respuesta = "";
		for (int i = 0; i < n; i++) {
			num = new Random().nextInt(1000000)+1;
			respuesta += num + " "; 
		}
		System.out.println(respuesta);
	}
	
	/**
	 * Autor: Jean Paul
	 * Problema: A. Perfect Root
	 * Juez online: Polygon 
	 * Veredicto: AC
	 * URL: https://codeforces.com/problemset/problem/2185/A
	 */
}
