package Clasificatorio;

import java.util.Scanner;

public class DecodeTape {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numeros[] = {0,0,64,32,16,8,0,4,2,1,0};
		String leer, imprimir = "";
		while(sc.hasNext()){
			leer = sc.nextLine();
			int aux = 0;
			
			if(leer.charAt(0)!='|'){
				continue;
			}
			
			for(int i=2; i<=9; i++){
				if(leer.charAt(i)=='o'){
					aux += numeros[i];
				}
			}
			imprimir += (char)aux;			
		}
		System.out.println(imprimir);
	}
}
