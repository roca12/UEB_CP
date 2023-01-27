import java.math.BigInteger;
import java.util.Scanner;

//If We Were a Child Again
public class Pruebas3000 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			String a = sc.nextLine();
			a = a.replaceAll(" ", "");
			if (a.contains("/")) {
				String[] b = a.split("/", 2);
				BigInteger num1 = new BigInteger(b[0], 10);
				BigInteger num2 = new BigInteger(b[1], 10);
				System.out.println(num1.divide(num2));
			} else {
				String[] b = a.split("%", 2);
				BigInteger num1 = new BigInteger(b[0], 10);
				BigInteger num2 = new BigInteger(b[1], 10);
				System.out.println(num1.mod(num2));
			}
		}
	}
}