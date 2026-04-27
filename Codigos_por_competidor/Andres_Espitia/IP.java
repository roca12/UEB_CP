package Clasificatorio;

import java.util.Scanner;

public class IP {
	
	static int binarioADecimal(String bin) {
		int dec = 0;
		int base = 2;
		int pot = 0;
		for(int i=bin.length()-1; i>=0; i--) {
			if(bin.charAt(i)=='1') {
				dec = dec + (int) Math.round(Math.pow(base,  pot));
			}
			pot++;
		}
		return dec;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int casos = sc.nextInt();
		sc.nextLine();
		
		for(int cas = 1; cas <= casos; cas++) {
		
			String dec = sc.nextLine();
			String decimal[] = dec.split("\\.");
			
			String bin = sc.nextLine();
			String binario[] = bin.split("\\.");
			
			boolean igual = false;
			
			for(int i=0; i<4; i++) {
				if(decimal[i].equals(""+binarioADecimal(binario[i]))) {
					igual = true;
				}else {
					igual = false;
					break;
				}
			}
			
			if(igual) {
				System.out.println("Case "+cas+": Yes");
			}else {
				System.out.println("Case "+cas+": No");
			}
	}
	}
}
