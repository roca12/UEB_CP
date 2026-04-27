package CompDom;

import java.math.BigInteger;
import java.util.Scanner;

public class IfWeWereAChildAgain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			BigInteger num1 = sc.nextBigInteger();
			String op = sc.next();
			BigInteger num2 = sc.nextBigInteger();
			if (op.equals("/")) {
				System.out.println(num1.divide(num2));
			} else if (op.equals("%")) {
				System.out.println(num1.mod(num2));
			}
		}
	}

}
