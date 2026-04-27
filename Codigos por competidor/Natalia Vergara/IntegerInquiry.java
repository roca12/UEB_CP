import java.math.BigInteger;
import java.util.Scanner;

public class IntegerInquiry {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int c = 1;
		BigInteger result = BigInteger.ZERO, a;
		while (sc.hasNext() && c != 0) {
			a = sc.nextBigInteger();
			c = a.intValue();
			if (c != 0) {
				result = result.add(a);
			}
			if (c == 0) {
				System.out.println(result);
			}
		}
	}
}