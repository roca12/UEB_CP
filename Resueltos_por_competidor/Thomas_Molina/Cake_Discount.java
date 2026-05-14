package CodeChef;

import java.util.Scanner;

public class Cake_Discount {

	public static void main(String[] args) {
		{
		    Scanner sc = new Scanner(System.in);
		    int N = sc.nextInt();
		    int resultado = 0;
		    
		    if (N>=5){
		        resultado = N*85;
		        System.out.print(resultado);
		    }
		    else{
		        resultado = N*100;
		        System.out.print(resultado);
		    }

		}
	}
}