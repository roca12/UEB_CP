import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNext()) {
			String numero = sc.nextLine();
			System.out.println(numero);
			if (numero.contains("+")) {
				String num1 = numero.substring(0, numero.indexOf('+')-1);
				primero(num1);
				String num2 = numero.substring(numero.indexOf('+')+2, numero.length());
				segundo(num2);
				suma(num1, num2);
				
			} else if (numero.contains("*")) {
				String num1 = numero.substring(0, numero.indexOf('*')-1);
				primero(num1);
				String num2 = numero.substring(numero.indexOf('*')+2, numero.length());
				segundo(num2);
				multi(num1, num2);
			}
			
			
		}
		
	}
	
	public static void primero(String aux) {
		BigInteger num = new BigInteger(aux);
		String max = Integer.MAX_VALUE + "";
		BigInteger num2 = new BigInteger(max);
		if (num.compareTo(num2) == 1) {
			System.out.println("first number too big");
		}	
	}
	
	public static void segundo(String aux) {
		BigInteger num = new BigInteger(aux);
		String max = Integer.MAX_VALUE + "";
		BigInteger num2 = new BigInteger(max);
		if (num.compareTo(num2) == 1) {
			System.out.println("second number too big");
		}
	}
	
	public static void suma(String aux, String aux2) {
		BigInteger num1 = new BigInteger(aux);
		BigInteger num2 = new BigInteger(aux2);
		String max = Integer.MAX_VALUE + "";
		BigInteger tope = new BigInteger(max);
		BigInteger suma = new BigInteger("0");
		suma = num1.add(num2);
		if (suma.compareTo(tope) == 1) {
			System.out.println("result too big");
		}
	}
	
	public static void multi(String aux, String aux2) {
		BigInteger num1 = new BigInteger(aux);
		BigInteger num2 = new BigInteger(aux2);
		String max = Integer.MAX_VALUE + "";
		BigInteger tope = new BigInteger(max);
		BigInteger suma = new BigInteger("0");
		suma = num1.multiply(num2);
		if (suma.compareTo(tope) == 1) {
			System.out.println("result too big");
		}
	}
	
}