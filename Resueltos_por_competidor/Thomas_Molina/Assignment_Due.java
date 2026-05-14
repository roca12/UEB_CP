package CodeChef;

import java.util.Scanner;

public class Assignment_Due {

	public static void main(String[] args) {
		{
		    Scanner sc = new Scanner(System.in);
		    
		    int X = sc.nextInt();
		    int Y = sc.nextInt();
		    
		    if (X==Y){
		        System.out.print("YES");
		    }
		    else if(X<Y){
		         System.out.print("YES");
		    }
		    else{
		         System.out.print("NO");
		    }

		}
	}
}