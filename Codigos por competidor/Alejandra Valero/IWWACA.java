import java.math.BigInteger;
import java.util.Scanner;

public class IWWACA {

	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			  BigInteger num1 = sc.nextBigInteger();
			  String signo = sc.nextLine();
              signo.charAt(0);
              String nSigno = signo;
			  BigInteger num2 = sc.nextBigInteger();;
			  //BigInteger num2 = sc.nextBigInteger();
			  if (nSigno.compareTo("/") == 0) {
				  System.out.println(num1.divide(num2));
			  } else if (nSigno.compareTo("%") == 0) {
				  System.out.println(num1.mod(num2));
			}
	    }
	}
}
