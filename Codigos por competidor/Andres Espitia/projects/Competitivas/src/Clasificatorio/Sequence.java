package Clasificatorio;


import java.util.Scanner;

public class Sequence {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		sc.nextLine();
		
		for(int caso = 1; caso<=t; caso++) {
			int menor = sc.nextInt();
			int mayor = sc.nextInt();
			int contador = 0;
			int comp = 0;
			
			for(int i=1; i<menor; i++) {
				int auxi = i;
				while(auxi>=1) {
					int aux = auxi%10;
					auxi /=10;
					comp += aux;
				}
			}
		
			for(int i=menor; i<=mayor; i++) {
				int auxi = i;
				while(auxi>=1) {
					int aux = auxi%10;
					auxi /=10;
					comp += aux;
				}
				
				if(comp%3==0) {
					contador++;
				}
			}
			
			System.out.println("Case "+caso+": "+contador);
			
		}
	}
	
}
