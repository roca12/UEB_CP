import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Pizza {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// lectura general
		// Scanner sc = new Scanner(System.in);
		// lectura rapida
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// clase envoltorio
		int entradas = Integer.parseInt(br.readLine());
		for (int i = 0; i < entradas; i++) {
			String linea = br.readLine();
			int cont_m = 0, cont_a = 0, cont_r = 0, cont_g = 0, cont_i = 0, cont_t = 0;
			// iterar o pasar por todos los caracteres
			for (int j = 0; j < linea.length(); j++) {
				if (linea.charAt(j) == 'M' || linea.charAt(j) == 'm') {
					cont_m++;
				} else if (linea.charAt(j) == 'A' || linea.charAt(j) == 'a') {
					cont_a++;
				} else if (linea.charAt(j) == 'R' || linea.charAt(j) == 'r') {
					cont_r++;
				} else if (linea.charAt(j) == 'G' || linea.charAt(j) == 'g') {
					cont_g++;
				} else if (linea.charAt(j) == 'I' || linea.charAt(j) == 'i') {
					cont_i++;
				} else if (linea.charAt(j) == 'T' || linea.charAt(j) == 't') {
					cont_t++;
				}
			}
			
			//contabilizar el minimo
			int min = Math.min(cont_m, Math.min(cont_a/3, Math.min(cont_r/2, 
					Math.min(cont_g,Math.min(cont_i,cont_t)))));
			System.out.println(min);
		}

	}

}
