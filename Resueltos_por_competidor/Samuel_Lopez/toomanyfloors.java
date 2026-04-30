
import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args){

		int T = sc.nextInt();
		int pisos = 10;

		
		for (int i = 0; i < T; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			
			x = (x - 1) / pisos;
			y = (y - 1)/ pisos;
			
			int recorrido = Math.abs(x - y);
		
			System.out.println(recorrido);
		}		
	}

}
