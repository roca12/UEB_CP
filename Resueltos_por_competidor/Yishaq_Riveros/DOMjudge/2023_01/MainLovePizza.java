package co.edu.unbosque;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainLovePizza {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		//clase envoltoria 
		int entradas = Integer.parseInt(br.readLine());
		for (int i = 0; i < entradas; i++) {
			String linea = br.readLine();
			int cont_m=0, cont_a = 0, cont_r = 0, cont_g = 0, cont_i = 0, cont_t = 0;
			//iterar o pasar por todos los caracteres
			for (int j = 0; j < linea.length(); j++) {
				if (linea.charAt(j)=='M') {
					cont_m ++;
				}else if (linea.charAt(j)=='A') {
					cont_a ++;
				}else if (linea.charAt(j)=='R') {
					cont_r ++;
				}else if (linea.charAt(j)=='G') {
					cont_g ++;
				}else if (linea.charAt(j)=='I') {
					cont_i ++;
				}else if (linea.charAt(j)=='T') {
					cont_t ++;
				}	
			}	
			//contabilizar el minimo
			int minimo = Math.min(cont_m, Math.min(cont_a/3, Math.min(cont_r/2,Math.min(cont_g, 
					Math.min(cont_i, cont_t)))));
			System.out.println(minimo);
		}
	}

}
