package ejercicios;

/*
 * Autor: Juan Andres Garcia
 * Problema: Boy or Girl
 * Juez online: Codeforces
 * Veredicto: Accepted
 * Url: https://codeforces.com/problemset/problem/236/A
 **/
import java.util.HashSet;
import java.util.Scanner;

public class Boy {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String user = sc.nextLine();
		char[] cantidad;
		
		cantidad = user.toCharArray();
		
		
		HashSet<Character> cantDistinta = new HashSet<Character>();
		
		for(char anashei : cantidad) {
			cantDistinta.add(anashei);
		}
			
		if(cantDistinta.size() % 2 == 0) {
			System.out.println("CHAT WITH HER!");
		}else {
			System.out.println("IGNORE HIM!");
		}
		
	}
}

//ANASHEI
