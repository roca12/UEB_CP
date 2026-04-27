import java.math.BigInteger;
import java.util.Scanner;

public class IntegerInqury {
	
	public static void main(String[] args) {
		BigInteger n1, n2 = new BigInteger("00000000");
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			n1 = sc.nextBigInteger();
			if(n1.equals(new BigInteger("0"))) break;
			n2 = n2.add(n1);
		}
		System.out.println(n2);
	}
}
