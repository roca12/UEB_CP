package CodeChef;

import java.util.Scanner;

public class Exercise_and_Rest {

	public static void main(String[] args) {
		{
		    Scanner sc = new Scanner(System.in);
		    int N = sc.nextInt();
		    int dias = 0;
		    
		    for (int i= 0; i<N;i++){
		        dias= dias +3;
		    }
		    System.out.print(dias);
		}
	}
}