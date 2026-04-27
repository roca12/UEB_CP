package CompSolitario;

import java.util.Scanner;

public class SecretOrigins {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int i = 0; i < t; i++) {
			int n = sc.nextInt();
			String binario = Integer.toBinaryString(n);
			String bin2 = "";
			int auxn = n;
			int n_onoroy = 0;
			int nextonoroy = 0;
			
			for (int j = 0; j < binario.length(); j++) {
				if (binario.charAt(j) == '1') {
					n_onoroy++;
				}
			}
			while (n_onoroy != nextonoroy) {
				nextonoroy = 0;
				auxn++;
				bin2 = Integer.toBinaryString(auxn);
				for (int j = 0; j < bin2.length(); j++) {
					if (bin2.charAt(j) == '1') {
						nextonoroy++;
					}
				}
			}
			System.out.println("Case " + (i+1) + ": " + auxn);
		}
	}

}
