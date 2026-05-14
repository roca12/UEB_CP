package CodeChef;

import java.util.Scanner;

public class Vacation_Excitement {

	public static void main(String[] args) {
		{
		    Scanner sc = new Scanner(System.in);
		    int X = sc.nextInt();
		    int Y = sc.nextInt();
		    int nivel = 0;
		    
		    for (int i = 0; i<X;i++){
		        nivel = Y+i;
		    }
		    System.out.print(nivel);
		}
	}
}