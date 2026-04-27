package co.edu.unbosque;

import java.util.Scanner;

public class MainIdentifyngTea {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		while (sc.hasNext()) {
			int t= sc.nextInt();
			int c1, c2, c3, c4, c5;
			c1=sc.nextInt();
			c2=sc.nextInt();
			c3=sc.nextInt();
			c4=sc.nextInt();
			c5=sc.nextInt();
			int contador=0;
			//condicionales
			if(c1==t) {
				contador++;
			}
			if(c2==t) {
				contador++;
			}
			if(c3==t) {
				contador++;
			}
			if(c4==t) {
				contador++;
			}
			if(c5==t) {
				contador++;
			}
			
			System.out.println(contador);
		}
	}

}
