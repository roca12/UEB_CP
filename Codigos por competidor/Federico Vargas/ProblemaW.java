package Problemas;

import java.math.BigDecimal;
import java.util.Scanner;

public class ProblemaW {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BigDecimal R;
		int n;
		BigDecimal resultado;
		
		while(sc.hasNext()) {
			R = sc.nextBigDecimal();
			n = sc.nextInt();
			resultado = R.pow(n).stripTrailingZeros();
			String resultadoString = resultado.toPlainString();
			if (resultadoString.charAt(0) == '0') {
				System.out.println(resultadoString.replaceFirst("^0+(?!$)", ""));
			}else {
				System.out.println(resultadoString);
			}
		}
	}
}
