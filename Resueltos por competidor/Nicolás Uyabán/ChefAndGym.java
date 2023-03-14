package CODECHEF;
import java.util.*;
import java.lang.*;
import java.io.*;
public class ChefAndGym {
	
		public static void main (String[] args) throws java.lang.Exception
		{
			Scanner sc = new Scanner (System.in);
			
			int n = sc.nextInt();
			
			for (int i = 0; i < n; i++ ){
			    
			    int x = sc.nextInt();
			    int y = sc.nextInt();
			    int z = sc.nextInt();
			    
			    if(z>=x+y) {
			    	System.out.println("2");
			    	
			    }
			    else if(z<x+y && z>x) {
			    	
			    	System.out.println("1");
			    	
			    }
			    else if(z<x+y && z<x) {
			    	
			    	System.out.println("0");
			    }
			    
			}
		
	}

}
