package CodeChef;

import java.util.Scanner;

public class Popcorn_Buying {

	public static void main(String[] args) {
		{
		    Scanner sc = new Scanner (System.in);
		    int X = sc.nextInt();
		    
		    int count = 0;

		    X = X-100;
		    
		        while(X>=50){
		            X = X-50;
		            count = count+1;
		        }
		    System.out.println(count);
		}
	}
}
