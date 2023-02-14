import java.math.BigInteger;
import java.util.Scanner;

public class MainIntegerInquiry {

	public static void main(String[] args) {
		BigInteger sum = new BigInteger("0"), current;
        String x;

        Scanner sc = new Scanner (System.in);
    //    BufferedReader inputHandler = new BufferedReader(new InputStreamReader(System.in));

        try {
            x = sc.nextLine();
            while (!x.equals("0")) {
                current = new BigInteger(x);
                
                sum = sum.add(current);
                x =sc.nextLine();
            }
        } catch (Exception e) {
         
        }
        
        System.out.println(sum.toString());
	}
}
