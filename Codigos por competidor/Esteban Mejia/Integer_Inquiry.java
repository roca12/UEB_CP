
import java.math.BigInteger;
import java.util.Scanner;

public class Integer_Inquiry {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		BigInteger a=BigInteger.ZERO,b;
		while(sc.hasNext()) {
			b=sc.nextBigInteger();
			a=a.add(b);
			if(b.compareTo(BigInteger.valueOf(0))==0) {
				break;
			}
		}
		System.out.println(a);
	}

}

