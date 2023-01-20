import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			String numero = sc.nextLine();
			if (numero.contains("/")) {
				BigInteger num1 = new BigInteger(numero.substring(0, numero.indexOf('/')-1));
				BigInteger num2 = new BigInteger(numero.substring(numero.indexOf('/')+2, numero.length()));
				System.out.println(num1.divide(num2));
			} else if (numero.contains("%")) {
				BigInteger num1 = new BigInteger(numero.substring(0, numero.indexOf('%')-1));
				BigInteger num2 = new BigInteger(numero.substring(numero.indexOf('%')+2, numero.length()));
				System.out.println(num1.remainder(num2));
			}
		}
		
	}

}