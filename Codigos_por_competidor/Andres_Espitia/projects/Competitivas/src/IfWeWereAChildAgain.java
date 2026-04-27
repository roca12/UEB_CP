import java.math.BigInteger;
import java.util.Scanner;

public class IfWeWereAChildAgain {
	
	public static void main(String[] args) {
		BigInteger n1, n2;
		String op;
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()) {
			n1 = sc.nextBigInteger();
			op = sc.next();
			n2 = sc.nextBigInteger();
			
			if(op.equals("/")) {
				System.out.println(n1.divide(n2));
			}else if(op.equals("%")) {
				System.out.println(n1.mod(n2));
			}
		}
	}
}
