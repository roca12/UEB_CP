import java.math.BigInteger;
import java.util.Scanner;

public class IntegerProb {

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		BigInteger entrada= sc.nextBigInteger();
		BigInteger resultado= new BigInteger("0");
		while(!entrada.equals(BigInteger.ZERO)) {
			resultado=resultado.add(entrada);
			entrada= sc.nextBigInteger();
		}
		System.out.println(resultado);
	}

}
