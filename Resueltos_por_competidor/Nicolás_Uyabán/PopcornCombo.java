package CODECHEF;
import java.util.*;
import java.lang.*;
import java.io.*;

public class PopcornCombo {

	public static void main (String[] args) throws java.lang.Exception
	{
	
		Scanner sc = new Scanner(System.in);
		
		
		int n = sc.nextInt();
		
		
		for(int i = 0; i < n ; i++) {
			
			int a1 = sc.nextInt();
			int a2 = sc.nextInt();
			int b1 = sc.nextInt();
			int b2 = sc.nextInt();
			int c1 = sc.nextInt();
			int c2 = sc.nextInt();
			
			if (a1+a2 > b1+b2 && a1+a2 > c1+c2) {
				
				System.out.println(a1+a2);
			}
			else if(b1+b2 > a1+a2 && b1+b2 > c1+c2) {
				
				System.out.println(b1+b2);
			}
			
			else {
				System.out.println(c1+c2);
			}
		}
		
		
	}	
	
}
