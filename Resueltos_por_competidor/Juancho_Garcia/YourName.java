package ejercicios;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class YourName {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		
		StringBuilder salida = new StringBuilder();
		for(int i = 1; i <= t; i++) {
			int n = sc.nextInt();
			sc.nextLine();
			
			String a = sc.next();
			String b = sc.next();
			
			char[] acant = a.toCharArray();
			char[] bcant = b.toCharArray();
			
			Arrays.sort(acant);
			Arrays.sort(bcant);
			
			System.out.println(acant);
			System.out.println(bcant);
			
		
			
			
			if( !Arrays.equals(acant, bcant) ) {
				salida.append("NO\n");
			} else {
				salida.append("YES\n");
			}
			
		}
		System.out.println(salida.toString());
	}
}
