package Clasificatorio;

import java.math.BigInteger;
import java.util.Scanner;

public class Operations {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()) {
			BigInteger n1 = sc.nextBigInteger();
			String s = sc.next();
			BigInteger n2 = sc.nextBigInteger();
			
			if(s.equals("/")) {
				System.out.println(n1.divide(n2));
			}else {
				System.out.println(n1.mod(n2));
			}
		}
	}
}
