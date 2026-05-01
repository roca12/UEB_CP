import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class Main {
    
    /*
	 * Autor: Carlos Eduardo Cobaleda Moreno
	 * Problema: Circle in Square
	 * Juez online: LightOJ
	 * Veredicto: Accepted
	 * URL: https://lightoj.com/problem/circle-in-square
	 */
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		DecimalFormat df = new DecimalFormat("0.00");
		
		int t = Integer.parseInt(br.readLine());
		for (int i = 0; i < t; i++) {
			
			float r = Float.parseFloat(br.readLine());
			float l = r*2;
			float acu = l*l;
			float pi = (float) (2 * Math.acos(0.0));
			float aci = pi * (r*r);
			float as = acu - aci;
            int in = i+1;
			
			System.out.println("Case " + in + ": " + df.format(as));
			
			
		}
		
		
		
		
	}

}
