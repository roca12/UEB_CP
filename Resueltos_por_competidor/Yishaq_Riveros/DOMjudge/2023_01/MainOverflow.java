package co.edu.unbosque;
import java.math.BigInteger;
import java.util.Scanner;

public class MainOverflow {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	        while (scanner.hasNext()) {
	            BigInteger a = scanner.nextBigInteger();
	            String operator = scanner.next();
	            BigInteger b = scanner.nextBigInteger();
	            System.out.println(a + " " + operator + " " + b);

	            boolean aTooBig = a.compareTo(BigInteger.valueOf(Integer.MAX_VALUE)) > 0;
	            boolean bTooBig = b.compareTo(BigInteger.valueOf(Integer.MAX_VALUE)) > 0;
	            BigInteger result = null;
	            if (operator.equals("+")) {
	                result = a.add(b);
	            } else if (operator.equals("*")) {
	                result = a.multiply(b);
	            }
	            boolean resultTooBig = result != null && result.compareTo(BigInteger.valueOf(Integer.MAX_VALUE)) > 0;

	            if (aTooBig) {
	                System.out.println("first number too big");
	            }
	            if (bTooBig) {
	                System.out.println("second number too big");
	            }
	            if (resultTooBig) {
	                System.out.println("result too big");
	          }
	      }
	  }
}

