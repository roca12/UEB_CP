package CodeChef;

import java.util.Scanner;

public class Balloon_Splash {

	public static void main(String[] args) {
		{
		    Scanner sc = new Scanner(System.in);
		    int X = sc.nextInt();
		    int Y = sc.nextInt();
		    
		    if (X==Y){
		        System.out.print("Draw");
		    }
		    else if(X>Y){
		        System.out.print("Alice");
		    }
		    else{
		        System.out.print("Bob");
		        
		    }

		}
	}

}