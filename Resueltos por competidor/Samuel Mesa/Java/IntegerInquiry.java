
import java.math.BigInteger;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		BigInteger a = BigInteger.ZERO;

		while (true) {
			String aux = sc.next();
			if (aux.equals("0")) {
				break;
			}
			a = a.add(new BigInteger(aux));
		}
		System.out.println(a);
	}
}