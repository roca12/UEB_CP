import java.math.BigInteger;
import java.util.Scanner;

public class MainIfWeWereaChildAgain {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		while (sc.hasNext()) {
			BigInteger a,b;
			a=sc.nextBigInteger();
			String s=sc.next();
			b=sc.nextBigInteger();
			if(s.equals("%")) {
				System.out.println(a.mod(b));
			}else {
				System.out.println(a.divide(b));
			}
		}
	}
}
