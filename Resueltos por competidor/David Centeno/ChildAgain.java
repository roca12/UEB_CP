package domjudgev2;

import java.math.BigInteger;

import java.util.Scanner;
public class MainAC {
//If We Were a Child Again
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);  
	       while(sc.hasNext()){
	       	BigInteger a=sc.nextBigInteger();
	       	String s=sc.next();
	       	BigInteger b=sc.nextBigInteger();
	        if (s.equals("/")) {
	       		System.out.println(a.divide(b));
			} else {
				System.out.println(a.mod(b));
			}
	        	

	}
	}	
}