import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int pot;
		while (sc.hasNext()) {
			String str = sc.nextLine();
			String numero = str.substring(0, str.indexOf(' '));
			String potencia = str.substring(str.indexOf(' ') + 1, str.length());
			if (potencia.charAt(0) == ' ') {
				pot = Integer.parseInt(potencia.substring(1));
			} else {
				pot = Integer.parseInt(potencia);
			}
			
			for (int j = numero.length()-1; j > 0; j--) {
				if (numero.charAt(j) == '0') {
					numero = numero.substring(0, j);
				} else {
					break;
				}
			}
			BigDecimal num = new BigDecimal(numero);
			num = num.pow(pot);
			String terminar = num.toPlainString();
			
			if (terminar.charAt(0) == '0' && terminar.length() != 1) {
				terminar = terminar.substring(1,terminar.length());
			}
			
			System.out.println(terminar);
			
		}
	}
}