package a;

import java.util.Scanner;

public class Word {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.nextLine();
		int contadorUp = 0;
		int contadorLow = 0;
		for (int i = 0; i<s.length();i++) {
			String f = s.toUpperCase();
			if(s.charAt(i)==f.charAt(i)) {
				contadorUp++;
			}else {
				contadorLow++;
			}
		}
		
		if (contadorUp>contadorLow) {
			System.out.println(s.toUpperCase());
		}else {
			System.out.println(s.toLowerCase());
		}
		
	}
}
