
import java.math.BigInteger;
import java.util.Scanner;

public class Overflow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger a,b;
        String s, division[],operacion;
        while(sc.hasNext()) {
        	s=sc.nextLine();
        	division=s.split(" ");
        	a=new BigInteger(division[0]);
        	operacion=division[1];
        	b=new BigInteger(division[2]);
        	System.out.println(s);
        	if(a.compareTo(new BigInteger(Integer.toString(Integer.MAX_VALUE)))>0) {
        		System.out.println("first number too big");
        	}
        	if(b.compareTo(new BigInteger(Integer.toString(Integer.MAX_VALUE)))>0) {
        		System.out.println("second number too big");
        	}
        	if((operacion.equals("+")&&a.add(b).compareTo(new BigInteger(Integer.toString(Integer.MAX_VALUE)))>0)||
        	(operacion.equals("*")&&a.multiply(b).compareTo(new BigInteger(Integer.toString(Integer.MAX_VALUE)))>0)){
        		System.out.println("result too big");
        	}
        }
        
        
    }
}







