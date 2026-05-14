import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        while (T-- > 0) {
            String num = sc.next();
            int contar = 0;
            
            for (int i = 0; i < num.length(); i++) {
                if (num.charAt(i) == '4') {
                    contar++;
                }
            }
            
            System.out.println(contar);
        }
	}
}
