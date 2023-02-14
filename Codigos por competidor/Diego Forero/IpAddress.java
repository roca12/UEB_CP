package ClasificaroriaNacional;

import java.util.Scanner;

public class IpAddress {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		sc.nextLine();
		
		for (int i = 0; i < t; i++) {
			String[] dec = sc.nextLine().split("\\.");
			String[] bin = sc.nextLine().split("\\.");
			boolean val = false;
			
			for (int j = 0; j < bin.length; j++) {
				int potencia = 0, decimal = 0;
				for (int k = bin[j].length()-1; k >= 0; k--) {
					int expo = (int) Math.pow(2, potencia);
					int auxnum = Integer.parseInt(bin[j].charAt(k)+"");
					decimal += auxnum * expo;
					potencia++;
				}
				if (dec[j].equals(""+decimal)) {
					val = true;
				} else {
					val = false;
					break;
				}
			}
			
			if (val == true) System.out.println("Case "+(i+1)+": Yes");
			else System.out.println("Case "+(i+1)+": No");
			
			
		}
	}
}
