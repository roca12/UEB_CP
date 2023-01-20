import java.math.BigInteger;
import java.util.Scanner;

public class ProblemAC {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BigInteger primero;
		BigInteger segundo;
		BigInteger resultado;
		
		while (sc.hasNext()) {
			primero = sc.nextBigInteger();
			String operacion = sc.next();
			segundo = sc.nextBigInteger();
			
			
			switch (operacion) {
			case "+": {
				resultado = primero.add(segundo);
				System.out.println(resultado);
				break;
			}
			case "-": {
				resultado = primero.subtract(segundo);
				System.out.println(resultado);
				break;
			}
			case "*": {
				resultado = primero.multiply(segundo);
				System.out.println(resultado);
				break;
			}
			case "/": {
				resultado = primero.divide(segundo);
				System.out.println(resultado);
				break;
			}
			case "%": {
				resultado = primero.mod(segundo);
				System.out.println(resultado);
				break;
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + operacion);
			}
		}	
	}
}
