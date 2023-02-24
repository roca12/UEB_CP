package init2;





import java.math.BigInteger;
import java.util.Scanner;

public class Overflow {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BigInteger num1, num2;
		String leer, dividir[], op;
		while(sc.hasNext()) {
			leer = sc.nextLine();
			dividir = leer.split(" ");
			
			
			num1 = new BigInteger(dividir[0]);
			op = dividir[1];
			num2 = new BigInteger(dividir[2]);
			
			System.out.println(leer);
			
			if(num1.compareTo(new BigInteger(Integer.toString(Integer.MAX_VALUE))) > 0) {
				System.out.println("first number too big");
			}
			
			if(num2.compareTo(new BigInteger(Integer.toString(Integer.MAX_VALUE))) > 0){
				System.out.println("second number too big");
			}
			
			if( (op.equals("+") && num1.add(num2).compareTo(new BigInteger(Integer.toString(Integer.MAX_VALUE))) > 0) || (op.equals("*") && num1.multiply(num2).compareTo(new BigInteger(Integer.toString(Integer.MAX_VALUE))) > 0)){
				System.out.println("result too big");
			}
		
		}
	}
}
