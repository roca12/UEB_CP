import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc = new Scanner(System.in);
	    int T = sc.nextInt();
	    
	    while(T-- > 0){
	        int N = sc.nextInt();
	        int A = sc.nextInt();
	        int B = sc.nextInt();
	        
	        int total = 360 + 2 * N;
	        int duracion = total - (A+B);
	        System.out.println(duracion);
	    }
	}
}
