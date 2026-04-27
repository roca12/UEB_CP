
import java.math.BigInteger;
import java.util.Scanner;

public class If_We_Were_A_Child {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		while(sc.hasNext()) {
			String a= sc.nextLine();
			String[]c = a.split(" ");
			BigInteger n1= new BigInteger(c[0]), n2= new BigInteger(c[2]);
			if(c[1].equals("/")) {
				System.out.println(n1.divide(n2));
			}else {
				System.out.println(n1.mod(n2));
			}
		}
	}
}
