package init2;

import java.math.BigInteger;
import java.util.Scanner;

public class VeryLong {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		BigInteger suma = new BigInteger("0");
		while(true) {
			BigInteger leer = sc.nextBigInteger();
			if(leer.equals(new BigInteger("0"))) break;
			suma = suma.add(leer);
		}
		System.out.println(suma);
	}
}
